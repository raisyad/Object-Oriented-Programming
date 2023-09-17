// Saya Raisyad Jullfikar NIM 2106238 mengerjakan soal Latihan 4 dalam mata kuliah Desain Pemrograman Berorientasi 
// Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

// Class course yang berisikan data course secara umum, seperti
// -> namamk

// Import Library
#include <iostream>
using namespace std;

class Course {
  // Deklarasi private attribute
  private:
    string __namaMK;

  // Constructor
  public:
    Course(string namaMK = "") {
      this->__namaMK = namaMK;
    }

  // Setter and Getter
  public:
    string get_namaMK() { // Method untuk mengambil data namaMK
      return this->__namaMK;
    }

    void set_namaMK(string namaMK) { // Method untuk menset atau mengubah atau menambah data namaMK
      this->__namaMK = namaMK;
    }

    ~Course() {} // Destructor
};