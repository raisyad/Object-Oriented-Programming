
// Saya Raisyad Jullfikar NIM 2106238 mengerjakan TP - 1 
// dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
// keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
import java.util.*;

public class Asisten {
  // Private attr
  private String idAsisten, namePrak, status;
  private Mahasiswa mhs;

  // Construtor kosong
  public Asisten() {
    this.idAsisten = "";
    this.namePrak = "";
    this.mhs = null;
    this.status = "";
  }

  // Constructor bervalue
  public Asisten(String idAsisten, String namePrak, Mahasiswa mhs, String status) {
    this.idAsisten = idAsisten;
    this.namePrak = namePrak;
    this.mhs = mhs;
    this.status = status;
  }

  // Setter Getter.

  public void setIdAsisten(String idAsisten) {
    this.idAsisten = idAsisten;
  }

  public void setNamePrak(String namePrak) {
    this.namePrak = namePrak;
  }

  public void setMhs(Mahasiswa mhs) {
    this.mhs = mhs;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getIdAsisten() {
    return this.idAsisten;
  }

  public String getNamePrak() {
    return this.namePrak;
  }

  public Mahasiswa getMhs() {
    return this.mhs;
  }

  public String getStatus() {
    return this.status;
  }

  // Method mengajar
  public void Mengajar(Mahasiswa mhs) {
    System.out.println(this.getMhs().getName() + " Mengajar " + mhs.getName());
    System.out.println();
  }

  // Method memberi nilai dari perspektif asprak
  public void beriNilai(Mahasiswa mhs, Mahasiswa mhs2, Mahasiswa mhs3, Mahasiswa mhs4) {
    int nilaiInput = 0;
    Boolean nilaiTrue = true;
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    for (int i = 0; i < mhs.getMatkul().size(); i++) {
      if (this.getMhs().getMatkul().get(i).getNamaMK() == this.getNamePrak()) {
        if (this.getMhs().getMatkul().get(i).getNilaiMK() != 0) {
          System.out.println("Input nilai (int):");

          nilaiInput = sc.nextInt();
          this.getMhs().getMatkul().get(i).setNilaiPrak(nilaiInput);
          System.out.println();
          System.out.println("Nilai berhasil diberikan");
          System.out.println();
          nilaiTrue = false;
        }
      }
    }
    if (nilaiTrue == true) {
      System.out.println("Menunggu dosen pengampu memberikan nilai terlebih dahulu");
      System.out.println();
    }
  }

  // Method memberi tugas
  public void beriTugasPrak(Mahasiswa mhs) {
    System.out.println(this.getMhs().getName() + " Memberikan Tugas Prak kepada " + mhs.getName());
    System.out.println();
  }

}
