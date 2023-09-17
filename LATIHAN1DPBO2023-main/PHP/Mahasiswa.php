<?php

// Class Mahasiswa yang berisi data diri umum mahasiswa, seperti
// -> Name, nim, jurusan, fakultas
class Mahasiswa {
	// Deklar Var private attr
	private $nim = '', 
					$name = '', 
					$jurusan = '', 
					$fakultas = '', 
					$foto_profile = '';

	// CONSTRUCT
	// Constructor kosong yang mengisi default value
	public function __construct($nim = '', $name = '', $jurusan = '', $fakultas = '', $foto_profile = '') {
		$this->nim = $nim;
		$this->name = $name;
		$this->jurusan = $jurusan;
		$this->fakultas = $fakultas;
		$this->foto_profile = $foto_profile;
	}

	// Setter dan Getter
	public function setNim($nim) { $this->nim = $nim; } // Method untuk menset atau mengubah atau menambah data NIM
	public function getNim() { return $this->nim; } // Method untuk mengambil data NIM

	public function setName($name) { $this->name = $name; } // Method untuk menset atau mengubah atau menambah data nama
	public function getName() { return $this->name; } // Method untuk mengambil data nama

  public function setJurusan($jurusan) { $this->jurusan = $jurusan; } // Method untuk menset atau mengubah atau menambah data jurusan
	public function getJurusan() { return $this->jurusan; } // Method untuk mengambil data jurusan

  public function setFakultas($fakultas) { $this->fakultas = $fakultas; } // Method untuk menset atau mengubah atau menambah data fakultas
	public function getFakultas() { return $this->fakultas; } // Method untuk mengambil data fakultas

	public function setFotoProfile($foto_profile) { $this->foto_profile = $foto_profile; } // Method untuk menset atau mengubah atau menambah data pathimg
	public function getFotoProfile() { return $this->foto_profile; } // Method untuk mengambil data pathimg

	// DESTRUCTOR
	public function __destruct() {}
}

?>