
// Saya Raisyad Jullfikar NIM 2106238 mengerjakan TP - 1 
// dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
// keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

// Import Library
import java.util.*;

// Child dari Sivitas Akademik
public class Dosen extends SivitasAkademik {
  // Private attr
  private String NIP, keahlian, fakultas;
  private ArrayList<Barang> barang;
  private Asisten asisten;
  private Course matkul;

  // Constructor Kosong
  public Dosen() {
    super();
    this.NIP = "";
    this.keahlian = "";
    this.fakultas = "";
    this.barang = null;
    this.asisten = null;
    this.matkul = null;
  }

  // Constructor Bervalue
  public Dosen(String NIK, String name, String jkelamin, int umur, String statusPekerjaan, String asal_univ,
      String email_univ, String NIP, String keahlian, String fakultas, ArrayList<Barang> barang, Asisten asisten,
      Course matkul) {
    super(NIK, name, jkelamin, umur, statusPekerjaan, asal_univ, email_univ);
    this.NIP = NIP;
    this.keahlian = keahlian;
    this.fakultas = fakultas;
    this.barang = barang;
    this.asisten = asisten;
    this.matkul = matkul;
  }

  // Setter Getter.
  public void setNIP(String nIP) {
    this.NIP = nIP;
  }

  public void setKeahlian(String keahlian) {
    this.keahlian = keahlian;
  }

  public void setFakultas(String fakultas) {
    this.fakultas = fakultas;
  }

  public void setBarang(ArrayList<Barang> barang) {
    this.barang = barang;
  }

  public void setAsisten(Asisten asisten) {
    this.asisten = asisten;
  }

  public void setMatkul(Course matkul) {
    this.matkul = matkul;
  }

  public String getNIP() {
    return this.NIP;
  }

  public String getKeahlian() {
    return this.keahlian;
  }

  public String getFakultas() {
    return this.fakultas;
  }

  public ArrayList<Barang> getBarang() {
    return this.barang;
  }

  public Asisten getAsisten() {
    return this.asisten;
  }

  public Course getMatkul() {
    return this.matkul;
  }

  // Method Menampilkan data diri dosen
  public void tampilDataDiri() {
    System.out.println(" - NIK                     : " + this.getNIK());
    System.out.println(" - Name                    : " + this.getName());
    System.out
        .println(" - Jenis Kelamin           : " + this.getJkelamin());
    System.out.println(" - Umur                    : " + this.getUmur());
    System.out.println(
        " - Status Pekerjaan        : " + this.getStatusPekerjaan());
    System.out.println(" - NIP                     : " + this.getNIP());
    System.out
        .println(" - Fakultas                : " + this.getFakultas());
    System.out.println(" > List Barang Kepemilikan :");
    for (int z = 0; z < this.getBarang().size(); z++) {
      System.out.println("   + " + this.getBarang().get(z).getDetailBarang());
    }
    System.out.println(" > Mengampu Mata Kuliah    :");
    System.out.println("   + " + this.getMatkul().getNamaMK());
    System.out.println(" > Asisten                 :");
    System.out.println("   + " + this.getAsisten().getMhs().getName());

    System.out.println();
  }

  // Method Mengajar
  public void Mengajar(Mahasiswa mhs) {
    System.out.println(this.getName() + " Mengajar " + mhs.getName());
    System.out.println();
  }

  // Method MemberikanNilai dari perspektif dosen
  public void beriNilai(Mahasiswa mhs, Mahasiswa mhs2, Mahasiswa mhs3, Mahasiswa mhs4, Mahasiswa mhs5) {
    int nilaiInput = 0;
    Boolean nilaiTrue = true;
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    System.out.println();
    for (int i = 0; i < mhs.getMatkul().size(); i++) {
      if (mhs.getMatkul().get(i).getNamaMK() == this.getMatkul().getNamaMK()) {
        if (mhs.getMatkul().get(i).getNilaiMK() == 0) {
          System.out.println("Input nilai (int):");

          nilaiInput = sc.nextInt();
          mhs.getMatkul().get(i).setNilaiMK(nilaiInput);
          System.out.println();
          System.out.println("Nilai berhasil diberikan");
          System.out.println();
          nilaiTrue = false;
        }
      }
    }
    if (nilaiTrue == true) {
      System.out.println("Nilai sudah terinput semua");
    }
  }
}
