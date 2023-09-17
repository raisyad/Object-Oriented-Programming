// Saya Raisyad Jullfikar NIM 2106238 mengerjakan soal Latihan 4 dalam mata kuliah Desain Pemrograman Berorientasi 
// Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

// Class Mahasiswa yang merupakan anak dari class SivitasAkademik
// Merupakan class yang berisikan data - data mahasiswa pada umumnya
// Seperti Nim, Fakultas, dan Prodi
class Mahasiswa : public SivitasAkademik {
private:
    // Deklar private attr
    string __NIM;
    string __fakultas;
public:
    // CONSTRUCTOR
    // Constructor kosong yang mengisi valuenya dengan default value atau string kosong
    Mahasiswa(string NIK = "", string name = "", string jenis_kelamin = "", string asal_universitas = "", string email_edu = "", string NIM = "", string fakultas = "") : SivitasAkademik(NIK, name, jenis_kelamin, asal_universitas, email_edu) {
        this->__NIM = NIM;
        this->__fakultas = fakultas;
    }

    // SETTER AND GETTER
    string get_nim() { // Method untuk mengambil data NIM
        return this->__NIM;
    }
    void set_nim(string NIM) { // Method untuk menset atau mengubah atau menambah data NIM
        this->__NIM = NIM;
    }

    string get_fakultas() { // Method untuk mengambil data fakultas
        return this->__fakultas;
    }
    void set_fakultas(string fakultas) { // Method untuk menset atau mengubah atau menambah data fakultas
        this->__fakultas = fakultas;
    }

    // Destructor
    ~Mahasiswa() {}
};
