# Import Library + Import File
from Mahasiswa import Mahasiswa as Mhs
import os

# Class Crud yang berisi data list dari class mahasiswa yang akan
# digunakan untuk memodifikasi data list tsb, seperti
# Create, Read/Show, Update, Delete
class Crud :
  # Deklar Var private attr
  __name = ""
  __nim = ""
  __jurusan = ""
  __fakultas = ""
  
  # CONSTRUCTOR
  # Constructor kosong yang mengisi valuenya dengan default value atau string kosong
  def __init__ (self, nim = "", name = "", jurusan = "", fakultas = "") :
    self.__nim = nim
    self.__name = name
    self.__jurusan = jurusan
    self.__fakultas = fakultas
  
  # Method untuk create data
  def Create (DataMhs) :
    flag = 0
    print ("Input Data Name: ")
    name = str(input())
    print ("Input Data NIM: ")
    nim = str(input())
    print ("Input Data Jurusan: ")
    jurusan = str(input())
    print ("Input Data Fakultas: ")
    fakultas = str(input())

    # Data yang sudah ada didalam list dicek, jika ada nim yang sama, maka data tidak bisa diinputkan
    for DMhs in DataMhs :
      if (nim == DMhs.get_nim()) :
        flag = 1;
        
    if (flag == 1) : # Ketika Data yang diinputkan sudah ada 
      os.system('cls')
      print("\n======================\nData sudah ada dan tidak berhasil diinputkan\n======================\n")
    elif (flag == 0) : # Ketika Data yang diinputkan belum ada
      DataMhs.append(Mhs(nim,name,jurusan,fakultas))
      os.system('cls')
      print("\n======================\nData belum ada dan berhasil diinputkan\n======================\n")
  
  # Method untuk read/show/view data
  def Read (DataMhs) :
    i = 0 
    count = 0
    for DMhs in DataMhs :
      if (count == 0) :
        print('No. {}|Name {:s}|NIM {:s}|Fakultas {:s}|Jurusan {:s}|'.format('', '', '', '', ''))
      count += 1
      print(str(i + 1) + ". |", DMhs.get_name(), "|", DMhs.get_nim(), "|", DMhs.get_jurusan(), "|", DMhs.get_fakultas(), "|")
      i += 1
  
  # Method untuk update data
  def Update (DataMhs) :
    flag = 0 # Set default
    # Input data yang akan diubah
    print("Input Data NIM yang akan diubah: ")
    nimSearch = str(input())
    for DMhs in DataMhs :
      # Jika data tsb ada, maka pilih menu kembali
      if (nimSearch == DMhs.get_nim()) :
        print("\nPilih Menu Update\n1. Update Nama\n2. Update Jurusan\n3. Update Fakultas\n4. Update Semua")
        menuUpdate = int(input())
        if (menuUpdate == 1) : # Menu 1 Untuk mengubah nama saja
          print ("Input Data Name: ")
          name = str(input())
          DMhs.set_name(name)
          
          flag = 1 # Penanda sudah terjadi update
          os.system('cls')
          print("\n=================\nData berhasil diUpdate\n=================\n")
        elif (menuUpdate == 2) : # Menu 2 Untuk mengubah jurusan saja
          print ("Input Data Jurusan: ")
          jurusan = str(input())
          DMhs.set_jurusan(jurusan)
          
          flag = 1 # Penanda sudah terjadi update
          os.system('cls')
          print("\n=================\nData berhasil diUpdate\n=================\n")
        elif (menuUpdate == 3) : # Menu 3 Untuk mengubah fakultas saja
          print ("Input Data Fakultas: ")
          fakultas = str(input())
          
          DMhs.set_fakultas(fakultas)
          flag = 1 # Penanda sudah terjadi update
          os.system('cls')
          print("\n=================\nData berhasil diUpdate\n=================\n")
        elif (menuUpdate == 4) : # Menu 4 Untuk mengubah keseluruhan data
          print ("Input Data Name: ")
          name = str(input())
          print ("Input Data NIM: ")
          nim = str(input())
          print ("Input Data Jurusan: ")
          jurusan = str(input())
          print ("Input Data Fakultas: ")
          fakultas = str(input())
          
          DMhs.set_nim(nim)
          DMhs.set_name(name)
          DMhs.set_jurusan(jurusan)
          DMhs.set_fakultas(fakultas)
          
          flag = 1 # Penanda sudah terjadi update
          os.system('cls')
          print("\n=================\nData berhasil diUpdate\n=================\n")
        else : # Jika tidak memilih menu yang tersedia
          os.system('cls')
          print("\nTidak ada dimenu, silahkan pilih kembali nanti ^_^")

    if (flag == 0) : # Jika belum terjadi update atau nim yang dicari tidak ada
      os.system('cls')
      print("NIM yang anda cari tidak ada\n")
        
  # Method untuk delete data
  def Delete (DataMhs) :
    flag = 0 # set default
    # Input data yang akan dihapus
    print("Input Data NIM yang akan dihapus: ")
    nimSearch = str(input())
    for DMhs in DataMhs :
      if (nimSearch == DMhs.get_nim()) : # Jika data yang akan dihapus ada, maka lakukan delete
        DataMhs.remove(DMhs)
        os.system('cls')
        print("\n=================\nData berhasil diDelete\n=================\n\n")
        flag = 1 # Penanda telah terjadi penghapusan data
    
    if (flag == 0) : # Jika belum terjadi penghapusan data atau nim yang dicari tidak ada
      os.system('cls')
      print("\n=================\nNIM yang anda cari tidak ada\n=================\n\n")