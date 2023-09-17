## Janji
Saya Raisyad Jullfikar NIM 2106238 mengerjakan Latihan 1 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

## Tugas latihan 1 DPBO 2023
Buatlah program berbasis OOP menggunakan bahasa pemrograman C++, Java, Python, dan PHP yang menampilkan informasi daftar mahasiswa (sekumpulan objek mahasiswa) dan memiliki fitur menambah, mengubah, dan menghapus data. Setiap mahasiswa memiliki data nama, NIM, program studi, fakultas, dan foto profil (khusus bahasa PHP).

# Desain Program
Program yang saya buat menggunakan 2 class, yaitu :
1. class Mahasiswa -> Set and Getter Data for Mahasiswa
2. class Crud -> Created Process of CRUD for Data of Object Mahasiswa

Pada class `Mahasiswa`, terdapat attr - attr antara lain :
* **Name**     -> Berisi value name mhs,     `String`
* **Nim**      -> Berisi value nim mhs,      `String`
* **Jurusan**  -> Berisi value jurusan mhs,  `String`
* **Fakultas** -> Berisi value fakultas mhs, `String`
* **PathImg**  -> Berisi value path img mhs, `String` (PHP)

Tiap attribut diatas mempunyai setter dan getternya masing-masing pada class `Mahasiswa`.

Pada class `Crud` juga sama, namun bedanya hanya digunakan untuk pemrosesan data seperti `Create`, `Read`, `Update` and `Delete` serta pada class ini mempunyai 4 method, diantaranya :
* **Create**     -> untuk menambahkan data mhs
* **Read**       -> untuk menampilkan data mhs
* **Update**     -> untuk mengubah data mhs
* **Delete**     -> untuk menghapus data mhs


# Alur Program
Alur program pada code setiap bahasa yang saya buat kurang lebih sama, kecuali pada bahasa PHP yang mana inputan serta proses dilakukan secara hardcode. Kemudian pada program selain PHP, tampilannya berupa menu.

Pertama - tama, ketika menjalankan program `Java`, `C++` dan `Python`, pengguna dapat melihat/memilih menu 1 - 4 untuk menjalankan sebuah perintah yang mana sebagai berikut :

<img width="212" alt="SS_GITHUB1" src="https://user-images.githubusercontent.com/92106283/218761834-7b0d43b8-a0d5-43d8-8740-5b1b26375854.png">

1. Jika user memilih menu 1, maka user diharuskan menginputkan beberapa data `Nim`, `nama`, `jurusan`, dan `fakultas`. Pada penginputan data, terdapat error handling yang mana, ketika user menginputkan data dan data tersebut sudah ada dalam data terinput, maka data yang user inputkan tidak akan termasukkan kedalam list.
<img width="197" alt="SS_GITHUB2" src="https://user-images.githubusercontent.com/92106283/218762167-cb042697-e612-489a-8475-98edfad4e924.png">

2. Jika user memilih menu 2, maka user diminta untuk menginputkan `NIM` yang akan diubah.
<img width="235" alt="SS_GITHUB3" src="https://user-images.githubusercontent.com/92106283/218762524-81cf9d81-4133-4dff-8507-a28a36b6bb1b.png">

ketika nim yang dituju terdapat data, maka user disuguhkan menu kembali yang mana
- 1. Mengubah Nama
- 2. Mengubah Jurusan
- 3. Mengubah Fakultas
- 4. Mengubah keseluruhan data
<img width="170" alt="SS_GITHUB4" src="https://user-images.githubusercontent.com/92106283/218762699-2626a26c-a82d-48bf-82bb-21fea897d297.png">

3. Jika user memilih menu 3, maka user diminta untuk menginputkan `NIM` yang akan didelete/dihapus. Jika data yang dituju terdapat pada list, maka data dengan NIM tersebut akan terhapus.
<img width="299" alt="SS_GITHUB5" src="https://user-images.githubusercontent.com/92106283/218762954-c6101aea-0d31-4e9f-b23f-319d5167121a.png">
<img width="260" alt="SS_GITHUB6" src="https://user-images.githubusercontent.com/92106283/218763126-ef86ab5c-346f-4948-a090-d4ceb9051d9f.png">

4. Jika user memilih menu 4, maka user akan diberikan tampilan data - data mahasiswa yang telah diinputkan sebelumnya.
<img width="293" alt="SS_GITHUB7" src="https://user-images.githubusercontent.com/92106283/218763401-66f1b56b-de81-4bfa-a8a3-10bf301305eb.png">

5. Jika user memilih selain ke - 4 menu diatas, maka program yang dijalankan akan berhenti.
<img width="293" alt="SS_GITHUB8" src="https://user-images.githubusercontent.com/92106283/218763511-e75376c9-0fe6-4a00-8dc3-7632ba115903.png">

# Dokumentasi
* **Program JAVA**
<img width="335" alt="SS_DOKUM1" src="https://user-images.githubusercontent.com/92106283/218764145-5d470734-143c-4eff-abe4-c2be4005b6cc.png">
<img width="298" alt="image" src="https://user-images.githubusercontent.com/92106283/218764290-5de7f90c-165e-43b1-97b1-0e4c79f510ac.png">

* **Program PHP**
<img width="336" alt="SS_DOKUM2" src="https://user-images.githubusercontent.com/92106283/218764866-f78e694b-a179-4f48-bbe2-87f858083b11.png">
<img width="248" alt="SS_DOKUM3" src="https://user-images.githubusercontent.com/92106283/218765009-2bf6f7ad-47ec-4196-9197-76db5b8cf38e.png">
