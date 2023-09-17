# Class Mahasiswa yang berisi data diri umum mahasiswa, seperti
# -> Name, nim, jurusan, fakultas
class Mahasiswa :
  # Deklar private attr
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
  
  # SETTER DAN GETTER
  # Method untuk mengambil data nama
  def get_name(self) :
    return self.__name
  # Method untuk menset atau mengubah atau menambah data nama
  def set_name(self, name) :
    self.__name = name;
  
  # Method untuk mengambil data nim
  def get_nim(self) :
    return self.__nim
  # Method untuk menset atau mengubah atau menambah data nim
  def set_nim(self, nim) :
    self.__nim = nim
  
  # Method untuk mengambil data jurusan
  def get_jurusan(self) :
    return self.__jurusan
  # Method untuk menset atau mengubah atau menambah data jurusan
  def set_jurusan(self, jurusan) :
    self.__jurusan = jurusan
  
  # Method untuk mengambil data fakultas
  def get_fakultas(self) :
    return self.__fakultas
  # Method untuk menset atau mengubah atau menambah data fakultas
  def set_fakultas(self, fakultas) :
    self.__fakultas = fakultas