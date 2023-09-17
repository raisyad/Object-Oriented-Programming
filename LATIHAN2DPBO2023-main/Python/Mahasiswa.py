# Saya Raisyad Jullfikar NIM 2106238 mengerjakan Latihan 2 
# dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
# keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

# Import Class SivitasAkademik
from SivitasAkademik import *

# Class Mahasiswa yang merupakan anak dari class SivitasAkademik
# Merupakan class yang berisikan data - data mahasiswa pada umumnya
# Seperti Nim, Fakultas, dan Prodi

class Mahasiswa(SivitasAkademik) :
  # Deklar private attr
  __NIM = ""
  __fakultas = ""
  __prodi = ""
  
  # CONSTRUCTOR
  # Constructor kosong yang mengisi valuenya dengan default value atau string kosong
  def __init__ (self, NIK, name, jenis_kelamin, asal_universitas, email_edu, NIM = "", fakultas = "", prodi = "") :
    super().__init__(NIK,name,jenis_kelamin,asal_universitas,email_edu)
    # Fungsi super untuk memberikan akses dari kelas induknya yaitu Sivitas Akademik
    self.__NIM = NIM
    self.__fakultas = fakultas
    self.__prodi = prodi
  
  # SETTER AND GETTER
  
  def get_nim(self) : # Method untuk mengambil data NIM
    return self.__NIM
  def set_nim(self, NIM) : # Method untuk menset atau mengubah atau menambah data NIM
    self.__NIM = NIM;
  
  def get_fakultas(self) : # Method untuk mengambil data fakultas
    return self.__fakultas
  def set_fakultas(self, fakultas) : # Method untuk menset atau mengubah atau menambah data fakultas
    self.__fakultas = fakultas;
  
  def get_prodi(self) : # Method untuk mengambil data prodi
    return self.__prodi
  def set_prodi(self, prodi) : # Method untuk menset atau mengubah atau menambah data prodi
    self.__prodi = prodi;
