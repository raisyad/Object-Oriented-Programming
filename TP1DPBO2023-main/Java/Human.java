// Saya Raisyad Jullfikar NIM 2106238 mengerjakan TP - 1 
// dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
// keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

// Import Library
import java.util.*;

public class Human {
  // Private attr
  private String NIK, name, jkelamin, statusPekerjaan;
  private int umur;

  // Construtor Kosong
  public Human() {
    this.NIK = "";
    this.name = "";
    this.jkelamin = "";
    this.umur = 0;
    this.statusPekerjaan = "";
  }

  // Constructor Bervalue
  public Human(String NIK, String name, String jkelamin, int umur, String statusPekerjaan) {
    this.NIK = NIK;
    this.name = name;
    this.jkelamin = jkelamin;
    this.umur = umur;
    this.statusPekerjaan = statusPekerjaan;
  }

  // Setter Getter.
  public void setNIK(String NIK) {
    this.NIK = NIK;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setJkelamin(String jkelamin) {
    this.jkelamin = jkelamin;
  }

  public void setUmur(int umur) {
    this.umur = umur;
  }

  public void setStatusPekerjaan(String statusPekerjaan) {
    this.statusPekerjaan = statusPekerjaan;
  }

  public String getNIK() {
    return this.NIK;
  }

  public String getName() {
    return this.name;
  }

  public String getJkelamin() {
    return this.jkelamin;
  }

  public int getUmur() {
    return this.umur;
  }

  public String getStatusPekerjaan() {
    return this.statusPekerjaan;
  }

  // Method Makan
  public void eat() {
    System.out.println("         Sudah Makan");
  }

  // Method Minum
  public void drink() {
    System.out.println("         Sudah Minum");
  }

  // Method Tidur
  public void sleep() {
    System.out.println("         Sudah Tidur");
  }

}
