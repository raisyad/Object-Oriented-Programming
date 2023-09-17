# Saya Raisyad Jullfikar NIM 2106238 mengerjakan Latihan 2 
# dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
# keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

from CR import CR as cr

Data = [] # list untuk menampung objek
flag = True; # Penanda Loop

while (flag) : # Jika flag True, maka loop berjalan
  print("Daftar Menu Program\n1. Input\n2. Show Data\nOther Number. Exit Program")
  n = int(input()) # Input Menu
  if (n == 1) : # Menu pertama (1) -> Membuat Data / Create
    cr.Create(Data) # Call Function Create
  elif (n == 2) : # Menu keempat (2) -> Meread / Menampilkan Data yang sudah ada
    cr.Read(Data) # Call Function Read
  else : # Jika menginput menu selain menu diatas, loop akan berhenti
    flag = False; # Set false value
