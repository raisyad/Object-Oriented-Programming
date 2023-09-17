# Saya Raisyad Jullfikar NIM 2106238 mengerjakan Latihan 2 
# dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
# keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

# Import class Human
from Human import *

# Class Sivitas Akademik yang merupakan anak dari class Human
# Merupakan class yang berisikan data - data akademika
# Seperti Asal Univ dan Email Pendidikan (email edu)

class SivitasAkademik(Human) :
  # Deklar private attr
  __asal_universitas = ""
  __email_edu = ""
  
  # CONSTRUCTOR
  # Constructor kosong yang mengisi valuenya dengan default value atau string kosong
  def __init__ (self, NIK, name, jenis_kelamin, asal_universitas = "", email_edu = "") :
    super().__init__(NIK,name,jenis_kelamin)
    # Fungsi super untuk memberikan akses dari kelas induknya yaitu Human
    self.__asal_universitas = asal_universitas
    self.__email_edu = email_edu
    
    
  # SETTER AND GETTER
     
  def get_auniv(self) : # Method untuk mengambil data Asal Univ
    return self.__asal_universitas
  def set_auniv(self, asal_universitas) : # Method untuk menset atau mengubah atau menambah data Asal Univ
    self.__asal_universitas = asal_universitas;
    
  def get_email(self) : # Method untuk mengambil data Email
    return self.__email_edu
  def set_email(self, email_edu) : # Method untuk menset atau mengubah atau menambah data Email
    self.__email_edu = email_edu;
