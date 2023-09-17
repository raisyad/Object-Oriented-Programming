
// Saya Raisyad Jullfikar NIM 2106238 mengerjakan TP - 1 
// dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
// keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

// Import Library
import java.util.ArrayList;

public class Prodi {
  // Private attr
  private String idProdi, nameProdi;
  private ArrayList<Dosen> dsn;
  private ArrayList<Mahasiswa> mhs;

  // Constructor Kosong
  public Prodi() {
    this.idProdi = "";
    this.nameProdi = "";
    this.dsn = null;
    this.mhs = null;
  }

  // Constructor Bervalue
  public Prodi(String idProdi, String nameProdi, ArrayList<Dosen> dsn, ArrayList<Mahasiswa> mhs) {
    this.idProdi = idProdi;
    this.nameProdi = nameProdi;
    this.dsn = dsn;
    this.mhs = mhs;
  }

  // Setter and Getter.
  public void setIdProdi(String idProdi) {
    this.idProdi = idProdi;
  }

  public void setNameProdi(String nameProdi) {
    this.nameProdi = nameProdi;
  }

  public void setDsn(ArrayList<Dosen> dsn) {
    this.dsn = dsn;
  }

  public void setMhs(ArrayList<Mahasiswa> mhs) {
    this.mhs = mhs;
  }

  public String getIdProdi() {
    return this.idProdi;
  }

  public String getNameProdi() {
    return this.nameProdi;
  }

  public ArrayList<Dosen> getDsn() {
    return this.dsn;
  }

  public ArrayList<Mahasiswa> getMhs() {
    return this.mhs;
  }
}
