# Saya Raisyad Jullfikar NIM 2106238 mengerjakan soal Latihan 4 dalam mata kuliah Desain Pemrograman Berorientasi 
# Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

# Import Class SivitasAkademik
from SivitasAkademik import *

# Class Dosen yang merupakan anak dari class SivitasAkademik
# Merupakan class yang berisikan data - data Dosen pada umumnya
# Seperti Nip, pendter, keahlian, fakultas

class Dosen(SivitasAkademik) :
  # Deklar private attr
  __NIP = ""
  __pendterakhir = ""
  __keahlian = ""
  __fakultas = ""
  
  # CONSTRUCTOR
  # Constructor kosong yang mengisi valuenya dengan default value atau string kosong
  def __init__ (self, NIK = "", name = "", jenis_kelamin = "", asal_universitas = "", email_edu = "", NIP = "", pendterakhir = "", keahlian = "", fakultas = "") :
    super().__init__(NIK,name,jenis_kelamin,asal_universitas,email_edu)
    # Fungsi super untuk memberikan akses dari kelas induknya yaitu Sivitas Akademik
    self.__NIP = NIP
    self.__pendterakhir = pendterakhir
    self.__keahlian = keahlian
    self.__fakultas = fakultas
  
  # SETTER AND GETTER
  
  def get_nip(self) : # Method untuk mengambil data NIM
    return self.__NIP
  def set_nip(self, NIP) : # Method untuk menset atau mengubah atau menambah data NIM
    self.__NIP = NIP;
  
  def get_pendterakhir(self) : # Method untuk mengambil data prodi
    return self.__pendterakhir
  def set_pendterakhir(self, pendterakhir) : # Method untuk menset atau mengubah atau menambah data prodi
    self.__pendterakhir = pendterakhir;

  def get_keahlian(self) : # Method untuk mengambil data prodi
    return self.__keahlian
  def set_keahlian(self, keahlian) : # Method untuk menset atau mengubah atau menambah data prodi
    self.__keahlian = keahlian;

  def get_fakultas(self) : # Method untuk mengambil data fakultas
    return self.__fakultas
  def set_fakultas(self, fakultas) : # Method untuk menset atau mengubah atau menambah data fakultas
    self.__fakultas = fakultas;