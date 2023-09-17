// Saya Raisyad Jullfikar NIM 2106238 mengerjakan TP - 1 
// dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
// keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

public class Kegiatan {
  // Private attr
  private String idKegiatan, namaKegiatan, ketuaPelaksana;
  private int statusKegiatan;

  // Constructor Kosong
  public Kegiatan() {
    this.idKegiatan = "";
    this.namaKegiatan = "";
    this.ketuaPelaksana = "";
    this.statusKegiatan = 0;
  }

  // Constructor Bervalue
  public Kegiatan(String idKegiatan, String namaKegiatan, String ketuaPelaksana, int statusKegiatan) {
    this.idKegiatan = idKegiatan;
    this.namaKegiatan = namaKegiatan;
    this.ketuaPelaksana = ketuaPelaksana;
    this.statusKegiatan = statusKegiatan;
  }

  // Setter Getter.
  public void setIdKegiatan(String idKegiatan) {
    this.idKegiatan = idKegiatan;
  }

  public void setNamaKegiatan(String namaKegiatan) {
    this.namaKegiatan = namaKegiatan;
  }

  public void setKetuaPelaksana(String ketuaPelaksana) {
    this.ketuaPelaksana = ketuaPelaksana;
  }

  public void setStatusKegiatan(int statusKegiatan) {
    this.statusKegiatan = statusKegiatan;
  }

  public String getIdKegiatan() {
    return this.idKegiatan;
  }

  public String getNamaKegiatan() {
    return this.namaKegiatan;
  }

  public String getKetuaPelaksana() {
    return this.ketuaPelaksana;
  }

  public int getStatusKegiatan() {
    return this.statusKegiatan;
  }
}
