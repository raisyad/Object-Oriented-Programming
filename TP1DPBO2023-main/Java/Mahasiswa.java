
// Saya Raisyad Jullfikar NIM 2106238 mengerjakan TP - 1 
// dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
// keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

// Import Library
import java.util.*;

// Child dari Sivitas Akademik
public class Mahasiswa extends SivitasAkademik {
  // Private Attr
  private String NIM, fakultas, prodi;
  private ArrayList<Barang> barang;
  private ArrayList<Course> matkul;
  private int calculate = 0;

  // Constructor Kosong
  public Mahasiswa() {
    super();
    this.NIM = "";
    this.fakultas = "";
    this.prodi = "";
    this.barang = null;
    this.matkul = null;
  }

  // Constructor Bervalue
  public Mahasiswa(String NIK, String name, String jkelamin, int umur, String statusPekerjaan, String asal_univ,
      String email_univ, String NIM, String fakultas, String prodi, ArrayList<Barang> barang,
      ArrayList<Course> matkul) {
    super(NIK, name, jkelamin, umur, statusPekerjaan, asal_univ, email_univ);
    this.NIM = NIM;
    this.fakultas = fakultas;
    this.prodi = prodi;
    this.barang = barang;
    this.matkul = matkul;
  }

  // Setter Getter.
  public void setNIM(String nIM) {
    this.NIM = nIM;
  }

  public void setFakultas(String fakultas) {
    this.fakultas = fakultas;
  }

  public void setProdi(String prodi) {
    this.prodi = prodi;
  }

  public void setBarang(ArrayList<Barang> barang) {
    this.barang = barang;
  }

  public void setMatkul(ArrayList<Course> matkul) {
    this.matkul = matkul;
  }

  public String getNIM() {
    return this.NIM;
  }

  public String getFakultas() {
    return this.fakultas;
  }

  public String getProdi() {
    return this.prodi;
  }

  public ArrayList<Barang> getBarang() {
    return this.barang;
  }

  public ArrayList<Course> getMatkul() {
    return this.matkul;
  }

  // Method tampil data diri mhs
  public void tampilDataDiri() {
    System.out.println(" - NIK              : " + this.getNIK());
    System.out.println(" - Name             : " + this.getName());
    System.out.println(" - Jenis Kelamin    : " + this.getJkelamin());
    System.out.println(" - Umur             : " + this.getUmur());
    System.out.println(" - Status Pekerjaan : " +
        this.getStatusPekerjaan());
    System.out.println(" - NIM              : " + this.getNIM());
    System.out.println(" - Fakultas         : " + this.getFakultas());
    System.out.println(" - Prodi            : " + this.getProdi());
    System.out.println(" > List Barang Kepemilikan :");
    for (int z = 0; z < this.getBarang().size(); z++) {
      System.out.println("   + " +
          this.getBarang().get(z).getDetailBarang());
    }
    System.out.println(" > List Kontrak Matkul :");
    for (int z = 0; z < this.getMatkul().size(); z++) {
      System.out.println("   + " + this.getMatkul().get(z).getNamaMK());
    }
    System.out.println(" > Terdapat Tugas Prak");
    System.out.println(" > Nilai MK");
    for (int i = 0; i < this.getMatkul().size(); i++) {
      System.out.println("   " + Integer.toString(i + 1) + ". Nilai MK " + Integer.toString(i + 1) + " : "
          + this.getMatkul().get(i).getNilaiMK());
    }
    System.out.println(" > Nilai Prak");
    for (int i = 0; i < this.getMatkul().size(); i++) {
      System.out.println("   " + Integer.toString(i + 1) + ". Nilai Prak " + Integer.toString(i + 1) + " : "
          + this.getMatkul().get(i).getNilaiPrak());
    }

    for (int i = 0; i < this.getMatkul().size(); i++) {
      calculate += this.getMatkul().get(i).getNilaiPrak();
      calculate += this.getMatkul().get(i).getNilaiMK();
    }
    calculate /= 4;
    System.out.println(" > Rata - rata Nilai : " + calculate);

    System.out.println(" > Keterangan Tambahan :");
    this.eat();
    this.drink();
    this.sleep();
  }
}
