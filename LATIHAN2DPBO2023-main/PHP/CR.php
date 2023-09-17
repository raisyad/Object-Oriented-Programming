<?php 
// Saya Raisyad Jullfikar NIM 2106238 mengerjakan Latihan 2 
// dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
// keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

  // Import File Mahasiswa
  require('Mahasiswa.php');
  class CR {
    // Deklar Private arr
    private $data = array();
    
    // Constructor
    public function __construct() {}

    // Method untuk menginputkan data
    public function create ($idx, $NIK, $name, $jenis_kelamin, $asal_universitas, $email_edu, $NIM, $fakultas, $prodi, $pasfoto) {
      $this->data[$idx] = new Mahasiswa(); // deklar arr untuk menampung objek mahasiswa
      
      // Assign value to array var
      $this->data[$idx]->setNik($NIK);
      $this->data[$idx]->setName($name);
      $this->data[$idx]->setJKelamin($jenis_kelamin);
      $this->data[$idx]->setAUniv($asal_universitas);
      $this->data[$idx]->setEmail($email_edu);
      $this->data[$idx]->setNim($NIM);
      $this->data[$idx]->setFakultas($fakultas);
      $this->data[$idx]->setProdi($prodi);
      $this->data[$idx]->setFoto($pasfoto);
    }
    
    // Method untuk read/show/view the data
    public function read () {
      echo  "<h4 style='text-align: center;'>Data Sesudah CR</h4>" .
              "<table border='1' cellspacing='0' cellpadding='10'>" .
              "<tr>" .
              "<th>No.</th>" .
              "<th>NIK</th>" .
              "<th>Name</th>" .
              "<th>Jenis Kelamin</th>" .
              "<th>Asal Universitas</th>" .
              "<th>Email</th>" .
              "<th>NIM</th>" .
              "<th>Fakultas</th>" .
              "<th>Prodi</th>" .
              "<th>Pas Foto</th>" .
              "</tr>";
        for ($n = 0; $n < count($this->data); $n++) {
          echo  "<tr>" .
                "<td>" . ($n+1) . "</td>" .
                "<td>" . $this->data[$n]->getNIK() . "</td>" .
                "<td>" . $this->data[$n]->getName() . "</td>" .
                "<td>" . $this->data[$n]->getJKelamin() . "</td>" .
                "<td>" . $this->data[$n]->getAUniv() . "</td>" .
                "<td>" . $this->data[$n]->getEmail() . "</td>" .
                "<td>" . $this->data[$n]->getNim() . "</td>" .
                "<td>" . $this->data[$n]->getFakultas() . "</td>" .
                "<td>" . $this->data[$n]->getProdi() . "</td>" .
                "<td>" . "<img src='" . $this->data[$n]->getFoto() . "' style='width: 150px;'>" . "</td>" .
                "</tr>";
        }
        echo "</table>";
    }

    // Destructor
    public function __destruct() {}
  }
?>
