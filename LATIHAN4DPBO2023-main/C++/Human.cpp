// Saya Raisyad Jullfikar NIM 2106238 mengerjakan soal Latihan 4 dalam mata kuliah Desain Pemrograman Berorientasi 
// Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

// Class Human yang berisikan data Manusia secara umum, seperti
// -> Nik, Name, dan Jenis Kelamin

#include <string>
#include <iostream>
using namespace std;

class Human {
  // Deklar Private attr
  private:
    string __NIK;
    string __name;
    string __jenis_kelamin;

  public:
  // Constructor
    Human(string NIK = "", string name = "", string jenis_kelamin = "") {
        this->__NIK = NIK;
        this->__name = name;
        this->__jenis_kelamin = jenis_kelamin;
    }

    string get_nik() { // Method untuk mengambil data Nik
        return this->__NIK;
    }

    void set_nik(string NIK) { // Method untuk menset atau mengubah atau menambah data Nik
        this->__NIK = NIK;
    }

    string get_name() { // Method untuk mengambil data nama
        return this->__name;
    }

    void set_name(string name) { // Method untuk menset atau mengubah atau menambah data nama
        this->__name = name;
    }

    string get_jkelamin() { // Method untuk mengambil data Jenis Kelamin
        return this->__jenis_kelamin;
    }

    void set_jkelamin(string jenis_kelamin) { // Method untuk menset atau mengubah atau menambah data Jenis Kelamin
        this->__jenis_kelamin = jenis_kelamin;
    }

    // Destructor
    ~Human() {}
};