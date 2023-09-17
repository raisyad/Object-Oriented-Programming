// Saya Raisyad Jullfikar NIM 2106238 mengerjakan soal Latihan 4 dalam mata kuliah Desain Pemrograman Berorientasi 
// Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

// Import Library
#include <string>
#include <iostream>

class SivitasAkademik : public Human {
private:
// Deklar Private attr
  string __asal_universitas;
  string __email_edu;

public:
  // Constructor
  SivitasAkademik(string NIK = "", string name = "", string jenis_kelamin = "", string asal_universitas = "", string email_edu = "") : Human(NIK, name, jenis_kelamin) {
    this->__asal_universitas = asal_universitas;
    this->__email_edu = email_edu;
  }

  // Getter dan Setter
  string get_auniv() { return this->__asal_universitas; } // Method untuk mengambil data Asal Univ
  void set_auniv(string asal_universitas) { this->__asal_universitas = asal_universitas; } // Method untuk menset atau mengubah atau menambah data Asal Univ

  string get_email() { return this->__email_edu; } // Method untuk mengambil data Email
  void set_email(string email_edu) { this->__email_edu = email_edu; } // Method untuk menset atau mengubah atau menambah data Email

  // Destructor
  ~SivitasAkademik() {}
};
