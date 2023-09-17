// Saya Raisyad Jullfikar NIM 2106238 mengerjakan Latihan 2 
// dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
// keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

// Import Library
#include <iostream>
#include <string>
using namespace std;

// Class Human yang berisikan data Manusia secara umum, seperti
// -> Nik, Name, dan Jenis Kelamin
class Human {
  // Deklar Private String attr
  private :
    string NIK,
            name,
            jenis_kelamin;
  public :
    // Constructor
    Human() {}

    // SETTER AND GETTER
    void setNik(string NIK) { this->NIK = NIK; } // Method untuk menset atau mengubah atau menambah data Nik
    string getNik() { return this->NIK; } // Method untuk mengambil data Nik

    void setName(string name) { this->name = name; } // Method untuk menset atau mengubah atau menambah data nama
    string getName() { return this->name; } // Method untuk mengambil data nama

    void setJKelamin(string jenis_kelamin) { this->jenis_kelamin = jenis_kelamin; } // Method untuk menset atau mengubah atau menambah data Jenis Kelamin
    string getJKelamin() { return this->jenis_kelamin; } // Method untuk mengambil data Jenis Kelamin

    // Destructor
    ~Human() {}
};
