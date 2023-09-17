// Saya Raisyad Jullfikar NIM 2106238 mengerjakan TP - 1 
// dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
// keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
public class Course {
  // Private attr
  private String namaMK;
  private int nilaiMK, nilaiPrak;

  // Constructor Kosong
  public Course() {
    this.namaMK = "";
    this.nilaiMK = 0;
    this.nilaiPrak = 0;
  }

  // Constructor Bervalue
  public Course(String namaMK, int nilaiMK, int nilaiPrak) {
    this.namaMK = namaMK;
    this.nilaiMK = nilaiMK;
    this.nilaiPrak = nilaiPrak;
  }

  // Setter Getter.
  public void setNamaMK(String namaMK) {
    this.namaMK = namaMK;
  }

  public void setNilaiMK(int nilaiMK) {
    this.nilaiMK = nilaiMK;
  }

  public void setNilaiPrak(int nilaiPrak) {
    this.nilaiPrak = nilaiPrak;
  }

  public String getNamaMK() {
    return this.namaMK;
  }

  public int getNilaiMK() {
    return this.nilaiMK;
  }

  public int getNilaiPrak() {
    return this.nilaiPrak;
  }
}
