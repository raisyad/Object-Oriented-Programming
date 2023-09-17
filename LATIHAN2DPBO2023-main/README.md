## LATIHAN2DPBO2023

Saya Raisyad Jullfikar NIM 2106238 mengerjakan Latihan 2 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

## Tugas latihan 2 DPBO 2023
Buatlah program berbasis OOP menggunakan bahasa pemrograman C++, Java, Python, dan PHP yang mengimplementasikan konsep Multi-level Inheritance pada kelas - kelas tersebut:
- Mahasiswa       : NIM, nama, jenis_kelamin, fakultas, prodi
- Human           : NIK, nama, jenis_kelamin
- SivitasAkademik : asal_universitas, email_edu

Compile `Java`   : javac Main.java -> java Main or Compile on VSCode

Compile `c++`    : g++ main.cpp -o a

Compile `Python` : python main.py

Compile `PHP`    : access using xampp

# Desain Program

Code yang saya buat menggunakan 4 class yaitu 3 diantaranya merupakan inheritance multilevel yaitu `Human`, `Sivitas Akademik`, dan `Mahasiswa` dan 1 class `CR` merupakan method Create and Read for the input and show the data.

* Alasan : 
Alasan memilih inheritance multilevel Human <- Sivitas Akademik <- Mahasiswa.
* Karena pada hakikatnya Human adalah objek yang berbentuk dan berupa manusia yang mana mempunyai kedudukan paling tinggi, kemudian class Sivitas Akademik merupakan anak dari Human, karena pada artiannya, Sivitas Akademik merupakan orang - orang yang terlibat dalam kegiatan akademika, dalam kasus ini contohnya adalah Mahasiswa, Dosen atau Warga Akademik lainnya dan objek pada class ini yaitu sama - sama manusia/Human, kemudian class Mahasiswa merupakan anak dari class Sivitas Akademik, karena ketika berkonteks pada Sivitas Akademik, berarti orang yang terlibat didalamnya salah satunya yaitu Mahasiwa.

Adapun atribut yang digunakan yaitu:

● `Human` : NIK, nama, jenis_kelamin `String`

● `SivitasAkademik` : asal_universitas, email_edu `String`

● `Mahasiswa` : NIM, nama, jenis_kelamin, fakultas, prodi, pasfoto (`PHP`) `String`

● `CR` : NIK, nama, jenis_kelamin, asal_universitas, email_edu, NIM, fakultas, prodi `String`

Tiap attribut diatas mempunyai setter dan getternya masing-masing pada class nya masing - masing `Human`, `Sivitas Akademik`, `Mahasiswa` kecuali pada class `CR` yang hanya berisi proses penginputan data dan menampilkan data.

Berikut adalah design dari program dengan menggunakan class diagram.

![UML drawio](https://user-images.githubusercontent.com/92106283/220127290-fe5c5686-e972-4b67-861c-15e160d50339.png)


# Alur program:
Pertama - tama, user akan diberikan sebuah menu 1 - 2 yaitu :
1. Jika user memilih 1, user diharuskan menginputkan beberapa data seperti yang tertera pada Attr diatas
<img width="185" alt="SS-1" src="https://user-images.githubusercontent.com/92106283/218928409-0d2bf3de-086e-4db3-bd04-bb1cf8fa0140.png">

2. Jika user memilih 2, maka user akan diberikan tampilan data - data yang telah diinputkan sebelumnya.
<img width="452" alt="SS-2" src="https://user-images.githubusercontent.com/92106283/218928543-1c905016-5aab-4ee7-a1eb-942e25d8d855.png">

3. Jika user memilih selain ke - 2 menu diatas, maka program yang dijalankan akan berhenti.
<img width="461" alt="SS-3" src="https://user-images.githubusercontent.com/92106283/218928999-1157dea1-a2dc-4ca5-ae8e-9186dd71f744.png">

# Dokumentasi
- Program C++
<img width="638" alt="SS-1 C++" src="https://user-images.githubusercontent.com/92106283/220128308-1c7a24aa-fa3f-44ac-9771-9ea7b420a2fd.png">

- Program Java
<img width="461" alt="SS-3" src="https://user-images.githubusercontent.com/92106283/220128470-d6422856-5c67-45dd-9534-8f132cb2ae4e.png">

- Program PHP
<img width="838" alt="SS-1 PHP" src="https://user-images.githubusercontent.com/92106283/220128516-0a52b1d4-07b7-413a-a54e-59d46efaaa1f.png">
