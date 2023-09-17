# Saya Raisyad Jullfikar NIM 2106238 mengerjakan soal Latihan 4 dalam mata kuliah Desain Pemrograman Berorientasi 
# Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

# Class course yang berisikan data course secara umum, seperti
# -> namamk

class Course :
  # Deklar Private attr
  __namaMK = ""
  
  # CONSTRUCTOR
  # Constructor kosong yang mengisi valuenya dengan default value atau string kosong
  def __init__ (self, namaMK = "") :
    self.__namaMK = namaMK  
  
  # SETTER AND GETTER

  def get_namaMK(self) : # Method untuk mengambil data namaMK
    return self.__namaMK
  def set_namaMK(self, namaMK) : # Method untuk menset atau mengubah atau menambah data namaMK
    self.__namaMK = namaMK;