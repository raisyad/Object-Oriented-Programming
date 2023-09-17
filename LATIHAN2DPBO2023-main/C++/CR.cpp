// Saya Raisyad Jullfikar NIM 2106238 mengerjakan Latihan 2 
// dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
// keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

// Import Library
#include <iostream>
#include <string.h>
#include <bits/stdc++.h>
#include <stdlib.h>
using namespace std;

class CR {
  // Deklar Private String attr
  private :
    string NIK,
            name,
            jenis_kelamin,
            asal_universitas,
            email_edu, 
            NIM,
            fakultas,
            prodi;
  public :
    // Constructor
    CR() {}

    // Method untuk menginputkan data
    void Create (list<Mahasiswa> *llist) {
      Mahasiswa Data;
      cin.ignore();
      // Input data Nik
      cout << "Input Data NIK:\n";
      getline(cin, NIK);

      // Input data Name
      cout << "Input Data Nama:\n";
      getline(cin, name);

      // Input data Jenis Kelamin
      cout << "Input Data Jenis Kelamin/Gender:\n";
      getline(cin, jenis_kelamin);

      // Input data Asal Universitas
      cout << "Input Data Asal Universitas:\n";
      getline(cin, asal_universitas);

      // Input data Email
      cout << "Input Data Email:\n";
      getline(cin, email_edu);

      // Input data NIM
      cout << "Input Data NIM:\n";
      getline(cin, NIM);

      // Input data Prodi
      cout << "Input Data Prodi:\n";
      getline(cin, prodi);

      // Input data Fakultas
      cout << "Input Data Fakultas:\n";
      getline(cin, fakultas);
      
      // Proses Pengecekan data
      bool flag = false;
      for(list<Mahasiswa>::iterator it = llist->begin(); it != llist->end(); it++) {
        if (it->getNik() == NIK) { // Jika data yang ingin diinput sudah ada maka set flag menjadi true
          flag = true;
        }
      }
      if (flag) { // Jika data sudah ada
        system ("CLS"); // Clean Screen
        cout << "\n======================\nData sudah ada dan tidak berhasil diinputkan\n======================";
      } else { // Jika data belum ada
        // Insert the data
        Data.setNik(NIK);
        Data.setName(name);
        Data.setJKelamin(jenis_kelamin);
        Data.setAUniv(asal_universitas);
        Data.setEmail(email_edu);
        Data.setNim(NIM);
        Data.setProdi(prodi);
        Data.setFakultas(fakultas);

        llist->push_back(Data);
        system ("CLS");
        cout << "\n======================\nData belum ada dan berhasil diinputkan\n======================\n\n";
      }
    }

    // Method untuk read/show/view the data
    void Read (list<Mahasiswa> llist) {
      int i = 0, count = 0;

      // Proses Pengecekan data
      for(list<Mahasiswa>::iterator it = llist.begin(); it != llist.end(); it++) {
        count++;
      }
      if (count == 0) { // Jika belum ada sama sekali data yang diinputkan
        system ("CLS"); // Clean Screen
        cout << "\n======================\nData belum ada yang diinputkan\n======================\n";
      }else { // Jika data sudah ada yang diinputkan
        system ("CLS"); // Clean Screen
        cout << "Data yang telah diinputkan adalah sebagai berikut :\n\n";
        for(list<Mahasiswa>::iterator it = llist.begin(); it != llist.end(); it++) {
          cout << (i + 1) << ". "
          << it->getNik() << " | "
          << it->getName() << " | "
          << it->getJKelamin() << " | "
          << it->getAUniv() << " | "
          << it->getEmail() << " | "
          << it->getNim() << " | "
          << it->getProdi() << " | "
          << it->getFakultas() << " | \n";
          i++;
        }
        cout << "\n";
      }
    }

    // Destructor
    ~CR() {}
};
