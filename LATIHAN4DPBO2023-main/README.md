# LATIHAN4DPBO2023

## Janji
Saya Raisyad Jullfikar NIM 2106238 mengerjakan soal Latihan 4 dalam mata kuliah Desain Pemrograman Berorientasi 
Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

## Deskripsi Tugas
Buatlah program berbasis OOP menggunakan bahasa pemrograman C++ dan Python  yang mengimplementasikan konsep inheritance, composition, dan array of object pada kelas-kelas tersebut:
* Mahasiswa: NIM, nama, jenis_kelamin, fakultas, prodi
* Human: NIK, nama, jenis_kelamin
* SivitasAkademik: asal_universitas, email_edu
* Dosen: NIP, nama, jenis_kelamin, fakultas, prodi, pend_terakhir, keahlian
* Course: nama_matakuliah, 
* Program Studi: nama_prodi, kode, course

## Desain Program
![LAT3Uml drawio](https://user-images.githubusercontent.com/92106283/223162544-fb03fea7-b940-4597-9b55-1b52d07d4201.png)

Program didesain menjadi enam class
* **Human**
* **Sivitas**
* **Dosen**
* **Mahasiswa**
* **Prodi**
* **Course**

## Penjelasan Desain : 
- 1. `Human` dengan `Sivitas Akademik`

      Dalam hal ini, Class `Human` merupakan objek berupa Manusia/Makhluk Hidup dan kemudian Class `Sivitas Akademik` pun merupakan objek yang sama pula yaitu berupa Manusia/Makhluk hidup, namun dalam konteks ini, tidak semua manusia adalah (is-a) Sivitas Akademika, maka dari itu class `Sivitas Akademik` merupakan child dari class `Human`. 

- 2. `Sivitas Akademik` dengan `Dosen`

      Dalam hal ini, Class `Sivitas Akademik` merupakan objek berupa Manusia/Makhluk hidup dan kemudian Class `Dosen` pun merupakan objek yang sama pula yaitu berupa Manusia/Makhluk Hidup, namun dalam konteks ini, tidak semua Sivitas Akademika adalah (is-a) Dosen, dalam hal ini pula relasi keduanya tidak bisa dibalik, maka dari itu class `Dosen` merupakan child dari class `Sivitas Akademik`
      
- 3. `Sivitas Akademik` dengan `Mahasiswa`

      Dalam hal ini, Class `Sivitas Akademik` merupakan objek berupa Manusia/Makhluk hidup dan kemudian Class `Mahasiswa` pun merupakan objek yang sama pula yaitu berupa Manusia/Makhluk Hidup, namun dalam konteks ini, tidak semua Sivitas Akademika adalah (is-a) Mahasiswa, karena Sivitas Akademika (diantaranya : Mahasiswa, Dosen, Tendik, dll), dalam hal ini pula relasi keduanya tidak bisa dibalik, maka dari itu class `Mahasiswa` merupakan child dari class `Sivitas Akademik`
      
- 4. `Prodi` dengan (`Dosen`, `Mahasiswa`, `Course`)

      Dalam hal ini, Class `Prodi` mengcomposite ketiga class yaitu `Dosen`, `Mahasiswa`, dan `Course` Karena pada hierarkinya/Kedudukannya, Prodi(Program Studi) adalah kedudukan paling tinggi setelah Fakultas yang mana berarti didalam Prodi itu terdapat Dosen (Yang Mengajar), kemudian Mahasiswa (Yang Diajar), dan Course (Hal/Sesuatu yang diajarkan). Maka dari itu, lebih masuk akal ketika Prodi memiliki (has-a) Dosen, Mahasiswa, dan Course.

## Attribut di setiap Classnya : 

Pada class `Human` terdapat tiga attribut :
* **NIK**           -> berisi NIK manusia(Dosen/Mhs)           (`String`)
* **name**          -> berisi nama manusia(Dosen/Mhs)          (`String`)
* **jenis_kelamin** -> berisi jenis kelamin manusia(Dosen/Mhs) (`String`)

Pada class `Sivitas Akademik` terdapat dua attribut :
* **asal_universitas** -> berisi asal univ (Dosen/Mhs) (`String`)
* **email_edu**        -> berisi email edu (Dosen/mhs) (`String`)

Pada class `Dosen` terdapat empat attribut :
* **NIP**          -> berisi NIP (Nomor Induk Pegawai) (Dosen) (`String`)
* **pendterakhir** -> berisi pendidikan terakhir (Dosen)       (`String`)
* **keahlian**     -> berisi keahlian (Dosen)                  (`String`)
* **fakultas**     -> berisi asal fakultas (Dosen)             (`String`)

Pada class `Mahasiswa` terdapat dua attribut :
* **NIM**       -> berisi NIM (Nomor Induk Mahasiswa) (Mhs) (`String`)
* **fakultas**  -> berisi asal fakultas (Mhs)               (`String`)

Pada Class `Course` terdapat satu attribut :
* **namaMK**  -> berisi nama Mata Kuliah dari sebuah Prodi (`String`)

Pada Class `Prodi` terdapat lima attribut :
* **namaProdi** -> berisi nama dari Prodi   (`String`)
* **kode**      -> berisi kode dari Prodi   (`String`)
* **course**    -> berisi kumpulan mata kuliah dari prodi tsb (`list dari class Course`)
* **mhs**       -> berisi kumpulan data mahasiswa yang berada pada prodi tsb (`list dari class Mahasiswa`)
* **dosen**     -> berisi kumpulan data dosen yang berada pada prodi tsb (`list dari class Dosen`)


Attribut - attribut diatas, dilengkapi dengan setter dan getternya.


## Alur Program
Inputan dilakukan secara hardcode disetiap bahasa pemrograman diatas, dan ketika program dicompile, user akan ditampilkan sejumlah data list mhs, list dosen, list mk dan data dari prodi tsb

## Dokumentasi
* Pada Bahasa Pemrograman Python

<img width="229" alt="SS4" src="https://user-images.githubusercontent.com/92106283/223443197-f76c963a-92c8-4785-afbc-8c88f2b3dccf.png">

<img width="233" alt="SS5" src="https://user-images.githubusercontent.com/92106283/223443216-94776d16-4561-4634-98f0-e39c25d76fe9.png">

* Pada Bahasa Pemrograman C++

<img width="338" alt="SS4" src="https://user-images.githubusercontent.com/92106283/223443375-e1760c0b-76c8-47d9-8e1f-caa5d7cc1bc5.png">

<img width="250" alt="SS5" src="https://user-images.githubusercontent.com/92106283/223443455-ccb55978-3dde-4879-9d0f-c80b822c36a7.png">
