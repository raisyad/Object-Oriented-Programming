
// Saya Raisyad Jullfikar NIM 2106238 mengerjakan Latihan 2 
// dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
// keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

// Import Library
import java.util.*;

public class Main {
  public static void main(String args[]) {
    ArrayList<Mahasiswa> list = new ArrayList<>(); // Deklar arraylist untuk menampung objek kedalam var list
    CR cr = new CR(); // Init var crud untuk objek crud

    Scanner sc = new Scanner(System.in).useLocale(Locale.US); // Input / Pembuka Scanner
    Boolean flag = true; // Penanda Loop
    int n = 0;
    do {
      System.out
          .println("Daftar Menu Program\n1. Input\n2. Show Data\nOther Number. Exit Program");
      try {
        n = sc.nextInt(); // Inputan Menu
      } catch (Exception e) {
        System.out.println("Inputan Bukan Pilihan Menu!");
      }

      if (n == 1) { // Menu 1 -> Create Data
        cr.Create(list);
      } else if (n == 2) { // Menu 2 -> Read Data
        cr.Read(list);
      } else { // Selain menu diatas, loop berhenti
        flag = false;
      }
    } while (flag);
    sc.close(); // Penutup Inputan
  }
}
