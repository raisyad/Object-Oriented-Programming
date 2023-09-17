# Saya Raisyad Jullfikar NIM 2106238 mengerjakan soal Latihan 4 dalam mata kuliah Desain Pemrograman Berorientasi 
# Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

# Class Prodi yang berisikan data Prodi secara umum, seperti
# -> namaprodi, kode
# Serta terdapat class yang dicomposite oleh class Prodi diantaranya,
# course, mhs, dosen

# Import File Class
from Course import Course as C
from Mahasiswa import Mahasiswa as Mhs
from Dosen import Dosen as Dos

class Prodi :
  # Deklar Private attr
  __namaProdi = ""
  __kode = ""
  __course = C()
  __mhs = Mhs()
  __dosen = Dos()
  
  # CONSTRUCTOR
  # Constructor kosong yang mengisi valuenya dengan default value atau string kosong
  def __init__ (self, namaProdi = "", kode = "", course = C(), mhs = Mhs(), dosen = Dos()) :
    self.__namaProdi = namaProdi
    self.__kode = kode
    self.__course = course
    self.__mhs = mhs
    self.__dosen = dosen
  
  # SETTER AND GETTER

  def get_namaProdi(self) : # Method untuk mengambil data namaProdi
    return self.__namaProdi
  def set_namaProdi(self, namaProdi) : # Method untuk menset atau mengubah atau menambah data namaProdi
    self.__namaProdi = namaProdi;
    
  def get_kode(self) : # Method untuk mengambil data kode
    return self.__kode
  def set_kode(self, kode) : # Method untuk menset atau mengubah atau menambah data kode
    self.__kode = kode;
  
  def get_course(self) : # Method untuk mengambil data course
    return self.__course
  def set_course(self, course) : # Method untuk menset atau mengubah atau menambah data course
    self.__course = course;
  
  def get_mhs(self) : # Method untuk mengambil data mhs
    return self.__mhs
  def set_mhs(self, mhs) : # Method untuk menset atau mengubah atau menambah data mhs
    self.__mhs = mhs;
  
  def get_dosen(self) : # Method untuk mengambil data dosen
    return self.__dosen
  def set_dosen(self, dosen) : # Method untuk menset atau mengubah atau menambah data dosen
    self.__dosen = dosen;