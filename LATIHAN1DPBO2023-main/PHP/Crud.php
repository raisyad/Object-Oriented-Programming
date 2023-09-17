<?php 
// Class Crud yang berisi data list dari class mahasiswa yang akan
// digunakan untuk memodifikasi data list tsb, seperti
// Create, Read/Show, Update, Delete
  class Crud {
    // CONSTRUCT
    public function __construct() {}

    // Method untuk create data
    public function Create($Input, $Name, $Nim, $Jurusan, $Fakultas, $PathImg){
      $Input->setName($Name);
      $Input->setNim($Nim);
      $Input->setJurusan($Jurusan);
      $Input->setFakultas($Fakultas);
      $Input->setFotoProfile($PathImg);
    }

    // Method untuk Read/show/view data
    public function Read($Input, $Menu, $countDataDel) {
      $i = 1;
      // Proses menampilkan menggunakan syntax table
      if ($Menu == 1) { // Sebelum CUD
        echo  "<h4 style='text-align: center;'>Data Mahasiswa Sebelum CUD</h4>" .
              "<table border='1' cellspacing='0' cellpadding='10' style='margin: auto;'>" .
              "<tr>" .
              "<th>No.</th>" .
              "<th>NIM</th>" .
              "<th>Name</th>" .
              "<th>Jurusan</th>" .
              "<th>Fakultas</th>" .
              "<th>Foto Profile</th>" .
              "</tr>";
        foreach ($Input as $DataMhs) {
          echo  "<tr>" .
                "<td>" . $i . "</td>" .
                "<td>" . $DataMhs->getName() . "</td>" .
                "<td>" . $DataMhs->getNim() . "</td>" .
                "<td>" . $DataMhs->getJurusan() . "</td>" .
                "<td>" . $DataMhs->getFakultas() . "</td>" .
                "<td>" . "<img src='" . $DataMhs->getFotoProfile() . "' style='width: 150px;'>" . "</td>" .
                "</tr>";
          $i++;
        }
        echo "</table>";
      }else if ($Menu == 2) { // Setelah CUD
        echo  "<h4 style='text-align: center;'>Data Mahasiswa Sesudah CUD</h4>" .
              "<table border='1' cellspacing='0' cellpadding='10' style='margin: auto;'>" .
              "<tr>" .
              "<th>No.</th>" .
              "<th>NIM</th>" .
              "<th>Name</th>" .
              "<th>Jurusan</th>" .
              "<th>Fakultas</th>" .
              "<th>Foto Profile</th>" .
              "</tr>";
        for ($n = 0; $n < $countDataDel; $n++) {
          echo  "<tr>" .
                "<td>" . $i . "</td>" .
                "<td>" . $Input[$n]->getName() . "</td>" .
                "<td>" . $Input[$n]->getNim() . "</td>" .
                "<td>" . $Input[$n]->getJurusan() . "</td>" .
                "<td>" . $Input[$n]->getFakultas() . "</td>" .
                "<td>" . "<img src='" . $Input[$n]->getFotoProfile() . "' style='width: 150px;'>" . "</td>" .
                "</tr>";
          $i++;
        }
        echo "</table>";
      }
    }

    // Method untuk ubah/update data
    public function Update($Input, $SearchNIM, $Name, $Nim, $Jurusan, $Fakultas, $PathImg) {
      foreach ($Input as $DataMhs) {
        // Method untuk mengubah data array tertentu
        if ($SearchNIM == $DataMhs->getNim()) {
          $DataMhs->setName($Name);
          $DataMhs->setNim($Nim);
          $DataMhs->setJurusan($Jurusan);
          $DataMhs->setFakultas($Fakultas);
          $DataMhs->setFotoProfile($PathImg);
        }
      }
    }

    // Method untuk delete data
    public function Delete($Input, $SearchNIM, &$countDataDel) {
      for ($i = 0; $i < $countDataDel; $i++) {
        // Method untuk menghapus data array tertentu
        if ($SearchNIM == $Input[$i]->getNim()) {
          unset($Input[$i]);
          $countDataDel--;
        }
      }
    }
  
  }
?>