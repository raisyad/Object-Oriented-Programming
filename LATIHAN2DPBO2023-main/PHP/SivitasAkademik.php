<?php 
// Saya Raisyad Jullfikar NIM 2106238 mengerjakan Latihan 2 
// dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
// keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

  // Class Sivitas Akademik yang merupakan anak dari class Human
  // Merupakan class yang berisikan data - data akademika
  // Seperti Asal Univ dan Email Pendidikan (email edu)

  // Import file
  require('Human.php');
  class SivitasAkademik extends Human {
    // Deklar Private String attr
    private $asal_universitas,
            $email_edu;
    
    // Constructor
    public function __construct($asal_universitas = '', $email_edu = '') {
      $this->asal_universitas = $asal_universitas;
      $this->email_edu = $email_edu;
    }

    public function setAUniv($asal_universitas) { $this->asal_universitas = $asal_universitas; } // Method untuk menset atau mengubah atau menambah data Asal Univ
    public function getAUniv() { return $this->asal_universitas; } // Method untuk mengambil data Asal Univ

    public function setEmail($email_edu) { $this->email_edu = $email_edu; } // Method untuk menset atau mengubah atau menambah data Email
    public function getEmail() { return $this->email_edu; } // Method untuk mengambil data Email
    
    // Destructor
    public function __destruct() {}
  }
?>
