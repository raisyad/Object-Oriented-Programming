<?php


include_once("kontrak/KontrakFormPasien.php");
include_once("presenter/ProsesFormPasien.php");

class CreatePasien {
	private $prosespasien; //presenter yang dapat berinteraksi langsung dengan view
	private $tpl;

	function __construct()
	{
		//konstruktor
		$this->prosespasien = new ProsesFormPasien();
	}

	function tampilForm()
	{
    $this->prosespasien->prosesDataPasien();
    $data = null;
    $title = "Create";

    $data .= "
    <form method='POST' action='create.php?add=true'>
      <label for='nik'>NIK:</label>
      <input type='text' id='nik' name='nik' required>

      <label for='nama'>Nama:</label>
      <input type='text' id='nama' name='nama' required>

      <label for='tempat'>Tempat</label>
      <input type='text' id='tempat' name='tempat' required>

      <label for='tl'>Tanggal Lahir</label>
      <input type='date' id='tl' name='tl' required>

      <label for='gender'>Gender:</label>
      <select id='gender' name='gender' required>
        <option value=''>Select Gender</option>
        <option value='Laki-Laki'>Laki-Laki</option>
        <option value='Perempuan'>Perempuan</option>
      </select>

      <label for='email'>Email:</label>
      <input type='email' id='email' name='email' required>

      <label for='telp'>Telepon:</label>
      <input type='text' id='telp' name='telp' required>

      <button type='submit' class='btn btn-primary' name='create'>Create</button>
    </form>";

		// semua terkait tampilan adalah tanggung jawab view
		// Membaca template skin.html
		$this->tpl = new Template("templates/create.html");

		// Mengganti kode Data_Form dengan data inputan form
    $this->tpl->replace("TITLE", $title);
		$this->tpl->replace("DATA_FORM", $data);

		// Menampilkan ke layar
		$this->tpl->write(); 
	}

  function tampilEditForm($id) {
    $this->prosespasien->prosesDataPasien();
    $data = null;
    $genderSelect = null;
    $title = "Update";
    $idp = $this->prosespasien->getId($id);
    $nik = $this->prosespasien->getNik($id);
    $nama = $this->prosespasien->getNama($id);
    $tempat = $this->prosespasien->getTempat($id);
    $tl = $this->prosespasien->getTl($id);
    $gender = $this->prosespasien->getGender($id);
    $email = $this->prosespasien->getEmail($id);
    $telp = $this->prosespasien->getTelp($id);
    if ($gender == 'Laki-Laki') {
      $genderSelect .= "
        <option value=''>Select Gender</option>
        <option value='Laki-Laki' selected>Laki-laki</option>
        <option value='Perempuan'>Perempuan</option>
      ";
    } else if ($gender == 'Perempuan') {
      $genderSelect .= "
        <option value=''>Select Gender</option>
        <option value='Laki-Laki'>Laki-laki</option>
        <option value='Perempuan' selected>Perempuan</option>
      ";
    }
    $data .= "
    <form method='POST' action='create.php?update=$idp'>
      <input type='hidden' id='id' name='id' value='$idp'>
      <label for='nik'>NIK:</label>
      <input type='text' id='nik' name='nik' value='$nik' required>

      <label for='nama'>Nama:</label>
      <input type='text' id='nama' name='nama' value='$nama' required>

      <label for='tempat'>Tempat</label>
      <input type='text' id='tempat' name='tempat' value='$tempat' required>

      <label for='tl'>Tanggal Lahir</label>
      <input type='date' id='tl' name='tl' value='$tl' required>

      <label for='gender'>Gender:</label>
      <select id='gender' name='gender' required>
        . ' $genderSelect '.
      </select>

      <label for='email'>Email:</label>
      <input type='email' id='email' name='email' value='$email' required>

      <label for='telp'>Telepon:</label>
      <input type='text' id='telp' name='telp' value='$telp' required>

      <button type='submit' class='btn btn-primary' name='save'>Save</button>
    </form>";

		// semua terkait tampilan adalah tanggung jawab view
		// Membaca template skin.html
		$this->tpl = new Template("templates/create.html");

		// Mengganti kode Data_Form dengan data inputan form
		$this->tpl->replace("TITLE", $title);
		$this->tpl->replace("DATA_FORM", $data);

		// Menampilkan ke layar
		$this->tpl->write(); 
  }

  function create(){
    $datapasien = array(
      'nik' => $_POST['nik'],
      'nama' => $_POST['nama'],
      'tempat' => $_POST['tempat'],
      'tl' => $_POST['tl'],
      'gender' => $_POST['gender'],
      'email' => $_POST['email'],
      'telp' => $_POST['telp']
    );

    $this->prosespasien->create($datapasien);
  }

  function update() {
    $datapasien = array(
        'id' => $_POST['id'],
        'nik' => $_POST['nik'],
        'nama' => $_POST['nama'],
        'tempat' => $_POST['tempat'],
        'tl' => $_POST['tl'],
        'gender' => $_POST['gender'],
        'email' => $_POST['email'],
        'telp' => $_POST['telp']
    );

    $this->prosespasien->edit($datapasien);
  }
}
