
// Saya Raisyad Jullfikar NIM 2106238 mengerjakan TP - 1 
// dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
// keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
import java.util.*;

// Child dari Mahasiswa 
public class AnggotaOrganisasi extends Mahasiswa {
  // Private attr
  private String idAnggota, jabatan;

  // Construct Kosong
  public AnggotaOrganisasi() {
    super();
    this.idAnggota = "";
    this.jabatan = "";
  }

  // Constructor Bervalue
  public AnggotaOrganisasi(String NIK, String name, String jkelamin, int umur, String statusPekerjaan, String asal_univ,
      String email_univ, String NIM, String fakultas, String prodi, ArrayList<Barang> barang,
      ArrayList<Course> matkul, String idAnggota,
      String jabatan) {
    super(NIK, name, jkelamin, umur, statusPekerjaan, asal_univ, email_univ, NIM, fakultas, prodi, barang, matkul);
    this.idAnggota = idAnggota;
    this.jabatan = jabatan;
  }

  // Setter Getter.

  public void setIdAnggota(String idAnggota) {
    this.idAnggota = idAnggota;
  }

  public void setJabatan(String jabatan) {
    this.jabatan = jabatan;
  }

  public String getIdAnggota() {
    return this.idAnggota;
  }

  public String getJabatan() {
    return this.jabatan;
  }

  // Method Merancang ProkerKec
  public void RancangProkerKec() {
    System.out.println("Horeey! " + this.getName() + " telah merancang Proker Club Bahasa Inggris");
    System.out.println();
  }

  // Method Merancang ProkerBem
  public void RancangProkerBem() {
    System.out.println("Horeey! " + this.getName() + " telah merancang Proker BEM");
    System.out.println();
  }

  // Method Menjalankan Proker Bem
  public void JalankanProkerBem(ArrayList<Organisasi> orgMerge) {
    System.out.print('\u000C');
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    int idx = 0;
    String ProkerDijalankan;
    Boolean proker = false, never = true, flagProker = false;
    for (int i = 0; i < orgMerge.size(); i++) {
      if (orgMerge.get(i).getNamaOrganisasi() == "Badan Eksekutif Mahasiswa") {
        for (int x = 0; x < orgMerge.get(i).getKegiatanOrganisasi().size(); x++) {
          if (orgMerge.get(i).getKegiatanOrganisasi().get(x).getStatusKegiatan() == 1) { // Jika ada kegiatan yang belum
                                                                                         // dijalankan
            if (never == true) {
              System.out.println("List Proker yang Belum dijalankan!");
              never = false;
            }
            if (i == 0) {
              System.out.println(
                  Integer.toString(i + 1) + ". " + orgMerge.get(i).getKegiatanOrganisasi().get(x).getNamaKegiatan());
              proker = true;
            } else {
              System.out.println(
                  Integer.toString(idx + 1) + ". "
                      + orgMerge.get(i).getKegiatanOrganisasi().get(x).getNamaKegiatan());
              if (proker == false) {
                proker = true;
              }
              idx++;
            }
          }
        }
      }
    }
    if (proker == false) {
      System.out.println("Semua Proker Sudah dijalankan!");
    } else if (proker == true) {
      System.out.println("Ans (namaProker): ");
      // sc.nextLine();
      ProkerDijalankan = sc.nextLine();
      for (int i = 0; i < orgMerge.size(); i++) {
        if (orgMerge.get(i).getNamaOrganisasi() == "Badan Eksekutif Mahasiswa") {
          for (int x = 0; x < orgMerge.get(i).getKegiatanOrganisasi().size(); x++) {
            if ((orgMerge.get(i).getKegiatanOrganisasi().get(x).getStatusKegiatan() == 1)
                && (ProkerDijalankan.equals(orgMerge.get(i).getKegiatanOrganisasi().get(x).getNamaKegiatan()))) { // Jika
                                                                                                                  // ada
                                                                                                                  // proker
                                                                                                                  // yang
                                                                                                                  // belum
                                                                                                                  // dijalankan
                                                                                                                  // dan
                                                                                                                  // proker
                                                                                                                  // tsb
                                                                                                                  // yang
                                                                                                                  // dimaksud
                                                                                                                  // oleh
                                                                                                                  // user
              orgMerge.get(i).getKegiatanOrganisasi().get(x).setStatusKegiatan(2);
              System.out.println(this.getName() + " Sudah Menjalankan Proker!");
              System.out.println();
              flagProker = true;
            }
          }
        }
      }
      if (flagProker == false) {
        System.out.println("Proker yang anda maksud tidak ada:(");
        System.out.println();
      }
    }
  }

  // Method Menjalankan Proker KEC
  public void JalankanProkerKec(ArrayList<Organisasi> orgMerge) {
    System.out.print('\u000C');
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    int idx = 0;
    String ProkerDijalankan;
    Boolean proker = false, never = true, flagProker = false;
    for (int i = 0; i < orgMerge.size(); i++) {
      if (orgMerge.get(i).getNamaOrganisasi() == "Klub Bahasa Inggris") {
        for (int x = 0; x < orgMerge.get(i).getKegiatanOrganisasi().size(); x++) {
          if (orgMerge.get(i).getKegiatanOrganisasi().get(x).getStatusKegiatan() == 1) {
            if (never == true) {
              System.out.println("List Proker yang Belum dijalankan!");
              never = false;
            }
            if (i == 0) {
              System.out.println(
                  Integer.toString(i + 1) + ". " + orgMerge.get(i).getKegiatanOrganisasi().get(x).getNamaKegiatan());
              proker = true;
            } else {
              System.out.println(
                  Integer.toString(idx + 1) + ". "
                      + orgMerge.get(i).getKegiatanOrganisasi().get(x).getNamaKegiatan());
              if (proker == false) {
                proker = true;
              }
              idx++;
            }
          }
        }
      }
    }
    if (proker == false) {
      System.out.println("Semua Proker Sudah dijalankan!");
    } else if (proker == true) {
      System.out.println("Ans (namaProker): ");
      // sc.nextLine();
      ProkerDijalankan = sc.nextLine();
      for (int i = 0; i < orgMerge.size(); i++) {
        if (orgMerge.get(i).getNamaOrganisasi() == "Klub Bahasa Inggris") {
          for (int x = 0; x < orgMerge.get(i).getKegiatanOrganisasi().size(); x++) {
            if ((ProkerDijalankan.equals(orgMerge.get(i).getKegiatanOrganisasi().get(x).getNamaKegiatan()))) {
              orgMerge.get(i).getKegiatanOrganisasi().get(x).setStatusKegiatan(2);
              System.out.println(this.getName() + " Sudah Menjalankan Proker!");
              System.out.println();
              flagProker = true;
            }
          }
        }
      }
      if (flagProker == false) {
        System.out.println("Proker yang anda maksud tidak ada:(");
        System.out.println();
      }
    }
  }

  // Method Menghadiri Evaluasi BEM
  public void HadiriEvaluasiBem(ArrayList<Organisasi> orgMerge) {
    System.out.print('\u000C');
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    int idx = 0;
    String ProkerDijalankan;
    Boolean proker = false, never = true, flagProker = false;
    for (int i = 0; i < orgMerge.size(); i++) {
      if (orgMerge.get(i).getNamaOrganisasi() == "Badan Eksekutif Mahasiswa") {
        for (int x = 0; x < orgMerge.get(i).getKegiatanOrganisasi().size(); x++) {
          if (orgMerge.get(i).getKegiatanOrganisasi().get(x).getStatusKegiatan() == 2) { // Jika ada proker yang sudah
                                                                                         // dijalankan
            if (never == true) {
              System.out.println("List Proker yang Sudah dijalankan!");
              never = false;
            }
            if (i == 0) {
              System.out.println(
                  Integer.toString(x + 1) + ". " + orgMerge.get(i).getKegiatanOrganisasi().get(x).getNamaKegiatan());
              proker = true;
            } else {
              System.out.println(
                  Integer.toString(idx + 1) + ". "
                      + orgMerge.get(i).getKegiatanOrganisasi().get(x).getNamaKegiatan());
              if (proker == false) {
                proker = true;
              }
              idx++;
            }
          }
        }
      }
    }
    if (proker == false) {
      System.out.println("Semua Proker Belum dijalankan!");
    } else if (proker == true) {
      System.out.println("Ans (namaProker): ");
      // sc.nextLine();
      ProkerDijalankan = sc.nextLine();
      for (int i = 0; i < orgMerge.size(); i++) {
        if (orgMerge.get(i).getNamaOrganisasi() == "Badan Eksekutif Mahasiswa") {
          for (int x = 0; x < orgMerge.get(i).getKegiatanOrganisasi().size(); x++) {
            if ((orgMerge.get(i).getKegiatanOrganisasi().get(x).getStatusKegiatan() == 2)
                && (ProkerDijalankan.equals(orgMerge.get(i).getKegiatanOrganisasi().get(x).getNamaKegiatan()))) { // Jika
                                                                                                                  // ada
                                                                                                                  // proker
                                                                                                                  // yang
                                                                                                                  // sudah
                                                                                                                  // dijalankan
                                                                                                                  // dan
                                                                                                                  // dituju
                                                                                                                  // oleh
                                                                                                                  // user
              System.out.println(this.getName() + " Menghadiri Evaluasi Proker "
                  + orgMerge.get(i).getKegiatanOrganisasi().get(x).getNamaKegiatan() + "!");
              System.out.println();
              flagProker = true;
            }
          }
        }
      }
      if (flagProker == false) {
        System.out.println("Proker yang anda maksud tidak ada:(");
        System.out.println();
      }
    }
  }

  // Method Menghadiri Evaluasi KEC
  public void HadiriEvaluasiKec(ArrayList<Organisasi> orgMerge) {
    System.out.print('\u000C');
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    int idx = 0;
    String ProkerDijalankan;
    Boolean proker = false, never = true, flagProker = false;
    for (int i = 0; i < orgMerge.size(); i++) {
      if (orgMerge.get(i).getNamaOrganisasi() == "Klub Bahasa Inggris") {
        for (int x = 0; x < orgMerge.get(i).getKegiatanOrganisasi().size(); x++) {
          if (orgMerge.get(i).getKegiatanOrganisasi().get(x).getStatusKegiatan() == 2) {
            if (never == true) {
              System.out.println("List Proker yang Sudah dijalankan!");
              never = false;
            }
            if (i == 0) {
              System.out.println(
                  Integer.toString(i + 1) + ". " + orgMerge.get(i).getKegiatanOrganisasi().get(x).getNamaKegiatan());
              proker = true;
            } else {
              System.out.println(
                  Integer.toString(idx + 1) + ". "
                      + orgMerge.get(i).getKegiatanOrganisasi().get(x).getNamaKegiatan());
              if (proker == false) {
                proker = true;
              }
              idx++;
            }
          }
        }
      }
    }
    if (proker == false) {
      System.out.println("Semua Proker Belum dijalankan!");
    } else if (proker == true) {
      System.out.println("Ans (namaProker): ");
      // sc.nextLine();
      ProkerDijalankan = sc.nextLine();
      for (int i = 0; i < orgMerge.size(); i++) {
        if (orgMerge.get(i).getNamaOrganisasi() == "Klub Bahasa Inggris") {
          for (int x = 0; x < orgMerge.get(i).getKegiatanOrganisasi().size(); x++) {
            if ((orgMerge.get(i).getKegiatanOrganisasi().get(x).getStatusKegiatan() == 2)
                && (ProkerDijalankan.equals(orgMerge.get(i).getKegiatanOrganisasi().get(x).getNamaKegiatan()))) {
              System.out.println(this.getName() + " Menghadiri Proker "
                  + orgMerge.get(i).getKegiatanOrganisasi().get(x).getNamaKegiatan() + "!");
              System.out.println();
              flagProker = true;
            }
          }
        }
      }
      if (flagProker == false) {
        System.out.println("Proker yang anda maksud tidak ada:(");
        System.out.println();
      }
    }
  }
}
