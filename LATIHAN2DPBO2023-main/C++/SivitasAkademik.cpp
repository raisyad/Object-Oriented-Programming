// Saya Raisyad Jullfikar NIM 2106238 mengerjakan Latihan 2 
// dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
// keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

// Import Library
#include <iostream>
#include <string>
using namespace std;

// Class Sivitas Akademik yang merupakan anak dari class Human
// Merupakan class yang berisikan data - data akademika
// Seperti Asal Univ dan Email Pendidikan (email edu)
class SivitasAkademik : public Human {
  // Deklar Private String attr
  private :
    string asal_universitas,
            email_edu;

  public : 
    // Constructor
    SivitasAkademik() {}

    void setAUniv(string asal_universitas) { this->asal_universitas = asal_universitas; } // Method untuk menset atau mengubah atau menambah data Asal Univ
    string getAUniv() { return this->asal_universitas; } // Method untuk mengambil data Asal Univ

    void setEmail(string email_edu) { this->email_edu = email_edu; } // Method untuk menset atau mengubah atau menambah data Email
    string getEmail() { return this->email_edu; } // Method untuk mengambil data Email
    
    // Destructor
    ~SivitasAkademik() {}
};
