<?php
// Import File
  require('Mahasiswa.php');
  require('Crud.php');
  $MchnCrud = new Crud(); // Init objek crud
  $countData = 5;
  for ($i = 0; $i < $countData; $i++) {
    $Input[$i] = new Mahasiswa(); // Init objek mhs
    
    // Create Data
    $MchnCrud->Create($Input[$i], 'Anak Ilkom ' . $i, rand(2100000,2109999), 'Ilkom', 'FPMIPA', './img/img_' . $i . '.jpg');
  }
  // Read Data
  $MchnCrud->Read($Input, 1, $countData);
  echo "</br>" . "</br>" . "</br>";
  
  // Init Objek arr 5 & 6
  $Input[5] = new Mahasiswa();
  $Input[6] = new Mahasiswa();
  
  // Create Data
  $MchnCrud->Create($Input[5], 'Anak Ilkom 5', '2106238', 'Ilkom', 'FPMIPA', './img/img_5.jpg');
  $countData++;
  $MchnCrud->Create($Input[6], 'Anak Ilkom 6', '2106531', 'Ilkom', 'FPMIPA', './img/img_6.jpg');
  $countData++;

  // Update and delete data
  $MchnCrud->Update($Input, '2106238', 'Anak Ilkom 7', '2107645', 'Bim. Konseling', 'FIP', './img/img_0.jpg');
  $MchnCrud->Delete($Input, '2106531', $countData);

  // Read Data
  $MchnCrud->Read($Input, 2, $countData);
?>