// Saya Raisyad Jullfikar NIM 2106238 mengerjakan TP - 1 
// dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
// keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

// Import Library
import java.util.*;

public class Main {
  public static void main(String[] args) {
    // Deklar arraylist ==================
    ArrayList<Course> MK = new ArrayList<>();
    ArrayList<Barang> barangs = new ArrayList<>();
    ArrayList<Barang> barangdosen = new ArrayList<>();
    ArrayList<AnggotaOrganisasi> anggotaBem = new ArrayList<>();
    ArrayList<AnggotaOrganisasi> anggotaKec = new ArrayList<>();
    AnggotaOrganisasi anggotaorg = new AnggotaOrganisasi();
    ArrayList<Kegiatan> bem = new ArrayList<>();
    ArrayList<Kegiatan> kec = new ArrayList<>();
    ArrayList<Organisasi> orgMerge = new ArrayList<>();
    ArrayList<Prodi> prodi = new ArrayList<>();
    ArrayList<Mahasiswa> dataMhs = new ArrayList<>();
    ArrayList<Dosen> dataDsn = new ArrayList<>();
    // ====================================

    // Instansiasi pilihan ================
    Choice choice = new Choice();
    // ====================

    // List Mata Kuliah
    Course MK1 = new Course("Struktur Data", 0, 0);
    Course MK2 = new Course("Aljabar & Linear", 0, 0);
    MK.add(MK1);
    MK.add(MK2);

    // List Barang Mhs
    Barang barangmhs1 = new Barang("001", "non-Elektronik", "Buku Struktur Data");
    Barang barangmhs2 = new Barang("002", "Elektronik", "Laptop HP");
    barangs.add(barangmhs1);
    barangs.add(barangmhs2);

    // List Barang Dosen
    Barang barangdsn1 = new Barang("003", "non-Elektronik", "Spidol Hitam");
    Barang barangdsn2 = new Barang("004", "Elektronik", "Laptop Acer");
    barangdosen.add(barangdsn1);
    barangdosen.add(barangdsn2);

    // List Mhs
    Mahasiswa Resyad = new Mahasiswa("1901020", "Resyad", "Laki - Laki", 19, "Mahasiswa", "UPI",
        "resyad@upi.edu",
        "2106238", "FPMIPA", "Ilkom", barangs, MK);

    // Anggota Bem ======
    AnggotaOrganisasi Pahri = new AnggotaOrganisasi("1901030", "Pahri", "Laki - Laki", 18, "Mahasiswa",
        "UPI",
        "pahri@upi.edu", "2100098", "FPMIPA", "Ilkom", barangs,
        MK, "B01",
        "Ketua");
    anggotaBem.add(Pahri);
    // ===================

    // Anggota KEC ================
    AnggotaOrganisasi Angga = new AnggotaOrganisasi("1901040", "Angga", "Laki - Laki", 19, "Mahasiswa",
        "UPI",
        "angga@upi.edu", "2100010", "FPMIPA", "Ilkom", barangs,
        MK, "K01",
        "Ketua");
    AnggotaOrganisasi Gatsby = new AnggotaOrganisasi("1901050", "Gatsby", "Laki - Laki", 19, "Mahasiswa",
        "UPI",
        "angga@upi.edu", "2100900", "FPMIPA", "Ilkom", barangs,
        MK, "K02",
        "Staff");
    anggotaKec.add(Angga);
    anggotaKec.add(Gatsby);
    // ==========================

    Mahasiswa Mila = new Mahasiswa("1901070", "Mila", "Perempuan", 19, "Mahasiswa", "UPI", "mila@upi.edu",
        "2106098", "FPMIPA", "Ilkom", barangs, MK);

    dataMhs.add(Resyad);
    dataMhs.add(Pahri);
    dataMhs.add(Angga);
    dataMhs.add(Gatsby);
    dataMhs.add(Mila);

    // Asisten ==================
    Asisten asisten = new Asisten("AS01", "Struktur Data", Mila, "Asisten");
    // ==========================

    // Dosen ====================
    Dosen mrs_rose = new Dosen("1770097", "Mrs. Rose", "Perempuan", 45, "Dosen/Pns", "UPI",
        "rose@upi.edu", "1981018", "System Enggineer", "FPMIPA", barangdosen, asisten, MK1);
    dataDsn.add(mrs_rose);
    // ==========================

    // Kegiatan bem ================
    Kegiatan kgtn1 = new Kegiatan("XX01", "Membangun BEM menuju 5.0", "Pahri", 2);
    Kegiatan kgtn2 = new Kegiatan("XX02", "Menuju 2023 BEM Islami", "IDK1", 2);
    bem.add(kgtn1);
    bem.add(kgtn2);
    // ============================

    // Kegiatan KEC ===============
    Kegiatan kgtn3 = new Kegiatan("XX03", "Menuju EnglishClub Go-Inter", "Angga", 1);
    Kegiatan kgtn4 = new Kegiatan("XX04", "Belajar Bahasa", "IDK2", 2);
    kec.add(kgtn3);
    kec.add(kgtn4);
    // ===========================
    // 1 -> belum || 2 -> sudah

    // List Organisasi ================
    Organisasi org1 = new Organisasi("AAA01", "Fakultas", "Badan Eksekutif Mahasiswa", "Pahri",
        anggotaBem, bem);
    Organisasi org2 = new Organisasi("AAA02", "Prodi", "Klub Bahasa Inggris", "Angga", anggotaKec, kec);
    orgMerge.add(org1);
    orgMerge.add(org2);
    // ================================

    // Prodi ========================
    Prodi ilkom = new Prodi("IK", "Ilmu Komputer", dataDsn, dataMhs);
    prodi.add(ilkom);
    // =============================

    // Fakultas ===================
    Fakultas fpmipa = new Fakultas("SC1", "FPMIPA", prodi);
    // ============================

    // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    // Proses
    Scanner sc = new Scanner(System.in).useLocale(Locale.US); // Input / Pembuka Scanner
    Boolean flag = true, flag2 = true, flag3 = true, flag4 = true; // Penanda Loop
    int n = 0, choicePerson = 0, choiceDetailPersonal = 0, choiceMengajar = 0;
    System.out.print('\u000C');
    do {
      System.out
          .println(
              "Daftar Menu Program\n1. Tampil Data Umum\n2. Tampil Data Mahasiswa\n3. Tampil Data Dosen\n4. Tampil Data Matkul\n5. Tampil Data Organisasi\n6. Tampil Spesifik\nOther Number. Exit Program");
      try {
        n = sc.nextInt(); // Inputan Menu
      } catch (Exception e) {
        System.out.println("Inputan Bukan Pilihan Menu!");
      }

      if (n == 1) { // Menu 1 -> tampilan umum
        choice.tampilUmum(fpmipa, MK, orgMerge);
      } else if (n == 2) { // Menu 2 -> tampilan mhs
        choice.tampilMhs(fpmipa, dataMhs);
      } else if (n == 3) { // Menu 3 -> tampilan dosen
        choice.tampilDosen(fpmipa, dataDsn);
      } else if (n == 4) { // Menu 4 -> tampilan Matkul
        choice.tampilMatkul(fpmipa, MK);
      } else if (n == 5) { // Menu 5 -> tampilan organisasi
        choice.tampilOrganisasi(fpmipa, orgMerge);
      } else if (n == 6) { // Menu 6 -> tampilan spesifik
        do {
          System.out
              .println(
                  "Daftar Menu Spesifik\n1. Resyad\n2. Pahri\n3. Angga\n4. Gatsby\n5. Mila\n6. Mrs.Rose\nOther Number. Exit Program");
          choicePerson = sc.nextInt(); // Input data yang diinginkan
          if (choicePerson == 1) { // -> Resyad
            Resyad.tampilDataDiri(); // Mahasiswa Biasa
          } else if (choicePerson == 2) { // -> Pahri
            // AnggotaOrg BEM
            flag3 = true;
            do {
              System.out
                  .println(
                      "Daftar Menu Spesifik\n1. Data Diri\n2. Rancang Proker\n3. JalankanProker\n4. HadiriEvaluasi\nOther Number. Exit Program");
              choiceDetailPersonal = sc.nextInt();
              if (choiceDetailPersonal == 1) { // Data diri mhs
                Pahri.tampilDataDiri();
              } else if (choiceDetailPersonal == 2) { // Rancang Proker
                Pahri.RancangProkerBem();
              } else if (choiceDetailPersonal == 3) { // Jalankan Proker
                Pahri.JalankanProkerBem(orgMerge);
              } else if (choiceDetailPersonal == 4) { // Hadiri Evaluasi
                Pahri.HadiriEvaluasiBem(orgMerge);
              } else {
                flag3 = false;
              }
            } while (flag3);
          } else if (choicePerson == 3) { // -> Angga
            // AnggotaOrg KEC / ClubEng
            flag3 = true;
            do {
              System.out
                  .println(
                      "Daftar Menu Spesifik\n1. Data Diri\n2. Rancang Proker\n3. JalankanProker\n4. HadiriEvaluasi\nOther Number. Exit Program");
              choiceDetailPersonal = sc.nextInt();
              if (choiceDetailPersonal == 1) { // Data diri Mhs
                Angga.tampilDataDiri();
              } else if (choiceDetailPersonal == 2) { // Rancang Proker
                Angga.RancangProkerKec();
              } else if (choiceDetailPersonal == 3) { // Jalankan Proker
                Angga.JalankanProkerKec(orgMerge);
              } else if (choiceDetailPersonal == 4) { // Hadiri Evaluasi
                Angga.HadiriEvaluasiKec(orgMerge);
              } else {
                flag3 = false;
              }
            } while (flag3);
          } else if (choicePerson == 4) { // -> Gatsby
            // AnggotaOrg KEC / ClubEng
            flag3 = true;
            do {
              System.out
                  .println(
                      "Daftar Menu Spesifik\n1. Data Diri\n2. Rancang Proker\n3. JalankanProker\n4. HadiriEvaluasi\nOther Number. Exit Program");
              choiceDetailPersonal = sc.nextInt();
              if (choiceDetailPersonal == 1) { // Data Diri Mhs
                Gatsby.tampilDataDiri();
              } else if (choiceDetailPersonal == 2) { // Rancang Proker
                Gatsby.RancangProkerKec();
              } else if (choiceDetailPersonal == 3) { // Jalankan Proker
                Gatsby.JalankanProkerKec(orgMerge);
              } else if (choiceDetailPersonal == 4) { // Hadiri Evaluasi
                Gatsby.HadiriEvaluasiKec(orgMerge);
              } else {
                flag3 = false;
              }
            } while (flag3);
          } else if (choicePerson == 5) { // -> Mila
            // Asisten Prak
            flag3 = true;
            do {
              System.out
                  .println(
                      "Daftar Menu Spesifik\n1. Data Diri\n2. Mengajar\n3. Beri Nilai Prak\n4. Beri Tugas Prak\nOther Number. Exit Program");
              choiceDetailPersonal = sc.nextInt();
              if (choiceDetailPersonal == 1) { // Data Diri Mhs
                Mila.tampilDataDiri();
              } else if (choiceDetailPersonal == 2) { // Mengajar
                flag = true;
                do {
                  System.out
                      .println(
                          "Daftar Menu Spesifik\n1. Resyad\n2. Pahri\n3. Angga\n4. Gatsby\nOther Number. Exit Program");

                  choiceMengajar = sc.nextInt(); // Input data siapa yang mau mila ajar
                  if (choiceMengajar == 1) { // Resyad
                    asisten.Mengajar(Resyad);
                  } else if (choiceMengajar == 2) { // Pahri
                    asisten.Mengajar(Pahri);
                  } else if (choiceMengajar == 3) { // Angga
                    asisten.Mengajar(Angga);
                  } else if (choiceMengajar == 4) { // Gatsby
                    asisten.Mengajar(Gatsby);
                  } else {
                    flag4 = false;
                  }
                } while (flag4);
              } else if (choiceDetailPersonal == 3) { // Beri NilaiPrak Kepada seluruh mhs
                asisten.beriNilai(Resyad, Pahri, Angga, Gatsby);
              } else if (choiceDetailPersonal == 4) { // Beri tugasPrak
                flag4 = true;
                do {
                  System.out
                      .println(
                          "Daftar Menu Spesifik\n1. Resyad\n2. Pahri\n3. Angga\n4. Gatsby\nOther Number. Exit Program");

                  choiceMengajar = sc.nextInt(); // Input data siapa yang mau diberi tugasPrak (hanya muncul pop up
                                                 // seperti yang tertera pada method)
                  if (choiceMengajar == 1) { // Resyad
                    asisten.beriTugasPrak(Resyad);
                  } else if (choiceMengajar == 2) { // Pahri
                    asisten.beriTugasPrak(Pahri);
                  } else if (choiceMengajar == 3) { // Angga
                    asisten.beriTugasPrak(Angga);
                  } else if (choiceMengajar == 4) { // Gatsby
                    asisten.beriTugasPrak(Gatsby);
                  } else {
                    flag4 = false;
                  }
                } while (flag4);
              } else {
                flag3 = false;
              }
            } while (flag3);
          } else if (choicePerson == 6) { // -> Mrs. Rose
            flag3 = true;
            do {
              System.out
                  .println(
                      "Daftar Menu Spesifik\n1. Data Diri\n2. Mengajar\n3. Memberikan Nilai\nOther Number. Exit Program");
              choiceDetailPersonal = sc.nextInt();
              if (choiceDetailPersonal == 1) { // Data diri dosen
                mrs_rose.tampilDataDiri();
              } else if (choiceDetailPersonal == 2) { // Mengajar Mhs
                flag4 = true;
                do {
                  System.out
                      .println(
                          "Daftar Menu Spesifik\n1. Resyad\n2. Pahri\n3. Angga\n4. Gatsby\n5. Mila\nOther Number. Exit Program");

                  choiceMengajar = sc.nextInt(); // Input siapa yang mau diajar oleh mrs.rose
                  if (choiceMengajar == 1) { // Resyad
                    mrs_rose.Mengajar(Resyad);
                  } else if (choiceMengajar == 2) { // Pahri
                    mrs_rose.Mengajar(Pahri);
                  } else if (choiceMengajar == 3) { // Angga
                    mrs_rose.Mengajar(Angga);
                  } else if (choiceMengajar == 4) { // Gatsby
                    mrs_rose.Mengajar(Gatsby);
                  } else if (choiceMengajar == 5) { // Mila
                    mrs_rose.Mengajar(Mila);
                  } else {
                    flag4 = false;
                  }
                } while (flag4);
              } else if (choiceDetailPersonal == 3) { // BeriNilai kepada seluruh mhs
                mrs_rose.beriNilai(Resyad, Pahri, Angga, Gatsby, Mila);
              } else {
                flag3 = false;
              }
            } while (flag3);
          } else {
            flag2 = false;
          }
        } while (flag2);
      } else { // Selain menu diatas, loop berhenti
        flag = false;
      }
      System.out.print('\u000C');
    } while (flag);
    sc.close(); // Penutup Inputan

  }
}