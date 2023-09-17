// Saya Raisyad Jullfikar NIM 2106238 mengerjakan Latihan 1 dalam mata kuliah Desain dan Pemrograman Berorientasi 
// Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

// Import Library + Import Class
#include <bits/stdc++.h>
#include "Mahasiswa.cpp"
#include "Crud.cpp"

using namespace std;

int main(void) {
	string name, nim, jurusan, fakultas;
	Crud crud; // Init untuk objek crud
	list<Mahasiswa> llist; // List untuk menampung objek mahasiswa
	bool flag = true;

	int n; // var input menu
	do {
		cout << "Daftar Menu Program" << "\n" << "1. Input" << "\n" << "2. Edit" << "\n" << "3. Delete" << "\n" << "4. Show Data" << "\n" << "Other Number. Exit Program" << endl;
		cin >> n; // Inputan Menu
		if(n == 1){ // Menu pertama (1) -> Membuat Data / Create
			crud.Create(&llist);
		}else if(n == 2) { // Menu kedua (2) -> Mengupdate / Mengubah Data yang sudah ada
			crud.Update(nim, &llist);
		}else if(n == 3) { // Menu ketiga (3) -> Mengdelete / Menghapus Data yang sudah ada
			crud.Delete(nim, &llist);
		}else if(n == 4) { // Menu keempat (4) -> Meread / Menampilkan Data yang sudah ada
			crud.Read(llist);
		}else { // Jika menginput menu selain menu diatas, loop akan berhenti
			flag = false;
		}
	}while(flag); // Loop akan berjalan terus ketika flag true
}