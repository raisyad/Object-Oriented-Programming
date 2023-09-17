
// Saya Raisyad Jullfikar NIM 2106238 mengerjakan TP - 1 
// dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk 
// keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

// Import Library
import java.util.*;

public class Choice {
  // Constructor Kosong
  public Choice() {
  }

  // Menampilkan data umum
  public void tampilUmum(Fakultas fakultas, ArrayList<Course> MK, ArrayList<Organisasi> orgMerge) {
    System.out.print('\u000C');
    System.out.println("===================");
    System.out.println("=    Data Umum    =");
    System.out.println("===================");
    System.out.println("Fakultas    : " + fakultas.getNameFakultas());
    System.out.println("Id Fakultas : " + fakultas.getIdFakultas());
    System.out.println(" > Prodi    : " + fakultas.getProdi().get(0).getNameProdi());
    System.out.println("   > List Mahasiswa   :");
    for (int i = 0; i < fakultas.getProdi().get(0).getMhs().size(); i++) {
      System.out.println("     - " + fakultas.getProdi().get(0).getMhs().get(i).getName());
    }
    System.out.println("   > List Dosen       :");
    for (int i = 0; i < fakultas.getProdi().get(0).getDsn().size(); i++) {
      System.out.println("     - " + fakultas.getProdi().get(0).getDsn().get(i).getName());
    }

    System.out.println("   > List Mata Kuliah :");
    for (int i = 0; i < MK.size(); i++) {
      System.out.println("     - " + MK.get(i).getNamaMK());
    }

    System.out.println("   > List Organisasi  :");
    for (int i = 0; i < orgMerge.size(); i++) {
      System.out.println("     - " + orgMerge.get(i).getNamaOrganisasi());
    }
  }

  // Menampilkan data Mahasiswa
  public void tampilMhs(Fakultas fakultas, ArrayList<Mahasiswa> dataMhs) {
    System.out.print('\u000C');
    System.out.println("========================");
    System.out.println("=    Data Mahasiswa    =");
    System.out.println("========================");
    System.out.println();
    System.out.println("Fakultas    : " + fakultas.getNameFakultas());
    System.out.println("Id Fakultas : " + fakultas.getIdFakultas());
    System.out.println(" > Prodi    : " + fakultas.getProdi().get(0).getNameProdi());
    System.out.println("   Id Prodi : " + fakultas.getProdi().get(0).getIdProdi());
    System.out.println("   > Detail Mahasiswa   :");
    for (int i = 0; i < dataMhs.size(); i++) {
      System.out.println("     > Data Mahasiswa ke-" + Integer.toString(i + 1) + " :");
      System.out.println("       - NIK                     : " + dataMhs.get(i).getNIK());
      System.out.println("       - Name                    : " + dataMhs.get(i).getName());
      System.out.println("       - Jenis Kelamin           : " + dataMhs.get(i).getJkelamin());
      System.out.println("       - Umur                    : " + dataMhs.get(i).getUmur());
      System.out.println("       - Status Pekerjaan        : " + dataMhs.get(i).getStatusPekerjaan());
      System.out.println("       - NIM                     : " + dataMhs.get(i).getNIM());
      System.out.println("       - Fakultas                : " + dataMhs.get(i).getFakultas());
      System.out.println("       - Prodi                   : " + dataMhs.get(i).getProdi());
      System.out.println("       > List Barang Kepemilikan :");
      for (int z = 0; z < dataMhs.get(i).getBarang().size(); z++) {
        System.out.println("         + " + dataMhs.get(i).getBarang().get(z).getDetailBarang());
      }
      System.out.println("       > List Kontrak Matkul     :");
      for (int z = 0; z < dataMhs.get(i).getMatkul().size(); z++) {
        System.out.println("         + " + dataMhs.get(i).getMatkul().get(z).getNamaMK());
      }
      System.out.println("       > Keterangan Tambahan     :");
      // System.out.println(dataMhs.get(i).eat());
      dataMhs.get(i).eat();
      dataMhs.get(i).drink();
      dataMhs.get(i).sleep();
      System.out.println();
    }
  }

  // Menampilkan data Dosen
  public void tampilDosen(Fakultas fakultas, ArrayList<Dosen> dataDsn) {
    System.out.print('\u000C');
    System.out.println("====================");
    System.out.println("=    Data Dosen    =");
    System.out.println("====================");
    System.out.println();
    System.out.println("Fakultas    : " + fakultas.getNameFakultas());
    System.out.println("Id Fakultas : " + fakultas.getIdFakultas());
    System.out.println(" > Prodi    : " + fakultas.getProdi().get(0).getNameProdi());
    System.out.println("   Id Prodi : " + fakultas.getProdi().get(0).getIdProdi());
    System.out.println("   > Detail Dosen   :");
    for (int i = 0; i < fakultas.getProdi().get(0).getDsn().size(); i++) {
      System.out.println("     > Data Dosen ke-" + Integer.toString(i + 1) + " :");
      System.out.println("       - NIK                     : " + fakultas.getProdi().get(0).getDsn().get(i).getNIK());
      System.out.println("       - Name                    : " + fakultas.getProdi().get(0).getDsn().get(i).getName());
      System.out
          .println("       - Jenis Kelamin           : " + fakultas.getProdi().get(0).getDsn().get(i).getJkelamin());
      System.out.println("       - Umur                    : " + fakultas.getProdi().get(0).getDsn().get(i).getUmur());
      System.out.println(
          "       - Status Pekerjaan        : " + fakultas.getProdi().get(0).getDsn().get(i).getStatusPekerjaan());
      System.out.println("       - NIP                     : " + fakultas.getProdi().get(0).getDsn().get(i).getNIP());
      System.out
          .println("       - Fakultas                : " + fakultas.getProdi().get(0).getDsn().get(i).getFakultas());
      System.out.println("       - Prodi                   : " + fakultas.getProdi().get(i).getNameProdi());
      System.out.println("       > List Barang Kepemilikan :");
      for (int z = 0; z < fakultas.getProdi().get(0).getDsn().get(i).getBarang().size(); z++) {
        System.out.println("         + " + dataDsn.get(i).getBarang().get(z).getDetailBarang());
      }
      System.out.println("       > Mengampu Mata Kuliah    :");
      System.out.println("         + " + dataDsn.get(i).getMatkul().getNamaMK());
      System.out.println("       > Asisten                 :");
      System.out.println("         + " + dataDsn.get(i).getAsisten().getMhs().getName());

      System.out.println();
    }
  }

  // Menampilkan data Matkul
  public void tampilMatkul(Fakultas fakultas, ArrayList<Course> MK) {
    System.out.print('\u000C');
    System.out.println("=====================");
    System.out.println("=    Data Matkul    =");
    System.out.println("=====================");
    System.out.println();
    System.out.println("Fakultas    : " + fakultas.getNameFakultas());
    System.out.println("Id Fakultas : " + fakultas.getIdFakultas());
    System.out.println(" > Prodi    : " + fakultas.getProdi().get(0).getNameProdi());
    System.out.println("   Id Prodi : " + fakultas.getProdi().get(0).getIdProdi());
    System.out.println("   > Detail Mata Kuliah   :");
    for (int i = 0; i < MK.size(); i++) {
      System.out.println("     - " + MK.get(i).getNamaMK());
    }
  }

  // Menampilkan data Organisasi
  public void tampilOrganisasi(Fakultas fakultas, ArrayList<Organisasi> orgMerge) {
    System.out.print('\u000C');
    System.out.println("=========================");
    System.out.println("=    Data Organisasi    =");
    System.out.println("=========================");
    System.out.println();
    System.out.println("Fakultas    : " + fakultas.getNameFakultas());
    System.out.println("Id Fakultas : " + fakultas.getIdFakultas());
    System.out.println(" > Prodi    : " + fakultas.getProdi().get(0).getNameProdi());
    System.out.println("   Id Prodi : " + fakultas.getProdi().get(0).getIdProdi());
    System.out.println("   > Detail Organisasi   :");
    for (int i = 0; i < orgMerge.size(); i++) {
      System.out.println("     > Data Organisasi ke-" + Integer.toString(i + 1) + " :");
      System.out.println("       - Nama Organisasi      : " + orgMerge.get(i).getNamaOrganisasi());
      System.out.println("       - Id Organisasi        : " + orgMerge.get(i).getIdOrganisasi());
      System.out.println("       - Tingkatan Organisasi : " + orgMerge.get(i).getTingkatanOrganisasi());
      System.out.println("       - Ketua Organisasi     : " + orgMerge.get(i).getKetuaOrganisasi());
      System.out.println("       > Anggota Organisasi   : ");
      for (int x = 0; x < orgMerge.get(i).getAnggotaOrganisasi().size(); x++) {
        System.out.println("         > Data Anggota ke-" + Integer.toString(x + 1) + " :");
        System.out.println("           - Nama      : " + orgMerge.get(i).getAnggotaOrganisasi().get(x).getName());
        System.out.println("           - IdAnggota : " + orgMerge.get(i).getAnggotaOrganisasi().get(x).getIdAnggota());
        System.out.println("           - Jabatan   : " + orgMerge.get(i).getAnggotaOrganisasi().get(x).getJabatan());
        System.out.println();
      }
      System.out.println("       > Kegiatan Organisasi  : ");
      for (int x = 0; x < orgMerge.get(i).getKegiatanOrganisasi().size(); x++) {
        System.out.println("         - Nama Kegiatan            : "
            + orgMerge.get(i).getKegiatanOrganisasi().get(x).getNamaKegiatan());
        System.out.println(
            "         - Id Kegiatan              : " + orgMerge.get(i).getKegiatanOrganisasi().get(x).getIdKegiatan());
        System.out.println("         - Ketua Pelaksana Kegiatan : "
            + orgMerge.get(i).getKegiatanOrganisasi().get(x).getKetuaPelaksana());
        if (orgMerge.get(i).getKegiatanOrganisasi().get(x).getStatusKegiatan() == 1) {
          System.out.println("         - Status Kegiatan          : Belum Terlaksana");
        } else if (orgMerge.get(i).getKegiatanOrganisasi().get(x).getStatusKegiatan() == 2) {
          System.out.println("         - Status Kegiatan          : Sudah Terlaksana");
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}
