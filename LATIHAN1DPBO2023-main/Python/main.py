# Saya Raisyad Jullfikar NIM 2106238 mengerjakan Latihan 1 dalam mata kuliah Desain dan Pemrograman Berorientasi 
# Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

# import file
from Crud import Crud as Crd

DataMhs = [] # list untuk menampung objek
flag = True; # Penanda Loop

while (flag) : # Jika flag True, maka loop berjalan
  print("Daftar Menu Program\n1. Input\n2. Update\n3. Delete\n4. Show Data\nOther Number. Exit Program")
  n = int(input()) # Input Menu
  if (n > 0 and n <= 4) : # Jika Menu 1 - 4
    if (n == 1) : # Menu pertama (1) -> Membuat Data / Create
      Crd.Create(DataMhs)
    elif (n == 2) : # Menu kedua (2) -> Mengupdate / Mengubah Data yang sudah ada
      Crd.Update(DataMhs)
    elif (n == 3) : # Menu ketiga (3) -> Mengdelete / Menghapus Data yang sudah ada
      Crd.Delete(DataMhs)
    elif (n == 4) : # Menu keempat (4) -> Meread / Menampilkan Data yang sudah ada
      Crd.Read(DataMhs)
  else : # Jika menginput menu selain menu diatas, loop akan berhenti
    flag = False