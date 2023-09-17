# Saya Raisyad Jullfikar NIM 2106238 mengerjakan soal Latihan 4 dalam mata kuliah Desain Pemrograman Berorientasi 
# Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

# Import file class
from Human import *
from SivitasAkademik import *
from Mahasiswa import *
from Dosen import *
from Prodi import *
from Course import *

# Deklar list
Data = []

# List Mata Kuliah
ListMK = [
  Course("Data Mining & WareHouse"),
  Course("MultiMedia & Design Technique"),
]

# List Mahasiswa
ListMhs = [
  Mahasiswa("131","Resyad","Laki","UPI","res@upi.edu","2106238","FPMIPA"),
  Mahasiswa("132","Mila","Perempuan","UPI","mil@upi.edu","2106232","FPMIPA"),
]

# List Dosen
ListDosen = [
  Dosen("211", "Wibi", "Laki", "UPI", "wib@upi.edu", "19918829", "S3", "Data Mining", "FPMIPA"),
  Dosen("212", "Maxima", "Laki", "UPI", "max@upi.edu", "19928830", "S3", "Animasi & Multimedia", "FPMIPA"),
]

# List Prodi
ListProdi = [
  Prodi("Ilkom", "L301", ListMK[0], ListMhs[0], ListDosen[0]),
  Prodi("Ilkom", "L302", ListMK[1], ListMhs[1], ListDosen[1]),
]

# List Data
Data = [
  ListProdi[0],
  ListProdi[1],
]

# Simulasi Output Lat 3
print("************************")
print("<> Program Studi :", Data[0].get_namaProdi())
print("************************")
print()

# Output List MK
for i in range(1) :
  print("|================|")
  print("|List Mata Kuliah|")
  print("|================|")
  for mk in range(len(ListMK)) :
    print("> Kode :", Data[mk].get_kode())
    print("  - Nama MK       :", Data[mk].get_course().get_namaMK())
print()

# Output List Dosen
for i in range(1) :
  print("|================|")
  print("|List Dosen", Data[i].get_namaProdi() + "|")
  print("|================|")
  for dosen in range(len(ListDosen)) :
    print("> Nama :", Data[dosen].get_dosen().get_name())
    print("   - NIK                 :", Data[dosen].get_dosen().get_nik())
    print("   - Jenis Kelamin       :", Data[dosen].get_dosen().get_jkelamin())
    print("   - Asal Univ           :", Data[dosen].get_dosen().get_auniv())
    print("   - Email               :", Data[dosen].get_dosen().get_email())
    print("   - NIP                 :", Data[dosen].get_dosen().get_nip())
    print("   - Pendidikan Terakhir :", Data[dosen].get_dosen().get_pendterakhir())
    print("   - Keahlian            :", Data[dosen].get_dosen().get_keahlian())
    print("   - Fakultas            :", Data[dosen].get_dosen().get_fakultas())
print()

# Output List Mahasiswa
for i in range(1) :
  print("|====================|")
  print("|List Mahasiswa", Data[i].get_namaProdi() + "|")
  print("|====================|")
  for mhs in range(len(ListMhs)) :
    print("> Nama :", Data[mhs].get_mhs().get_name())
    print("   - NIK           :", Data[mhs].get_mhs().get_nik())
    print("   - Jenis Kelamin :", Data[mhs].get_mhs().get_jkelamin())
    print("   - Asal Univ     :", Data[mhs].get_mhs().get_auniv())
    print("   - Email         :", Data[mhs].get_mhs().get_email())
    print("   - NIM           :", Data[mhs].get_mhs().get_nim())
    print("   - Fakultas      :", Data[mhs].get_mhs().get_fakultas())
print()

# Output List Prodi
for i in range(1) :
  print("|=====================|")
  print("|List Data Prodi", Data[i].get_namaProdi() + "|")
  print("|=====================|")
  print()

  print("> List Mata Kuliah")
  for mk in range(len(ListMK)) :
    print("  - Nama MK :", Data[mk].get_course().get_namaMK())
  print()
  
  print("> List Dosen")
  for dosen in range(len(ListDosen)) :
    print("   /\ Nama : ", Data[dosen].get_dosen().get_name())
    print("      - NIK                 :", Data[dosen].get_dosen().get_nik())
    print("      - Jenis Kelamin       :", Data[dosen].get_dosen().get_jkelamin())
    print("      - Asal Univ           :", Data[dosen].get_dosen().get_auniv())
    print("      - Email               :", Data[dosen].get_dosen().get_email())
    print("      - NIP                 :", Data[dosen].get_dosen().get_nip())
    print("      - Pendidikan Terakhir :", Data[dosen].get_dosen().get_pendterakhir())
    print("      - Keahlian            :", Data[dosen].get_dosen().get_keahlian())
    print("      - Fakultas            :", Data[dosen].get_dosen().get_fakultas())
  print()

  print("> List Mahasiswa")
  for mhs in range(len(ListMhs)) :
    print("   /\ Nama :", Data[mhs].get_mhs().get_name())
    print("      - NIK           :", Data[mhs].get_mhs().get_nik())
    print("      - Jenis Kelamin :", Data[mhs].get_mhs().get_jkelamin())
    print("      - Asal Univ     :", Data[mhs].get_mhs().get_auniv())
    print("      - Email         :", Data[mhs].get_mhs().get_email())
    print("      - NIM           :", Data[mhs].get_mhs().get_nim())
    print("      - Fakultas      :", Data[mhs].get_mhs().get_fakultas())
  print()
    