// Import Library
#include <bits/stdc++.h>
#include <cstring>
#include <stdlib.h>

using namespace std;

// Class Crud yang berisi data list dari class mahasiswa yang akan
// digunakan untuk memodifikasi data list tsb, seperti
// Create, Read/Show, Update, Delete
class Crud {
	public:
    // CONSTRUCTOR KOSONG
		Crud() {}

    // Method untuk create data
    void Create(list<Mahasiswa> *llist) {
      int flag = 0, i = 0;
      Mahasiswa data;
      string name, nim, jurusan, fakultas;
			cout << "Input Data Name:\n"; cin >> name;
			cout << "Input Data NIM:\n"; cin >> nim;
			cout << "Input Data Program Studi:\n"; cin >> jurusan;
			cout << "Input Data Fakultas:\n"; cin >> fakultas;

      // Data yang sudah ada didalam list dicek, jika ada nim yang sama, maka data tidak bisa diinputkan
      for(list<Mahasiswa>::iterator it = llist->begin(); it != llist->end(); it++) {
        if (i == 0) {
          for (int count = 0; count < 3; count++)
            cout << "Memeriksa..." << (count + 1) << endl;
        }

        if(nim == it->getNim()) flag = 1;
        i++;
			}
 
      if (flag == 1) { // Ketika Data yang diinputkan sudah ada
        system ("CLS");
        cout << "\n======================\nData sudah ada dan tidak berhasil diinputkan\n======================\n\n";
      }else if (flag == 0) { // Ketika Data yang diinputkan belum ada
        system ("CLS");
        cout << "\n======================\nData belum ada dan berhasil diinputkan\n======================\n\n";
        data.setInsert(name,nim,jurusan,fakultas);
			  llist->push_back(data);
      }

    }

    // Method untuk Read/show/view data
    void Read(list<Mahasiswa> llist) {
      system ("CLS");
      // Dibawah ini merupakan proses Menampilkan data mhs
      // dengan penggunaan table yang akan mencari string 
      // terpanjang terlebih dahulu agar menampilkan spasi 
      // yang rapih
      cout << "\nList Data Mhs yang telah diinputkan: " << "\n\n";
			int i = 1, lengthName = 4, 
                lengthNim = 3, 
                lengthJurusan = 7, 
                lengthFakultas = 8,
                defaultSpace = 1,
                temps = 0;
      cout << "No.";
      // Find Length
      for(list<Mahasiswa>::iterator it = llist.begin(); it != llist.end(); it++) {
				i++;
        if (lengthName < it->getName().length()) lengthName = it->getName().length();
        if (lengthNim < it->getNim().length()) lengthNim = it->getNim().length();
        if (lengthJurusan < it->getJurusan().length()) lengthJurusan = it->getJurusan().length();
        if (lengthFakultas < it->getFakultas().length()) lengthFakultas = it->getFakultas().length();
			}

      if (i <= 10) cout << "|";
      else if (i <= 100)
        cout << " |";
      else if (i > 999)
        cout << "  |";

      // Length Name Header
      cout << "Name";
      if (lengthName < 4) cout << " ";
      else {
        temps = lengthName - 4;
        temps += 1;
        for (int iter = 0; iter < temps; iter++) cout << " ";
      }
      cout << "|";

      // Length NIM Header
      cout << "NIM";
      if (lengthNim < 3) cout << " ";
      else {
        temps = 0;
        temps = lengthNim - 3;
        temps += 1;
        for (int iter = 0; iter < temps; iter++) cout << " ";
      }
      cout << "|";

      // Length Jurusan Header
      cout << "Jurusan";
      if (lengthJurusan < 7) cout << " ";
      else {
        temps = 0;
        temps = lengthJurusan - 7;
        temps += 1;
        for (int iter = 0; iter < temps; iter++) cout << " ";
      }
      cout << "|";

      // Length Fakultas Header
      cout << "Fakultas";
      if (lengthFakultas < 8) cout << " ";
      else {
        temps = 0;
        temps = lengthFakultas - 8;
        temps += 1;
        for (int iter = 0; iter < temps; iter++) cout << " ";
      }
      cout << "|";

      cout << "\n";


      i = 0;
      // Proses Print Data Mhs
			for(list<Mahasiswa>::iterator it = llist.begin(); it != llist.end(); it++) {
        if ((i + 1) <= 10) cout << (i + 1) << ". |";
        else if ((i + 1) <= 100) cout << (i + 1) << ".  |";
        else if ((i + 1) > 999) cout << (i + 1) << ".   |";

        cout << it->getName();
        if (lengthName < it->getName().length()) cout << " ";
        else {
          temps = 0;
          temps = lengthName - it->getName().length();
          temps += 1;
          for (int iter = 0; iter < temps; iter++) cout << " ";
          if (temps == 0) cout << " ";
        }
        cout << "|";

        cout << it->getNim();
        if (lengthNim < it->getNim().length()) cout << " ";
        else {
          temps = 0;
          temps = lengthNim - it->getNim().length();
          temps += 1;
          for (int iter = 0; iter < temps; iter++) cout << " ";
          if (temps == 0) cout << " ";
        }
        cout << "|";

        cout << it->getJurusan();
        if (lengthJurusan < it->getJurusan().length()) cout << " ";
        else {
          temps = 0;
          temps = lengthJurusan - it->getJurusan().length();
          temps += 1;
          for (int iter = 0; iter < temps; iter++) cout << " ";
          if (temps == 0) cout << " ";
        }
        cout << "|";

        cout << it->getFakultas();
        if (lengthFakultas < it->getFakultas().length()) {
          cout << " ";
        }else {
          temps = 0;
          temps = lengthFakultas - it->getFakultas().length();
          temps += 1;
          for (int iter = 0; iter < temps; iter++) cout << " ";
          if (temps == 0) cout << " ";
        }
        cout << "|\n";

				i++;
			}
      cout << "\n";
    }

    // Method untuk ubah/update data
		void Update(string nim, list<Mahasiswa> *llist) {
      int flag = 0, menuUpdate = 0;
      // Input data yang akan diubah
			cout << "Input Data NIM yang akan diubah:" << '\n';
			cin >> nim;
			for(list<Mahasiswa>::iterator it = llist->begin(); it != llist->end(); it++) {
				if(nim == it->getNim()) {
          // Jika data tsb ada, maka pilih menu kembali
			    string name, Nim, jurusan, fakultas;
          cout << "\nPilih Menu Update\n" << "1. Update Nama\n" << "2. Update Program Studi\n" << "3. Update Fakultas\n" << "4. Update Semua\n";
          cin >> menuUpdate;
          if (menuUpdate == 1) { // Menu 1 Untuk mengubah nama saja
            cout << "Input Data Name:\n"; cin >> name;
            it->setName(name);

            flag = 1;
            system ("CLS");
            cout << "\n=================\nData berhasil diUpdate\n=================\n\n";
          } else if (menuUpdate == 2) { // Menu 2 Untuk mengubah jurusan saja
					  cout << "Input Data Program Studi:\n"; cin >> jurusan;
            it->setJurusan(jurusan);

            flag = 1;
            system ("CLS");
            cout << "\n=================\nData berhasil diUpdate\n=================\n\n";
          } else if (menuUpdate == 3) { // Menu 3 Untuk mengubah fakultas saja
					  cout << "Input Data Fakultas:\n"; cin >> fakultas;
            it->setFakultas(fakultas);

            flag = 1;
            system ("CLS");
            cout << "\n=================\nData berhasil diUpdate\n=================\n\n";
          } else if (menuUpdate == 4) { // Menu 4 Untuk mengubah keseluruhan data
            cout << "Input Data nama:\n"; cin >> name;
            cout << "Input Data NIM:\n"; cin >> Nim;
            cout << "Input Data Program Studi:\n"; cin >> jurusan;
            cout << "Input Data Fakultas:\n"; cin >> fakultas;

            it->setUpdate(name,Nim,jurusan,fakultas);
            flag = 1;
            system ("CLS");
            cout << "\n=================\nData berhasil diUpdate\n=================\n\n";
          } else { // Jika tidak memilih menu yang tersedia
            system ("CLS");
            cout << "\nTidak ada dimenu, silahkan pilih kembali nanti ^_^" << endl;
          }
				}
			}
      if (flag == 0) { // Jika belum terjadi update atau nim yang dicari tidak ada
        system ("CLS");
        cout << "\n=================\nNIM yang anda cari tidak ada\n=================\n\n";
      }
		}

    // Method untuk delete data
		void Delete(string nim, list<Mahasiswa> *llist) {
      int flag = 0; // set default
      // Input data yang akan dihapus
			cout << "Input Data NIM yang akan dihapus:" << '\n';
			cin >> nim;
			for(list<Mahasiswa>::iterator it = llist->begin(); it != llist->end(); it++) {
        if(nim == it->getNim()) { // Jika data yang akan dihapus ada, maka lakukan delete
          it = llist->erase(it);
          it--;
          flag = 1; // Penanda telah terjadi penghapusan data
          system ("CLS");
          cout << "\n=================\nData berhasil diDelete\n=================\n\n";
        }
      }
      if (flag == 0) { // Jika belum terjadi penghapusan data atau nim yang dicari tidak ada
        system ("CLS");
        cout << "\n=================\nNIM yang anda cari tidak ada\n=================\n\n";
      }
		}

    // DESTRUCTOR
		~Crud() {}
};