// Saya Raisyad Jullfikar NIM 2106238 mengerjakan TP - 1 
// dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
// keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

// Child dari Human
public class SivitasAkademik extends Human {
  // Private attr
  private String asal_univ, email_univ;

  // Constructor Kosong
  public SivitasAkademik() {
    super();
    this.asal_univ = "";
    this.email_univ = "";
  }

  // Constructor Bervalue
  public SivitasAkademik(String NIK, String name, String jkelamin, int umur, String statusPekerjaan, String asal_univ,
      String email_univ) {
    super(NIK, name, jkelamin, umur, statusPekerjaan);
    this.asal_univ = asal_univ;
    this.email_univ = email_univ;
  }

  // Setter and Getter.
  public void setAsal_univ(String asal_univ) {
    this.asal_univ = asal_univ;
  }

  public void setEmail_univ(String email_univ) {
    this.email_univ = email_univ;
  }

  public String getAsal_univ() {
    return this.asal_univ;
  }

  public String getEmail_univ() {
    return this.email_univ;
  }

}
