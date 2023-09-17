// Saya Raisyad Jullfikar NIM 2106238 mengerjakan soal Latihan 4 dalam mata kuliah Desain Pemrograman Berorientasi 
// Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

// Class Prodi yang berisikan data Prodi secara umum, seperti
// -> namaprodi, kode
// Serta terdapat class yang dicomposite oleh class Prodi diantaranya,
// course, mhs, dosen

// Import Library
#include <iostream>
using namespace std;

// Import Class
#include "Mahasiswa.cpp"
#include "Dosen.cpp"
#include "Course.cpp"


class Prodi {
private:
  // Deklar Private attr
    string namaProdi;
    string kode;
    Course course;
    Mahasiswa mhs;
    Dosen dosen;
public:
    // Constructor
    Prodi(string namaProdi = "", string kode = "", Course course = Course(), Mahasiswa mhs = Mahasiswa(), Dosen dosen = Dosen()) {
        this->namaProdi = namaProdi;
        this->kode = kode;
        this->course = course;
        this->mhs = mhs;
        this->dosen = dosen;
    }
    
    // Setter and Getter
    string get_namaProdi() { // Method untuk mengambil data namaProdi
        return this->namaProdi;
    }
    
    void set_namaProdi(string namaProdi) { // Method untuk menset atau mengubah atau menambah data namaProdi
        this->namaProdi = namaProdi;
    }
    
    string get_kode() { // Method untuk mengambil data kode
        return this->kode;
    }
    
    void set_kode(string kode) { // Method untuk menset atau mengubah atau menambah data kode
        this->kode = kode;
    }
    
    Course get_course() { // Method untuk mengambil data course
        return this->course;
    }
    
    void set_course(Course course) { // Method untuk menset atau mengubah atau menambah data course
        this->course = course;
    }
    
    Mahasiswa get_mhs() { // Method untuk mengambil data mhs
        return this->mhs;
    }
    
    void set_mhs(Mahasiswa mhs) { // Method untuk menset atau mengubah atau menambah data mhs
        this->mhs = mhs;
    }
    
    Dosen get_dosen() { // Method untuk mengambil data dosen
        return this->dosen;
    }
    
    void set_dosen(Dosen dosen) { // Method untuk menset atau mengubah atau menambah data dosen
        this->dosen = dosen;
    }
};