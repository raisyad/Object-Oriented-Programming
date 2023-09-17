
// Import Library
import java.util.*;

// Class Crud yang berisi data list dari class mahasiswa yang akan
// digunakan untuk memodifikasi data list tsb, seperti
// Create, Read/Show, Update, Delete
public class Crud {
  // CONSTRUCTOR
  public Crud() {
  }

  // Method untuk create data
  public void Create(ArrayList<Mahasiswa> list) {
    String name, nim, jurusan, fakultas;
    int flag = 0, i = 0;
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    Mahasiswa dataIn = new Mahasiswa();
    System.out.println("Input Data Name:");
    name = sc.nextLine();
    System.out.println("Input Data NIM:");
    nim = sc.next();
    System.out.println("Input Data Jurusan:");
    jurusan = sc.next();
    System.out.println("Input Data Fakultas:");
    fakultas = sc.next();

    // Data yang sudah ada didalam list dicek, jika ada nim yang sama, maka data
    // tidak bisa diinputkan
    for (i = 0; i < list.size(); i++) {
      if (i == 0) {
        for (int count = 0; count < 3; count++)
          System.out.println("Memeriksa..." + (count + 1));
      }
      if (nim == list.get(i).getNim())
        flag = 1;
    }

    if (flag == 1) { // Ketika Data yang diinputkan sudah ada
      System.out.print("\033[H\033[2J");
      System.out.flush();
      System.out
          .print("\n======================\nData sudah ada dan tidak berhasil diinputkan\n======================\n\n");
    } else if (flag == 0) { // Ketika Data yang diinputkan belum ada
      System.out.print("\033[H\033[2J");
      System.out.flush();
      System.out
          .print("\n======================\nData belum ada dan berhasil diinputkan\n======================\n\n");
      dataIn.setName(name);
      dataIn.setNim(nim);
      dataIn.setJurusan(jurusan);
      dataIn.setFakultas(fakultas);
      list.add(dataIn);
    }

  }

  // Method untuk ubah/update data
  public void Update(ArrayList<Mahasiswa> list, int flag) {
    String nimSearch, name, nim, jurusan, fakultas;
    int menuUpdate = 0;
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    System.out.println("Input Data NIM yang akan diubah:");
    // Input data yang akan diubah
    nimSearch = sc.next();
    for (int i = 0; i < list.size(); i++) {
      if (nimSearch.equals(list.get(i).getNim())) {
        // Jika data tsb ada, maka pilih menu kembali
        String tempName, tempNim, tempJur, tempFak;
        System.out.println(
            "\nPilih Menu Update\n1. Update Nama\n2. Update Jurusan\n3. Update Fakultas\n4. Update Semua");
        menuUpdate = sc.nextInt();
        if (menuUpdate == 1) { // Menu 1 Untuk mengubah nama saja
          System.out.println("Input Data Name:");
          sc.nextLine();
          name = sc.nextLine();
          tempNim = list.get(i).getNim();
          tempJur = list.get(i).getJurusan();
          tempFak = list.get(i).getFakultas();

          Mahasiswa dataIn = new Mahasiswa();

          dataIn.setName(name);
          dataIn.setNim(tempNim);
          dataIn.setJurusan(tempJur);
          dataIn.setFakultas(tempFak);

          list.set(i, dataIn);

          flag = 1;
          System.out.print("\033[H\033[2J");
          System.out.flush();
          System.out.println("\n=================\nData berhasil diUpdate\n=================\n");
        } else if (menuUpdate == 2) { // Menu 2 Untuk mengubah jurusan saja
          System.out.println("Input Data Jurusan:");
          jurusan = sc.next();
          tempName = list.get(i).getName();
          tempNim = list.get(i).getNim();
          tempFak = list.get(i).getFakultas();

          Mahasiswa dataIn = new Mahasiswa();

          dataIn.setName(tempName);
          dataIn.setNim(tempNim);
          dataIn.setJurusan(jurusan);
          dataIn.setFakultas(tempFak);

          list.set(i, dataIn);

          flag = 1;
          System.out.print("\033[H\033[2J");
          System.out.flush();
          System.out.println("\n=================\nData berhasil diUpdate\n=================\n");
        } else if (menuUpdate == 3) { // Menu 3 Untuk mengubah fakultas saja
          System.out.println("Input Data Fakultas:");
          fakultas = sc.next();
          tempName = list.get(i).getName();
          tempNim = list.get(i).getNim();
          tempJur = list.get(i).getJurusan();

          Mahasiswa dataIn = new Mahasiswa();

          dataIn.setName(tempName);
          dataIn.setNim(tempNim);
          dataIn.setJurusan(tempJur);
          dataIn.setFakultas(fakultas);

          list.set(i, dataIn);

          flag = 1;
          System.out.print("\033[H\033[2J");
          System.out.flush();
          System.out.println("\n=================\nData berhasil diUpdate\n=================\n");
        } else if (menuUpdate == 4) { // Menu 4 Untuk mengubah keseluruhan data
          sc.nextLine();
          name = sc.nextLine();
          nim = sc.next();
          jurusan = sc.next();
          fakultas = sc.next();

          Mahasiswa dataIn = new Mahasiswa();

          dataIn.setName(name);
          dataIn.setNim(nim);
          dataIn.setJurusan(jurusan);
          dataIn.setFakultas(fakultas);
          list.set(i, dataIn);

          flag = 1;
          System.out.print("\033[H\033[2J");
          System.out.flush();
          System.out.println("\n=================\nData berhasil diUpdate\n=================\n");
        } else { // Jika tidak memilih menu yang tersedia
          System.out.print("\033[H\033[2J");
          System.out.flush();
          System.out.println("\nTidak ada dimenu, silahkan pilih kembali nanti ^_^");
        }
      }
    }
    if (flag == -1) { // Jika belum terjadi update atau nim yang dicari tidak ada
      System.out.print("\033[H\033[2J");
      System.out.flush();
      System.out.println("NIM yang anda cari tidak ada\n");
    }
  }

  // Method untuk delete data
  public void Delete(ArrayList<Mahasiswa> list, int flag) {
    String nimSearch;
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    System.out.println("Input Data NIM yang akan dihapus:\n");
    // Input data yang akan dihapus
    nimSearch = sc.next();
    for (int i = 0; i < list.size(); i++) {
      if (nimSearch.equals(list.get(i).getNim())) { // Jika data yang akan dihapus ada, maka lakukan delete
        list.remove(i);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Data Terhapus\n");
        flag = 1; // Penanda telah terjadi penghapusan data
      }
    }
    if (flag == -1) { // Jika belum terjadi penghapusan data atau nim yang dicari tidak ada
      System.out.print("\033[H\033[2J");
      System.out.flush();
      System.out.println("NIM yang anda cari tidak ada\n");
    }
  }

  // Method untuk Read/show/view data
  public void Read(ArrayList<Mahasiswa> list) {
    // 2 kode dibawah ini merupakan clscr untuk java
    // Digunakan untuk membersihkan cmd karena menu yang sembrawut
    System.out.print("\033[H\033[2J");
    System.out.flush();
    // Dibawah ini merupakan proses Menampilkan data mhs
    // dengan penggunaan table yang akan mencari string
    // terpanjang terlebih dahulu agar menampilkan spasi
    // yang rapih
    System.out.println("\nList Data Mhs yang telah diinputkan: \n");
    int count = 1, lengthName = 4,
        lengthNim = 3,
        lengthJurusan = 7,
        lengthFakultas = 8,
        temps = 0;

    // Find Length
    for (int i = 0; i < list.size(); i++) {
      count++;
      if (lengthName < list.get(i).getName().length())
        lengthName = list.get(i).getName().length();
      if (lengthNim < list.get(i).getNim().length())
        lengthNim = list.get(i).getNim().length();
      if (lengthJurusan < list.get(i).getFakultas().length())
        lengthJurusan = list.get(i).getFakultas().length();
      if (lengthFakultas < list.get(i).getJurusan().length())
        lengthFakultas = list.get(i).getJurusan().length();
    }

    if (count <= 10)
      System.out.print("No.|");
    else if (count <= 100)
      System.out.print("No. |");
    else if (count > 999)
      System.out.print("No.  |");

    // Length Name Header
    System.out.print("Name");
    if (lengthName < 4)
      System.out.print(" ");
    else {
      temps = lengthName - 4;
      temps += 1;
      for (int iter = 0; iter < temps; iter++)
        System.out.print(" ");
    }
    System.out.print("|");

    // Length NIM Header
    System.out.print("NIM");
    if (lengthNim < 3)
      System.out.print(" ");
    else {
      temps = 0;
      temps = lengthNim - 3;
      temps += 1;
      for (int iter = 0; iter < temps; iter++)
        System.out.print(" ");
    }
    System.out.print("|");

    // Length Jurusan Header
    System.out.print("Jurusan");
    if (lengthJurusan < 7)
      System.out.print(" ");
    else {
      temps = 0;
      temps = lengthJurusan - 7;
      temps += 1;
      for (int iter = 0; iter < temps; iter++)
        System.out.print(" ");
    }
    System.out.print("|");

    // Length Fakultas Header
    System.out.print("Fakultas");
    if (lengthFakultas < 8)
      System.out.print(" ");
    else {
      temps = 0;
      temps = lengthFakultas - 8;
      temps += 1;
      for (int iter = 0; iter < temps; iter++)
        System.out.print(" ");
    }
    System.out.print("|");
    System.out.print("\n");

    // Proses Print Data Mhs
    for (int i = 0; i < list.size(); i++) {
      if ((i + 1) <= 10)
        System.out.print((i + 1) + ". |");
      else if ((i + 1) <= 100)
        System.out.print((i + 1) + ".  |");
      else if ((i + 1) > 999)
        System.out.print((i + 1) + ".   |");

      System.out.print(list.get(i).getName());
      if (lengthName < list.get(i).getName().length())
        System.out.print(" ");
      else {
        temps = 0;
        temps = lengthName - list.get(i).getName().length();
        temps += 1;
        for (int iter = 0; iter < temps; iter++)
          System.out.print(" ");
        if (temps == 0)
          System.out.print(" ");
      }
      System.out.print("|");

      System.out.print(list.get(i).getNim());
      if (lengthNim < list.get(i).getNim().length())
        System.out.print(" ");
      else {
        temps = 0;
        temps = lengthNim - list.get(i).getNim().length();
        temps += 1;
        for (int iter = 0; iter < temps; iter++)
          System.out.print(" ");
        if (temps == 0)
          System.out.print(" ");
      }
      System.out.print("|");

      System.out.print(list.get(i).getJurusan());
      if (lengthJurusan < list.get(i).getJurusan().length())
        System.out.print(" ");
      else {
        temps = 0;
        temps = lengthJurusan - list.get(i).getJurusan().length();
        temps += 1;
        for (int iter = 0; iter < temps; iter++)
          System.out.print(" ");
        if (temps == 0)
          System.out.print(" ");
      }
      System.out.print("|");

      System.out.print(list.get(i).getFakultas());
      if (lengthFakultas < list.get(i).getFakultas().length()) {
        System.out.print(" ");
      } else {
        temps = 0;
        temps = lengthFakultas - list.get(i).getFakultas().length();
        temps += 1;
        for (int iter = 0; iter < temps; iter++)
          System.out.print(" ");
        if (temps == 0)
          System.out.print(" ");
      }
      System.out.println("|");
    }
    System.out.print("\n");
  }
}
