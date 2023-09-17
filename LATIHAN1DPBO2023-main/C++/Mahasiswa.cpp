// Import Library
#include <iostream>
#include <string>

using namespace std;

// Class Mahasiswa yang berisi data diri umum mahasiswa, seperti
// -> Name, nim, jurusan, fakultas
class Mahasiswa {
	// Private Atribut
	private:
		string name, 
						nim,
						jurusan,
						fakultas;

	public:
	// CONSTRUCTOR
		Mahasiswa() { // Constructor kosong yang mengisi default value
			this->name = "";
			this->nim = "";
			this->jurusan = "";
			this->fakultas = "";
		}

	// Setter dan Getter
		string getName() {return this->name;} // Method untuk mengambil data nama
		string getNim() {return this->nim;} // Method untuk mengambil data nim
		string getJurusan() {return this->jurusan;} // Method untuk mengambil data jurusan
		string getFakultas() {return this->fakultas;} // Method untuk mengambil data fakultas

		void setName(string name) { this->name = name; } // Method untuk menset atau mengubah atau menambah data nama
		void setNim(string nim) { this->nim = nim; } // Method untuk menset atau mengubah atau menambah data nim
		void setJurusan(string jurusan) { this->jurusan = jurusan; } // Method untuk menset atau mengubah atau menambah data jurusan
		void setFakultas(string fakultas) { this->fakultas = fakultas; } // Method untuk menset atau mengubah atau menambah data fakultas

		// Method untuk menset data sekaligus
		void setInsert(string name, string nim, string jurusan, string fakultas) {
			this->name = name;
			this->nim = nim;
			this->jurusan = jurusan;
			this->fakultas = fakultas;
		}

		// Method untuk menset data sekaligus 
		// Digunakan saat menu update bagian 'update untuk semua'
		void setUpdate(string name, string nim, string jurusan, string fakultas) {
			this->name = name;
			this->nim = nim;
			this->jurusan = jurusan;
			this->fakultas = fakultas;
		}

		// DESTRUCTOR
		~Mahasiswa() {}
};