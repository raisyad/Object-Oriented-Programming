<?php

/******************************************
Asisten Pemrogaman 11
 ******************************************/

include_once("model/Template.class.php");
include_once("model/DB.class.php");
include_once("model/Pasien.class.php");
include_once("model/TabelPasien.class.php");
include_once("view/CreatePasien.php");


$tp = new CreatePasien();

if (!empty($_GET['add'])){
  $tp->create();
} else if (isset($_GET['edit'])) {
  $id = $_GET['edit'];
  $tp->tampilEditForm($id);
} else if (!empty($_GET['update'])) {
  $tp->update();
} else {
  $data = $tp->tampilForm();
}