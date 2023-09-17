<?php
// Saya Raisyad Jullfikar NIM 2106238 mengerjakan Latihan 2 
// dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
// keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

// Import file
  require('CR.php');

  // Deklar var untuk menampung objek CR (Create and Read)
  $cr = new CR();
  // Masukkan data yang diinginkan dan panggil method
  $cr->create(0, rand(2000000000000000, 29999999999999999), "Raisyad Jullfikar", "Laki - Laki", "UPI", "rais@upi.edu", "2106238", "FPMIPA", "Ilkom", './img/img_1.jpg'); 
  $cr->create(1, rand(2000000000000000,29999999999999999), "Ijul Muharam", "Laki - Laki", "UPI", "ijulm@upi.edu", "1607391", "FPMIPA", "Pilkom", './img/img_2.jpg'); 
  // Panggil method read untuk menampilkan data
  $cr->read();
?>
