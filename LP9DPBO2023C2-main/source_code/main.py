# Import Library
from apartemen import Apartemen
from rumah import Rumah
from indekos import Indekos
from tkinter import *
from PIL import ImageTk, Image

# Load/set the data
hunians = []
hunians.append(Apartemen("Nelly Joy", "Jln. Setiabudhi No. 47", "2020", 3, 3))
hunians.append(Rumah("Sekar MK", "2019", "Jln. Gegerkalong Girang No. 28", 5, 2))
hunians.append(Indekos("Bp. Romi", "Cahya", "2020", "Rp. 1.500.000 ,- /thn", "Jln. Ciwaruga No. 229"))
hunians.append(Rumah("Satria", "2018", "Jln. Cibiru Raya", 1, 4))

# Load Root
root = Tk()
root.title("Praktikum DPBO Python")
pict_images = []

# Var untuk load data_detail (img, label, frame, button)
label = None; frame_pict = None;
img_label = None; button = None;

# Details data residen
def details(index):
    top = Toplevel()
    top.title("Detail " + hunians[index].get_jenis())

    d_frame = LabelFrame(top, text="Data Detail Residen", padx=10, pady=10)
    d_frame.pack(padx=10, pady=10)

    d_summary = Label(d_frame, text="Summary\n" + hunians[index].get_detail() + hunians[index].get_summary() + hunians[index].get_dokumen(), anchor="w", justify=LEFT).grid(row=0, column=0, sticky="w")

    btn = LabelFrame(top, padx=0, pady=0)
    btn.pack(padx=10, pady=10)
    b_close = Button(btn, text="Close", command=top.destroy)
    b_close.grid(row=0, column=0)
    
    # Load the picture
    img = Image.open("assets/" + hunians[index].get_picture()) 
    img = img.resize((200, 200)) 
    photo_img = ImageTk.PhotoImage(img)
    pict_images.append(photo_img)
    img_label = Label(d_frame, image=photo_img)
    img_label.grid(row=1, column=0)


def data_detail():
    # Delete all component
    # Check first, apakah var tersebut sudah dibuat/dibangun sebelumnya ?
    if label:
        label.destroy()
    if frame_pict:
        frame_pict.destroy()
    if img_label:
        img_label.destroy()
    if button:
        button.destroy()

    # Header Image
    img_headers = Image.open("assets/pict5pbo.jpg")
    img_headers = img_headers.resize((450, 200))
    photo_img_headers = ImageTk.PhotoImage(img_headers)
    pict_images.append(photo_img_headers)
    frame_pict_header = Frame(root, padx=10, pady=10)
    frame_pict_header.pack(padx=10, pady=10)

    img_label_header = Label(frame_pict_header, image=photo_img_headers)
    img_label_header.pack()


    frame = LabelFrame(root, text="Data Seluruh Residen", padx=10, pady=10)
    frame.pack(padx=10, pady=10)

    opts = LabelFrame(root, padx=10, pady=10)
    opts.pack(padx=10, pady=10)

    b_add = Button(opts, text="Add Data", state="disabled")
    b_add.grid(row=0, column=0)

    b_exit = Button(opts, text="Exit", command=root.quit)
    b_exit.grid(row=0, column=1)

    for index, h in enumerate(hunians):
        idx = Label(frame, text=str(index+1), width=5, borderwidth=1, relief="solid")
        idx.grid(row=index, column=0)

        type = Label(frame, text=h.get_jenis(), width=15, borderwidth=1, relief="solid")
        type.grid(row=index, column=1)

        if h.get_jenis() != "Indekos": 
            name = Label(frame, text=" " + h.get_nama_pemilik(), width=40, borderwidth=1, relief="solid", anchor="w")
            name.grid(row=index, column=2)
        else:
            name = Label(frame, text=" " + h.get_nama_penghuni(), width=40, borderwidth=1, relief="solid", anchor="w")
            name.grid(row=index, column=2)

        b_detail = Button(frame, text="Details ", command=lambda index=index: details(index))
        b_detail.grid(row=index, column=3)


def landing_page_home():
    # parse data from var global
    global label, frame_pict, img_label, button
    # label nya
    label = Label(root, text="Welcome to the Raisyad LP", font=('Arial', 10))
    label.pack()

    # setting foto
    img = Image.open("assets/pict4pbo.jpg")
    img = img.resize((200, 200))
    photo_img = ImageTk.PhotoImage(img)
    pict_images.append(photo_img)
    frame_pict = Frame(root, padx=10, pady=10)
    frame_pict.pack(padx=10, pady=10)

    img_label = Label(frame_pict, image=photo_img)
    img_label.pack()

    # button menuju halaman detail
    button = Button(root, text='Adventure', font=('Arial', 11), command=data_detail)
    button.pack(side=BOTTOM, padx=0, pady=50)


# Call the functions
landing_page_home()

# Call the root
root.mainloop()