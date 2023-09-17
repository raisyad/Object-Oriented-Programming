# TP1DPBO2023
Saya Raisyad Jullfikar NIM 2106238 mengerjakan TP - 1 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

## Design Program
![TP1DPBO 1 drawio](https://user-images.githubusercontent.com/92106283/224962123-9d95d518-488a-4f12-bcde-e3964041226e.png)

Program didesain menjadi 12 class
* **Human**
* **Sivitas Akademik**
* **Prodi**
* **Fakultas**
* **Mahasiswa**
* **Dosen**
* **Asisten**
* **Organisasi**
* **Anggota Organisasi**
* **Kegiatan**
* **Barang**
* **Course**

## Penjelasan Design :
- 1. `Human` dengan `Sivitas Akademik`

      Dalam hal ini, Class `Human` merupakan objek berupa Manusia/Makhluk Hidup dan kemudian Class `Sivitas Akademik` pun merupakan objek yang sama pula yaitu berupa Manusia/Makhluk Hidup, namun dalam konteks ini, tidak semua manusia adalah (is-a) Sivitas Akademika, maka dari itu class `Sivitas Akademik` merupakan child dari class `Human`

- 2. `Sivitas Akademik` dengan `Dosen`

      Dalam hal ini, Class `Sivitas Akademik` merupakan objek berupa Manusia/Makhluk hidup dan kemudian Class `Dosen` pun merupakan objek yang sama pula yaitu berupa Manusia/Makhluk Hidup, namun dalam konteks ini, tidak semua Sivitas Akademika adalah (is-a) Dosen, dalam hal ini pula relasi keduanya tidak bisa dibalik, maka dari itu class `Dosen` merupakan child dari class `Sivitas Akademik`
      
- 3. `Sivitas Akademik` dengan `Mahasiswa`

      Dalam hal ini, Class `Sivitas Akademik` merupakan objek berupa Manusia/Makhluk hidup dan kemudian Class `Mahasiswa` pun merupakan objek yang sama pula yaitu berupa Manusia/Makhluk Hidup, namun dalam konteks ini, tidak semua Sivitas Akademika adalah (is-a) Mahasiswa, karena Sivitas Akademika (diantaranya : Mahasiswa, Dosen, Tendik, dll), dalam hal ini pula relasi keduanya tidak bisa dibalik, maka dari itu class `Mahasiswa` merupakan child dari class `Sivitas Akademik`

- 4. `Fakultas` dengan `Prodi`

      Dalam hal ini, Class `Fakultas` mengcomposite Class `Prodi`. Karena pada hierarki/kedudukannya, Fakultas adalah kedudukan paling tinggi serta langsung dibawahi oleh Universitas, yang mana berarti Fakultas memiliki semua data - data tiap prodi yang terdapat pada Fakultas tersebut. Maka dari itu, Class `Fakultas` mengcomposite (has-a) Class `Prodi`.
      
- 5. `Prodi` dengan (`Dosen`, `Mahasiswa`)

      Dalam hal ini, Class `Prodi` mengcomposite kedua class yaitu Class `Dosen`, dan `Mahasiswa`. Karena pada hierarkinya/Kedudukannya, Prodi(Program Studi) adalah kedudukan paling tinggi setelah Fakultas yang mana berarti didalam Prodi itu terdapat Dosen (Yang Mengajar) dan Mahasiswa (Yang Diajar). Maka dari itu, lebih masuk akal ketika Prodi memiliki (has-a) Dosen, dan Mahasiswa.
      
- 6. `Mahasiswa` dengan `AnggotaOrganisasi`

      Dalam hal ini, Class `Mahasiswa` merupakan objek berupa Manusia/Makluk Hidup yang sedang menunjang studinya di sebuah universitas, kemudian Class `Anggota Organisasi` merupakan objek yang sama pula berupa Manusia/Makluk Hidup yang sedang menunjang studinya di sebuah universitas. Maka dari itu class `Anggota Organisasi` merupakan child dari class `Mahasiswa`.
      
- 7. `Organisasi` dengan (`Anggota Organisasi` dan `Kegiatan`)

      Dalam hal ini class `Organisasi` mengcomposite kedua class yaitu class `Anggota Organisasi`, dan `Kegiatan`. Karena didalam sebuah organisasi pasti memiliki anggota dan kegiatan didalamnya. Maka dari itu dalam konteks ini, Organisasi (has-a) `Anggota Organisasi` dan `Kegiatan`
      
- 8. `Mahasiswa` dengan (`Course` dan `Barang`)

      Dalam hal ini class `Mahasiswa` mengcomposite kedua class yaitu class `Course`, dan `Barang`. Karena pada umumnya, setiap mahasiswa/kumpulan mahasiswa pasti mempunyai/memiliki (has-a) matakuliah(1/banyak) serta barang(1/banyak). Maka dari itu dalam konteks ini, Mahasiswa (has-a) `Course` dan `Barang`.
      
- 9. `Dosen` dengan (`Course`, `Barang` dan `Asisten`)

      Dalam hal ini class `Dosen` mengcomposite ketiga class yaitu class `Course`, `Barang`, dan `Asisten`. Karena pada umumnya, setiap Dosen pasti mempunyai/memiliki (has-a) matakuliah(1/banyak mata kuliah yang diampu), kemudian mempunyai/memiliki (has-a) barang(1/banyak kepemilikan barang), dan dosen mempunyai 1/banyak asisten pada setiap mata kuliah yang diampunya. Maka dari itu dalam konteks ini, Dosen (has-a) `Course`, `Barang` dan `Asisten`
      
- 10. `Asisten` dengan `Mahasiswa`

      Dalam hal ini class `Asisten` mengcomposite class `Mahasiswa`. Karena setiap asisten itu adalah seorang Mahasiswa (dalam hal ini asprak). Maka dari itu, Asisten (has-a) `Mahasiswa`

## Attribut di setiap Classnya :

Pada class `Human` terdapat lima attribut :

* **NIK** -> berisi NIK Manusia (`String`)
* **name** -> berisi name Manusia (`String`)
* **jkelamin** -> berisi jenis kelamin Manusia (`String`)
* **umur** -> berisi umur Manusia (`int`)
* **statusPekerjaan** -> berisi StatusPekerjaan Manusia(Mhs/Dosen) (`String`)

Pada class `Sivitas Akademik` terdapat dua attribut :

* **asal_univ** -> berisi asal_universitas Mhs/Dosen (`String`)
* **email_univ** -> berisi email_univ Mhs/Dosen (`String`)

Pada class `Dosen` terdapat enam attribut :

* **NIP** -> berisi NIP Dosen (`String`)
* **keahlian** -> berisi keahlian Dosen (`String`)
* **fakultas** -> berisi fakultas Dosen (`String`)
* **barang** -> berisi data kepemilikan barang dosen (`barang`)
* **asisten** -> berisi data asisten dari dosen tsb (`asisten`)
* **matkul** -> berisi data matkul yang diampu oleh dosen tsb (`matkul`)

Pada class `Mahasiswa` terdapat enam attribut :

* **NIM** -> berisi NIM Mahasiswa (`String`)
* **fakultas** -> berisi fakultas Mahasiswa (`String`)
* **prodi** -> berisi prodi Mahasiswa (`String`)
* **barang** -> berisi data kepemilikan barang mahasiswa (`barang`)
* **matkul** -> berisi data matkul yang diampu (`course`)
* **calculate** -> berisi data rata-rata nilai perolehan oleh mhs tsb (`String`)

Pada class `Prodi` terdapat empat attribut :

* **id_prodi** -> berisi id_prodi dari prodi tsb (`String`)
* **nameProdi** -> berisi nameProdi (`String`)
* **dosen** -> berisi kumpulan data dosen dari prodi tsb (`list dari class dosen`)
* **mahasiswa** -> berisi kumpulan data mahasiswa dari prodi tsb (`list dari class mahasiswa`)

Pada class `Fakultlas` terdapat tiga attribut :

* **id_fakultas** -> berisi id fakultas (`String`)
* **nameFakultas** -> berisi nameFakultas (`String`)
* **prodi** -> berisi data prodi dari fakultas tsb (`prodi`)

Pada class `Asisten` terdapat empat attribut :

* **idAsisten** -> berisi idAsisten (`String`)
* **namePrak** -> berisi namePrak yang mhs/assisten tsb sedang bawahi (`String`)
* **mhs** -> berisi data mhs yang menjadi asisten (`mhs`)
* **status** -> berisi status(asisten/dll) (`String`)

Pada class `Organisasi` terdapat enam attribut :

* **idOrganisasi** -> berisi id dari Organisasi tsb (`String`)
* **tingkatanOrganisasi** -> berisi tingkatan/level dari organisasi tsb, ex : univ,fakultas,prodi (`String`)
* **nameOrganisasi** -> berisi nama dari organisasi tsb (`String`)
* **ketuaOrganisasi** -> berisi ketua dari organisasi tsb (`String`)
* **anggotaOrganisasi** -> berisi data anggota yang masuk kedalam organisasi (`anggotaOrganisasi`)
* **kegiatanOrganisasi** -> berisi data kegiatan-kegiatan dari organisasi tsb (`kegiatan`)

Pada class `Anggota Organisasi` terdapat dua attribut :

* **idAnggota** -> berisi id anggota dari organisasi tsb (`String`)
* **jabatan** -> berisi jabatan dari organisasi tsb (`String`)

Pada class `Kegiatan` terdapat empat attribut :

* **idKegiatan** -> berisi id kegiatan dari organisasi tsb (`String`)
* **namaKegiatan** -> berisi nama kegiatan dari organisasi tsb (`String`)
* **ketuaPelaksana** -> berisi ketuaPelaksana dari kegiatan di organisasi tsb (`String`)
* **statusKegiatan** -> berisi status dari kegiatannya (SudahTerlaksana/BelumTerlaksana) (`String`)

Pada class `Barang` terdapat tiga attribut :

* **idBarang** -> berisi id dari Barang (`String`)
* **JenisBarang** -> berisi jenis dari Barangnya (Electronic/non) (`String`)
* **DetailBarang** -> berisi detail dari barangnya (ex : buku, spidol, laptop) (`String`)

Pada class `Course` terdapat tiga attribut :

* **namaMK** -> berisi nama MataKuliah (`String`)
* **nilaiMK** -> berisi nilai dari MataKuliah (`int`)
* **nilaiPrak** -> berisi nilai dari Praktikum (`int`)

## Alur Program

Alur program dilakukan secara hardcode namun user disuguhkan beberapa menu 
1 - > data umum
2 - > data mhs
3 - > data dosen
4 - > data matakul
5 - > data organisasi
6 - > data spesifik
Nah, pada menu data spesifik terdapat 6 inputan (Resyad, Pahri, Angga, Gatsby, Mila dan Mrs.Rose) yang mana orang - orang tsb memiliki menu berbeda walau ada yang sama (seperti mhs yang bergabung kedalam organisasi -> Pahri, Angga, Gatsby). Ketiga orang yang bergabung kedalam organisasi tsb dapat menjalankan proker/merancang proker/menghadiri evaluasi, namun dalam hal ini ketika sebuah proker belum terlaksana, seseorang tidak bisa menghadiri evaluasi dalam proker tsb (jadi harus diselesaikan dulu baru bisa mengikuti evaluasi).

Kemudian untuk asprak (Mila) bisa memberikan tugas/nilai dan mengajar namun ketika nilai dari dosen pengampu belum diinputan, maka mila tidak bisa memberikan nilai untuk mahasiswa lainnya (dalam hal ini nilai prak).

## Dokumentasi
<img width="311" alt="SS-1_DataUmum" src="https://user-images.githubusercontent.com/92106283/224963570-3fa0db42-0ce8-4503-b2fe-76b7fb0c156d.png">

<img width="331" alt="SS-2_DataMhs" src="https://user-images.githubusercontent.com/92106283/224963620-c8f22eaa-dabb-44c3-8d4b-8317db6b5791.png">

<img width="350" alt="SS-3_DataDosen" src="https://user-images.githubusercontent.com/92106283/224963644-fb17c6a6-c004-4c1a-8a36-e560eec32a17.png">

<img width="224" alt="SS-4_DataMatkul" src="https://user-images.githubusercontent.com/92106283/224963676-fe07e816-7f5a-4fdc-b22e-8e78f76f629b.png">

<img width="487" alt="SS-5_DataOrganisasi" src="https://user-images.githubusercontent.com/92106283/224963709-9efe3218-bfca-403c-a705-219316f314b7.png">

<img width="263" alt="SS-8_Interaksi-1" src="https://user-images.githubusercontent.com/92106283/224963738-43bddf8d-8311-4415-bd7a-4adf21fbb4da.png">

<img width="413" alt="SS-9_Interaksi-2" src="https://user-images.githubusercontent.com/92106283/224963755-f788d2fa-4725-41bc-8c7e-533ed37d69f3.png">

(untuk Dokumentasi Lebih lengkap ada pada Folder Screenshot yang terdapat pada Folder Java)












