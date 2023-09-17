## Janji
Saya Raisyad Jullfikar NIM 2106238 mengerjakan soal Latihan 5
dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya
maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
Aamiin.

# Tugas LATIHAN5DPBO2023
Download this starter project: [Starter Project](https://drive.google.com/file/d/1TEnEay74nhGcSS9PPzQcxksIlaQhTiZ2/view?usp=sharing) 
* Add more property (component type: any, except text field)
* Add method to reset form
* Refresh table after update and delete
* Add confirmation prompt before delete
* Build project (generate .jar file)

File README berisi desain program, penjelasan alur, dan dokumentasi saat program dijalankan (screenshot/screen record)

## Desain Program
Desain yang saya buat menggunakan 1 Class Utama:
* Mahasiswa
* Menu

`Class Mahasiswa` :
* **NIM**     -> NIM mahasiswa, `string`
* **Nama**    -> Nama mahasiswa, `string`
* **Nilai**   -> Nilai mahasiswa, `string`
* **gender**  -> Gender mahasiswa, `string`

`Class Menu` :
* **Set Tabel**   -> Mengeset Tabel untuk ditampilkan, `void` (`DefaultTableModel`)
* **Insert Data** -> Menambah data, `void`
* **Update Data** -> mengubah data yang dipilih, `void`
* **Delete Data** -> menghapus data yang dipilih, `void`
* **Reset Form**  -> Mereset Form, `void`

_Semua Class diatas dilengkapi dengan setter dan getternya_

## Design GUI
<img width="419" alt="Design_GUI" src="https://user-images.githubusercontent.com/92106283/226414505-d3cbe65d-33fb-41dc-987a-68b50b5ed825.png">

## Alur Program GUI

Text field untuk mengisi data yang berisi nim, nama, nilai

Radio Button untuk mengisi data Gender dari mahasiswanya

Menu pertama (add) -> ketika user mengisi semua data, maka akan tampil sebuah dialog seperti "yakin menambahkan data ?" atau "Yakin?" kemudian, jika diklik cancel maka data data yang telah diisikan untuk diinput tadi akan hilang atau ter-reset, lalu ketika user ingin menginputkan data namun ada sebuah/beberapa data yang tidak terisi, maka akan tampil dialog "isi data dengan lengkap", kurang lebih seperti itu

Menu kedua (update) -> ketika user memilih baris data yang ingin diupdate dan kemudian user mengubah beberapa data dan ketika user mengklik tombol update, maka akan ditampilkan berupa menu "Yakin?" jika user mengklik cancel maka data tersebut ter-reset dan jika user mengklik yes maka data tersebut akan terupdate

Menu ketiga (Delete) -> ketika user memilih baris data yang ingin didelete dan kemudian user tersebut mengklik tombol delete, maka akan ditampilkan berupa menu "Yakin?" jika user mengklik cancel maka data tersebut ter-reset dan jika user mengklik yes maka data tersebut akan terhapus.

## Dokumentasi

**Insert Data**

<img width="419" alt="SS_1_Insert" src="https://user-images.githubusercontent.com/92106283/226415909-ccf6d78e-6cac-47a8-935f-18e2c069ec98.png">

<img width="194" alt="SS_2_Insert" src="https://user-images.githubusercontent.com/92106283/226415950-bae6ad08-a8e3-4d7b-8341-fec1d331935b.png">

<img width="421" alt="SS_3_Insert" src="https://user-images.githubusercontent.com/92106283/226415968-542fb454-713a-4222-b4d0-3c8c80fd410a.png">

**Update Data**

<img width="419" alt="SS_4_Update" src="https://user-images.githubusercontent.com/92106283/226416022-2de76812-471b-462f-bad7-4ff568e65f23.png">

<img width="419" alt="SS_5_Update" src="https://user-images.githubusercontent.com/92106283/226416049-e84a4976-9d51-4f7e-bdda-a8ca36c32050.png">

**Delete Data**

<img width="419" alt="SS_6_Delete" src="https://user-images.githubusercontent.com/92106283/226416102-3750fd86-8f11-4ab1-9013-0ae8e92bbd17.png">

<img width="419" alt="SS_7_Delete" src="https://user-images.githubusercontent.com/92106283/226416127-e10f72a6-b86f-4fc3-a633-9d56dfe256d1.png">

**Error Handling**

<img width="417" alt="Error_Handling" src="https://user-images.githubusercontent.com/92106283/226416172-c498cbd5-984b-4e4b-b6fe-fe9d718b8dd1.png">



















