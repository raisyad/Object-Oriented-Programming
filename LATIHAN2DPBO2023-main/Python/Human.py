# Saya Raisyad Jullfikar NIM 2106238 mengerjakan Latihan 2 
# dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
# keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

# Class Human yang berisikan data Manusia secara umum, seperti
# -> Nik, Name, dan Jenis Kelamin

class Human :
  # Deklar Private attr
  __NIK = ""
  __name = ""
  __jenis_kelamin = ""
  
  # CONSTRUCTOR
  # Constructor kosong yang mengisi valuenya dengan default value atau string kosong
  def __init__ (self, NIK = "", name = "", jenis_kelamin = "") :
    self.__NIK = NIK
    self.__name = name
    self.__jenis_kelamin = jenis_kelamin
  
  
  # SETTER AND GETTER

  def get_nik(self) : # Method untuk mengambil data Nik
    return self.__NIK
  def set_nik(self, NIK) : # Method untuk menset atau mengubah atau menambah data Nik
    self.__NIK = NIK;
    
  def get_name(self) : # Method untuk mengambil data nama
    return self.__name
  def set_name(self, name) : # Method untuk menset atau mengubah atau menambah data nama
    self.__name = name;
    
  def get_jkelamin(self) : # Method untuk mengambil data Jenis Kelamin
    return self.__jenis_kelamin
  def set_jkelamin(self, jenis_kelamin) : # Method untuk menset atau mengubah atau menambah data Jenis Kelamin
    self.__jenis_kelamin = jenis_kelamin;
