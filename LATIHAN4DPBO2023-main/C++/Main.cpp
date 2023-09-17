// Saya Raisyad Jullfikar NIM 2106238 mengerjakan soal Latihan 4 dalam mata kuliah Desain Pemrograman Berorientasi
// Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

// Import Library
#include <string>
#include <iostream>
using namespace std;
#include <bits/stdc++.h>

// Import Class
#include "Human.cpp"
#include "SivitasAkademik.cpp"
#include "Prodi.cpp"

int main(void) {
  // Input Course
  Course course1("Mathematics");
  Course course2("Computer Science");

  // Input Mahasiswa
  Mahasiswa mhs1("131","Resyad","Laki","UPI","res@upi.edu","2106238","FPMIPA");
  Mahasiswa mhs2("132","Mila","Perempuan","UPI","mil@upi.edu","2106232","FPMIPA");

  // Input Dosen
  Dosen dsn1("211", "Wibi", "Laki", "UPI", "wib@upi.edu", "19918829", "S3", "Data Mining", "FPMIPA");
  Dosen dsn2("212", "Maxima", "Laki", "UPI", "max@upi.edu", "19928830", "S3", "Animasi & Multimedia", "FPMIPA");

  // Input Prodi
  Prodi prd1("Ilkom", "L301", course1, mhs1, dsn1);
  Prodi prd2("Ilkom", "L302", course2, mhs2, dsn2);

  // Input all data
  list<Prodi> Data;
  Data.push_back(prd1);
  Data.push_back(prd2);

  // Flag
  bool flag = false;
  
  // List Mata Kuliah
  for (auto mk : Data) {
    if (flag == false) {
      cout << "************************\n";
      cout << "<> Program Studi : " << mk.get_namaProdi() << endl;
      cout << "************************\n\n";
      cout << "|================|" << endl;
      cout << "|List Mata Kuliah|" << endl;
      cout << "|================|" << endl;
      flag = true;
    }
    cout << "> Kode : " << mk.get_kode() << endl;
    cout <<"  - Nama MK : " << mk.get_course().get_namaMK() << endl;
  }
  cout << endl;

  // List Dosen
  flag = false;
  for (auto prd : Data) {
    if (flag == false) {
      cout << "|================|\n";
      cout << "|List Dosen " << prd.get_namaProdi() << "|\n";
      cout << "|================|\n";
      flag = true;
    }
    cout << "> Nama :" << prd.get_dosen().get_name() << endl;
    cout << "   - NIK                 : " << prd.get_dosen().get_nik() << endl;
    cout << "   - Jenis Kelamin       : " << prd.get_dosen().get_jkelamin() << endl;
    cout << "   - Asal Univ           : " << prd.get_dosen().get_auniv() << endl;
    cout << "   - Email               : " << prd.get_dosen().get_email() << endl;
    cout << "   - NIP                 : " << prd.get_dosen().get_nip() << endl;
    cout << "   - Pendidikan Terakhir : " << prd.get_dosen().get_pendterakhir() << endl;
    cout << "   - Keahlian            : " << prd.get_dosen().get_keahlian() << endl;
    cout << "   - Fakultas            : " << prd.get_dosen().get_fakultas() << endl;
  }
  cout << "\n";

  // List Mahasiswa
  flag = false;
  for (auto mhs : Data) {
    if (flag == false) {
      cout << "|====================|\n";
      cout << "|List Mahasiswa " << mhs.get_namaProdi() << "|\n";
      cout << "|====================|\n";
      flag = true;
    }
    cout << "> Nama : " << mhs.get_mhs().get_name() << endl;
    cout << "   - NIK           : " << mhs.get_mhs().get_nik() << endl;
    cout << "   - Jenis Kelamin : " << mhs.get_mhs().get_jkelamin() << endl;
    cout << "   - Asal Univ     : " << mhs.get_mhs().get_auniv() << endl;
    cout << "   - Email         : " << mhs.get_mhs().get_email() << endl;
    cout << "   - NIM           : " << mhs.get_mhs().get_nim() << endl;
    cout << "   - Fakultas      : " << mhs.get_mhs().get_fakultas() << endl;
  }
  cout << endl;

  // List Prodi
  flag = false;
  for (auto prd : Data) {
    if (flag == false) {
      cout << "|=====================|" << endl;
      cout << "|List Data Prodi " << prd.get_namaProdi() << "|" << endl;
      cout << "|=====================|" << endl;
      cout << "> List Mata Kuliah" << endl;
      flag = true;
    }
    cout << "  - Nama MK : " << prd.get_course().get_namaMK() << endl;
  }
  cout << endl;

  flag = false;
  for (auto prd : Data) {
    if (flag == false) {
      cout << "> List Dosen" << endl;
      flag = true;
    }
    cout << "   // Nama : " << prd.get_dosen().get_name() << endl;
    cout << "      - NIK                 : " << prd.get_dosen().get_nik() << endl;
    cout << "      - Jenis Kelamin       : " << prd.get_dosen().get_jkelamin() << endl;
    cout << "      - Asal Univ           : " << prd.get_dosen().get_auniv() << endl;
    cout << "      - Email               : " << prd.get_dosen().get_email() << endl;
    cout << "      - NIP                 : " << prd.get_dosen().get_nip() << endl;
    cout << "      - Pendidikan Terakhir : " << prd.get_dosen().get_pendterakhir() << endl;
    cout << "      - Keahlian            : " << prd.get_dosen().get_keahlian() << endl;
    cout << "      - Fakultas            : " << prd.get_dosen().get_fakultas() << endl;
  }
  cout << endl;

  flag = false;
  for (auto prd : Data) {
    if (flag == false) {
      cout << "> List Mahasiswa" << endl;
      flag = true;
    }
    cout << "   // Nama : "<< prd.get_mhs().get_name() << endl;
    cout << "      - NIK           : "<< prd.get_mhs().get_nik() << endl;
    cout << "      - Jenis Kelamin : "<< prd.get_mhs().get_jkelamin() << endl;
    cout << "      - Asal Univ     : "<< prd.get_mhs().get_auniv() << endl;
    cout << "      - Email         : "<< prd.get_mhs().get_email() << endl;
    cout << "      - NIM           : "<< prd.get_mhs().get_nim() << endl;
    cout << "      - Fakultas      : "<< prd.get_mhs().get_fakultas() << endl;
  }
}