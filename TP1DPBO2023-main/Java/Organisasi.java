
// Saya Raisyad Jullfikar NIM 2106238 mengerjakan TP - 1 
// dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
// keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

// Import Library
import java.util.*;

public class Organisasi {
  // Private attr
  private String idOrganisasi, tingkatanOrganisasi, namaOrganisasi, ketuaOrganisasi;
  private ArrayList<AnggotaOrganisasi> anggotaOrganisasi;
  private ArrayList<Kegiatan> kegiatanOrganisasi;

  // Constructor Kosong
  public Organisasi() {
    this.idOrganisasi = "";
    this.tingkatanOrganisasi = "";
    this.namaOrganisasi = "";
    this.ketuaOrganisasi = "";
    this.anggotaOrganisasi = null;
    this.kegiatanOrganisasi = null;
  }

  // Constructor Bervalue
  public Organisasi(String idOrganisasi, String tingkatanOrganisasi, String namaOrganisasi, String ketuaOrganisasi,
      ArrayList<AnggotaOrganisasi> anggotaOrganisasi, ArrayList<Kegiatan> kegiatanOrganisasi) {
    this.idOrganisasi = idOrganisasi;
    this.tingkatanOrganisasi = tingkatanOrganisasi;
    this.namaOrganisasi = namaOrganisasi;
    this.ketuaOrganisasi = ketuaOrganisasi;
    this.anggotaOrganisasi = anggotaOrganisasi;
    this.kegiatanOrganisasi = kegiatanOrganisasi;
  }

  // Setter Getter.
  public void setIdOrganisasi(String idOrganisasi) {
    this.idOrganisasi = idOrganisasi;
  }

  public void setTingkatanOrganisasi(String tingkatanOrganisasi) {
    this.tingkatanOrganisasi = tingkatanOrganisasi;
  }

  public void setNamaOrganisasi(String namaOrganisasi) {
    this.namaOrganisasi = namaOrganisasi;
  }

  public void setKetuaOrganisasi(String ketuaOrganisasi) {
    this.ketuaOrganisasi = ketuaOrganisasi;
  }

  public void setAnggotaOrganisasi(ArrayList<AnggotaOrganisasi> anggotaOrganisasi) {
    this.anggotaOrganisasi = anggotaOrganisasi;
  }

  public void setKegiatanOrganisasi(ArrayList<Kegiatan> kegiatanOrganisasi) {
    this.kegiatanOrganisasi = kegiatanOrganisasi;
  }

  public String getIdOrganisasi() {
    return this.idOrganisasi;
  }

  public String getTingkatanOrganisasi() {
    return this.tingkatanOrganisasi;
  }

  public String getNamaOrganisasi() {
    return this.namaOrganisasi;
  }

  public String getKetuaOrganisasi() {
    return this.ketuaOrganisasi;
  }

  public ArrayList<AnggotaOrganisasi> getAnggotaOrganisasi() {
    return this.anggotaOrganisasi;
  }

  public ArrayList<Kegiatan> getKegiatanOrganisasi() {
    return this.kegiatanOrganisasi;
  }

}
