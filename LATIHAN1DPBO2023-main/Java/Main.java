// Saya Raisyad Jullfikar NIM 2106238 mengerjakan Latihan 1 dalam mata kuliah Desain dan Pemrograman Berorientasi 
// Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

// Import Library
import java.util.*;

public class Main {
  public static void main(String[] args) {
    int n = 0, flag = -1;
    // - : Deklar var n untuk inputan menu
    // -------- : Deklar var flag untuk penanda ada nim yang ditemukan atau tidak
    boolean boolFlag = true; // Penanda loop untuk inputan menu

    ArrayList<Mahasiswa> list = new ArrayList<>(); // Deklar arraylist untuk menampung objek kedalam var list
    Crud crud = new Crud(); // Init var crud untuk objek crud

    Scanner sc = new Scanner(System.in).useLocale(Locale.US); // Input / Pembuka Scanner
    // Inputan Menu
    do {
      System.out
          .println("Daftar Menu Program\n1. Input\n2. Update\n3. Delete\n4. Show Data\nOther Number. Exit Program");
      try {
        n = sc.nextInt(); // Inputan Menu
      } catch (Exception e) {
        System.out.println("Inputan Bukan Pilihan Menu!");
      }

      if (n == 1) // Menu pertama (1) -> Membuat Data / Create
        crud.Create(list);
      else if (n == 2) // Menu kedua (2) -> Mengupdate / Mengubah Data yang sudah ada
        crud.Update(list, flag);
      else if (n == 3) // Menu ketiga (3) -> Mengdelete / Menghapus Data yang sudah ada
        crud.Delete(list, flag);
      else if (n == 4) // Menu keempat (4) -> Meread / Menampilkan Data yang sudah ada
        crud.Read(list);
      else // Jika menginput menu selain menu diatas, loop akan berhenti
        boolFlag = false;

      flag = -1; // Default value

    } while (boolFlag);
    sc.close(); // Penutup Scanner

  }
}
