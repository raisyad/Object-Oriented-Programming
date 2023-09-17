// Saya Raisyad Jullfikar NIM 2106238 mengerjakan TP - 1 
// dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
// keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
public class Barang {
  // Private attr
  private String idBarang, jenisBarang, detailBarang;

  // Constructor Kosong
  public Barang() {
    this.idBarang = "";
    this.jenisBarang = "";
    this.detailBarang = "";
  }

  // Constructor Bervalue
  public Barang(String idBarang, String jenisBarang, String detailBarang) {
    this.idBarang = idBarang;
    this.jenisBarang = jenisBarang;
    this.detailBarang = detailBarang;
  }

  // Setter Getter.

  public void setIdBarang(String idBarang) {
    this.idBarang = idBarang;
  }

  public void setJenisBarang(String jenisBarang) {
    this.jenisBarang = jenisBarang;
  }

  public void setDetailBarang(String detailBarang) {
    this.detailBarang = detailBarang;
  }

  public String getIdBarang() {
    return this.idBarang;
  }

  public String getJenisBarang() {
    return this.jenisBarang;
  }

  public String getDetailBarang() {
    return this.detailBarang;
  }
}
