# Saya Raisyad Jullfikar NIM 2106238 mengerjakan Latihan 2 
# dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
# keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

# Import file or class + Library
from Mahasiswa import Mahasiswa as Mhs
import os

# Class CR disini digunakan untuk melakukan proses input dan read data
# Create and Read

class CR :
  # Constructor 
  def __init__(self):
    pass
  
  # Method untuk menginputkan data
  def Create (Data) :
    flag = False # Default value
    
    # Input data Nik
    print("Input Data NIK:")
    nik = str(input())
    
    # Input data Name
    print("Input Data Name:")
    name = str(input())

    # Input data Jenis Kelamin
    print("Input Data Jenis Kelamin/Gender:")
    jenis_kelamin = str(input())

    # Input data Asal Universitas
    print("Input Data Asal Universitas:")
    asal_univ = str(input())

    # Input data Email
    print("Input Data Email:")
    email_edu = str(input())

    # Input data Nim
    print("Input Data NIM:")
    nim = str(input())

    # Input data Prodi
    print("Input Data Prodi:")
    prodi = str(input())

    # Input data Fakultas
    print("Input Data Fakultas:")
    fakultas = str(input())

    # Proses Pengecekan data
    for D in Data :
      if(D.get_nik() == nik) : # Jika data yang ingin diinput sudah ada maka set flag menjadi true
        flag = True
    
    if (flag == True) : # Jika data sudah ada
      os.system('cls') # Clean Screen
      print("\n======================\nData sudah ada dan tidak berhasil diinputkan\n======================")
    else : # Jika data belum ada
      Data.append(Mhs(nik,name,jenis_kelamin,asal_univ,email_edu,nim,fakultas,prodi))
      os.system('cls') # Clean Screen
      print("\n======================\nData belum ada dan berhasil diinputkan\n======================\n")
    
  # Method untuk read/show/view the data
  def Read (Data):
    i = 1
    count = 0
    # Proses Pengecekan data
    for D in Data :
      count += 1
    
    if (count == 0) : # Jika belum ada sama sekali data yang diinputkan
      os.system('cls') # Clean Screen
      print("\n======================\nData belum ada yang diinputkan\n======================\n")
    else : # Jika data sudah ada yang diinputkan
      os.system('cls') # Clean Screen
      print ("Data yang telah diinputkan adalah sebagai berikut :\n")
      for D in Data :
        print (str(i) + ". |", 
              D.get_nik(), "|",
              D.get_name(), "|",
              D.get_jkelamin(), "|",
              D.get_auniv(), "|",
              D.get_email(), "|",
              D.get_nim(), "|",
              D.get_prodi(), "|",
              D.get_fakultas(), "|")
        i += 1
      print("\n")
