// Saya Raisyad Jullfikar NIM 2106238 mengerjakan Latihan 2 
// dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
// keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
class Human {
  // Private attr string
  private String NIK,
      name,
      jenis_kelamin;

  // Construct kosong (default value)
  public Human() {
    this.NIK = "";
    this.name = "";
    this.jenis_kelamin = "";
  }

  // Construct bervalue parameter
  public Human(String NIK, String name, String jenis_kelamin) {
    this.NIK = NIK;
    this.name = name;
    this.jenis_kelamin = jenis_kelamin;
  }

  // Setter and getter of class Human
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNik() {
    return this.NIK;
  }

  public void setNik(String NIK) {
    this.NIK = NIK;
  }

  public String getJKelamin() {
    return this.jenis_kelamin;
  }

  public void setJkelamin(String jenis_kelamin) {
    this.jenis_kelamin = jenis_kelamin;
  }
}

class SivitasAkademik extends Human {
  private String asal_universitas,
      email_edu;

  // Construct kosong (default value)
  public SivitasAkademik() {
    this.asal_universitas = "";
    this.email_edu = "";
  }

  // Construct bervalue parameter
  public SivitasAkademik(String asal_universitas, String email_edu) {
    this.asal_universitas = asal_universitas;
    this.email_edu = email_edu;
  }

  // Setter and getter of class Sivitas Akademik
  public String getAUniv() {
    return this.asal_universitas;
  }

  public void setAUniv(String asal_universitas) {
    this.asal_universitas = asal_universitas;
  }

  public String getEmail() {
    return this.email_edu;
  }

  public void setEmail(String email_edu) {
    this.email_edu = email_edu;
  }
}

class Mahasiswa extends SivitasAkademik {
  private String NIM,
      fakultas,
      prodi;

  // Construct kosong (default value)
  public Mahasiswa() {
    this.NIM = "";
    this.fakultas = "";
    this.prodi = "";
  }

  // Construct bervalue parameter
  public Mahasiswa(String name, String NIM, String fakultas, String prodi) {
    this.NIM = NIM;
    this.fakultas = fakultas;
    this.prodi = prodi;
  }

  // Setter and getter of class Mahasiswa
  public String getNim() {
    return this.NIM;
  }

  public void setNim(String NIM) {
    this.NIM = NIM;
  }

  public String getFakultas() {
    return this.fakultas;
  }

  public void setFakultas(String fakultas) {
    this.fakultas = fakultas;
  }

  public String getProdi() {
    return this.prodi;
  }

  public void setProdi(String prodi) {
    this.prodi = prodi;
  }
}
