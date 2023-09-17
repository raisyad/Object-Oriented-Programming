// Saya Raisyad Jullfikar NIM 2106238 mengerjakan soal Latihan 4 dalam mata kuliah Desain Pemrograman Berorientasi 
// Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

#include <iostream>
using namespace std;

// Class Dosen yang merupakan anak dari class SivitasAkademik
// Merupakan class yang berisikan data - data Dosen pada umumnya
// Seperti Nip, pendter, keahlian, fakultas

class Dosen : public SivitasAkademik {
  // Deklarasi private attribute
  private:
    string __NIP;
    string __pendterakhir;
    string __keahlian;
    string __fakultas;

  // Constructor
  public:
    Dosen(string NIK = "", string name = "", string jenis_kelamin = "", string asal_universitas = "", string email_edu = "", string NIP = "", string pendterakhir = "", string keahlian = "", string fakultas = "") : SivitasAkademik(NIK, name, jenis_kelamin, asal_universitas, email_edu) {
      __NIP = NIP;
      __pendterakhir = pendterakhir;
      __keahlian = keahlian;
      __fakultas = fakultas;
    }

  // Setter and Getter
  public:
    string get_nip() { // Method untuk mengambil data NIM
      return this->__NIP;
    }

    void set_nip(string NIP) { // Method untuk menset atau mengubah atau menambah data NIM
      this->__NIP = NIP;
    }

    string get_pendterakhir() { // Method untuk mengambil data prodi
      return this->__pendterakhir;
    }

    void set_pendterakhir(string pendterakhir) { // Method untuk menset atau mengubah atau menambah data prodi
      this->__pendterakhir = pendterakhir;
    }

    string get_keahlian() { // Method untuk mengambil data prodi
      return this->__keahlian;
    }

    void set_keahlian(string keahlian) { // Method untuk menset atau mengubah atau menambah data prodi
      this->__keahlian = keahlian;
    }

    string get_fakultas() { // Method untuk mengambil data fakultas
      return this->__fakultas;
    }

    void set_fakultas(string fakultas) { // Method untuk menset atau mengubah atau menambah data fakultas
      this->__fakultas = fakultas;
    }

    ~Dosen() {} // Destructor
};