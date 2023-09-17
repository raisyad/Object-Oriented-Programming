<?php 
// Saya Raisyad Jullfikar NIM 2106238 mengerjakan Latihan 2 
// dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
// keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

  // Class Mahasiswa yang merupakan anak dari class SivitasAkademik
  // Merupakan class yang berisikan data - data mahasiswa pada umumnya
  // Seperti Nim, Fakultas, dan Prodi

  // Import file
  require('SivitasAkademik.php');
  class Mahasiswa extends SivitasAkademik {
    // Deklar Private String attr
    private $NIM,
            $fakultas,
            $prodi,
            $pasfoto;
    
    // Constructor
    public function __construct($NIM = '', $fakultas = '', $prodi = '') {
      $this->NIM = $NIM;
      $this->fakultas = $fakultas;
      $this->prodi = $prodi;
    }

    public function setNim($NIM) { $this->NIM = $NIM; } // Method untuk menset atau mengubah atau menambah data NIM
    public function getNim() { return $this->NIM; } // Method untuk mengambil data NIM

    public function setFakultas($fakultas) { $this->fakultas = $fakultas; } // Method untuk menset atau mengubah atau menambah data fakultas
    public function getFakultas() { return $this->fakultas; } // Method untuk mengambil data fakultas

    public function setProdi($prodi) { $this->prodi = $prodi; } // Method untuk menset atau mengubah atau menambah data prodi
    public function getProdi() { return $this->prodi; } // Method untuk mengambil data prodi

    public function setFoto($pasfoto) { $this->pasfoto = $pasfoto; } // Method untuk menset atau mengubah atau menambah data pathImagePasFoto
    public function getFoto() { return $this->pasfoto; } // Method untuk mengambil data pathImagePasFoto
    
    // Destructor
    public function __destruct() {}

  }
?>
