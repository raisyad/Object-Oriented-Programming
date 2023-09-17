
// Saya Raisyad Jullfikar NIM 2106238 mengerjakan TP - 1 
// dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
// keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

// Import Library
import java.util.ArrayList;

public class Fakultas {
  // Private attr
  private String idFakultas, nameFakultas;
  private ArrayList<Prodi> prodi;

  // Constructor Kosong
  public Fakultas() {
    this.idFakultas = "";
    this.nameFakultas = "";
    this.prodi = null;
  }

  // Constructor Bervalue
  public Fakultas(String idFakultas, String nameFakultas, ArrayList<Prodi> prodi) {
    this.idFakultas = idFakultas;
    this.nameFakultas = nameFakultas;
    this.prodi = prodi;
  }

  // Setter and Getter.
  public void setIdFakultas(String idFakultas) {
    this.idFakultas = idFakultas;
  }

  public void setNameFakultas(String nameFakultas) {
    this.nameFakultas = nameFakultas;
  }

  public void setProdi(ArrayList<Prodi> prodi) {
    this.prodi = prodi;
  }

  public String getIdFakultas() {
    return this.idFakultas;
  }

  public String getNameFakultas() {
    return this.nameFakultas;
  }

  public ArrayList<Prodi> getProdi() {
    return this.prodi;
  }
}
