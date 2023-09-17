// Saya Raisyad Jullfikar NIM 2106238 mengerjakan Latihan 2 
// dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
// keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

// Import Library
#include <iostream>
#include <string>
using namespace std;

// Class Mahasiswa yang merupakan anak dari class SivitasAkademik
// Merupakan class yang berisikan data - data mahasiswa pada umumnya
// Seperti Nim, Fakultas, dan Prodi

class Mahasiswa : public SivitasAkademik {
  // Deklar Private String attr
  private :
    string NIM,
            fakultas,
            prodi;
  
  public : 
    // Constructor
    Mahasiswa() {}

    void setNim(string NIM) { this->NIM = NIM; } // Method untuk menset atau mengubah atau menambah data NIM
    string getNim() { return this->NIM; } // Method untuk mengambil data NIM

    void setFakultas(string fakultas) { this->fakultas = fakultas; } // Method untuk menset atau mengubah atau menambah data fakultas
    string getFakultas() { return this->fakultas; } // Method untuk mengambil data fakultas

    void setProdi(string prodi) { this->prodi = prodi; } // Method untuk menset atau mengubah atau menambah data prodi
    string getProdi() { return this->prodi; } // Method untuk mengambil data prodi

    // Destructor
    ~Mahasiswa() {}
};
