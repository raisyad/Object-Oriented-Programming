public class Mahasiswa {
  // Class Mahasiswa yang berisi data diri umum Mahasiswa, seperti
  // -> name, nim, jurusan, fakultas

  // Private Atribut
  private String name,
      nim,
      jurusan,
      fakultas;

  // Constructor Kosong atau Constructor yang mengisi default value (string
  // kosong)
  public Mahasiswa() {
    this.name = "";
    this.nim = "";
    this.jurusan = "";
    this.fakultas = "";
  }

  // Constructor yang mengisi valuenya tergantung inputan parameter user
  public Mahasiswa(String name, String nim, String jurusan, String fakultas) {
    this.name = name;
    this.nim = nim;
    this.jurusan = jurusan;
    this.fakultas = fakultas;
  }

  // SETTER GETTER

  // Method untuk mengambil data nama
  public String getName() {
    return this.name;
  }

  // Method untuk menambah atau mengubah data nama
  public void setName(String name) {
    this.name = name;
  }

  // Method untuk mengambil data nim
  public String getNim() {
    return this.nim;
  }

  // Method untuk menambah atau mengubah data nim
  public void setNim(String nim) {
    this.nim = nim;
  }

  // Method untuk mengambil data jurusan
  public String getJurusan() {
    return this.jurusan;
  }

  // Method untuk menambah atau mengubah data jurusan
  public void setJurusan(String jurusan) {
    this.jurusan = jurusan;
  }

  // Method untuk mengambil data fakultas
  public String getFakultas() {
    return this.fakultas;
  }

  // Method untuk menambah atau mengubah data fakultas
  public void setFakultas(String fakultas) {
    this.fakultas = fakultas;
  }
}
