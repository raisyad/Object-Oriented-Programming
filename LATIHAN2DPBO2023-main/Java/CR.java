
// Saya Raisyad Jullfikar NIM 2106238 mengerjakan Latihan 2 
// dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
// keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

// Import Library
import java.util.*;

// Class Cr yang berisi data list dari class mahasiswa yang akan
// digunakan untuk menginputkan dan menampilkan data list tsb, seperti
// Create, Read/Show
public class CR {
  // Private attr string
  private String NIK,
      name,
      jenis_kelamin,
      asal_universitas,
      email_edu,
      NIM,
      fakultas,
      prodi;

  // Construct kosong
  public CR() {
  }

  // Method Create Data
  public void Create(ArrayList<Mahasiswa> list) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    Mahasiswa dataIn = new Mahasiswa();
    System.out.println("Input Data NIK:");
    NIK = sc.next();

    System.out.println("Input Data Nama:");
    name = sc.next();

    System.out.println("Input Data Jenis Kelamin/Gender:");
    jenis_kelamin = sc.next();

    System.out.println("Input Data Asal Universitas:");
    asal_universitas = sc.next();

    System.out.println("Input Data Email:");
    email_edu = sc.next();

    System.out.println("Input Data NIM:");
    NIM = sc.next();

    System.out.println("Input Data Fakultas:");
    fakultas = sc.next();

    System.out.println("Input Data Prodi:");
    prodi = sc.next();

    dataIn.setNik(NIK);
    dataIn.setName(name);
    dataIn.setJkelamin(jenis_kelamin);
    dataIn.setAUniv(asal_universitas);
    dataIn.setEmail(email_edu);
    dataIn.setNim(NIM);
    dataIn.setFakultas(fakultas);
    dataIn.setProdi(prodi);

    list.add(dataIn);
  }

  // Method Read Data
  public void Read(ArrayList<Mahasiswa> list) {
    System.out.println("\nList Data yang telah diinputkan: \n");
    for (int i = 0; i < list.size(); i++) {
      System.out.println(Integer.toString(i + 1) + ". "
          + list.get(i).getNik() + " | "
          + list.get(i).getName() + " | "
          + list.get(i).getJKelamin() + " | "
          + list.get(i).getAUniv() + " | "
          + list.get(i).getEmail() + " | "
          + list.get(i).getNim() + " | "
          + list.get(i).getFakultas() + " | "
          + list.get(i).getProdi() + " | ");
    }
    System.out.print("\n");
  }
}
