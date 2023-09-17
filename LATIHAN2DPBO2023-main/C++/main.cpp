// Saya Raisyad Jullfikar NIM 2106238 mengerjakan Latihan 2 
// dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
// keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

// Import Library
#include <string>
#include <iostream>
#include <bits/stdc++.h>
using namespace std;

// Import File
#include "Human.cpp"
#include "SivitasAkademik.cpp"
#include "Mahasiswa.cpp"
#include "CR.cpp"

int main(void) {
  int n; // Var inputan
  list<Mahasiswa> llist; // List untuk menampung objek mahasiswa
  CR cr; // Deklar objek CR
  bool flag = true; // Var penanda loop

  do {
    cout << "Daftar Menu Program\n1. Input\n2. Show Data\nOther Number. Exit Program\n";
    cin >> n; // Input Menu

    if (n == 1) { // Menu pertama (1) -> Membuat Data / Create
      cr.Create(&llist); // Call function Create
    } else if (n == 2) { // Menu keempat (2) -> Meread / Menampilkan Data yang sudah ada
      cr.Read(llist); // Call Function Read
    } else { // Jika menginput menu selain menu diatas, loop akan berhenti
      flag = false; // Set false value
    }

  }while(flag); // Jika flag True, maka loop berjalan

}
