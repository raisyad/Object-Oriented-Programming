from hunian import Hunian

class Apartemen(Hunian):
    def __init__(self, nama_pemilik, alamat, tahun_tinggal, jml_penghuni, jml_kamar):
        super().__init__("Apartemen", jml_penghuni, jml_kamar)
        self.nama_pemilik = nama_pemilik
        self.alamat = alamat
        self.tahun_tinggal = tahun_tinggal

    def get_dokumen(self):
        return "Sertifikat Hak Milik Atas Satuan Rumah Susun (SHMSRS) a/n " + self.nama_pemilik + "."

    def get_nama_pemilik(self):
        return self.nama_pemilik
    
    def get_luas_apart(self) :
        return str(25 * self.jml_kamar)
    
    def get_picture(self):
        return "pict1pbo.jpg"
    
    def get_detail(self):
        return "Pemilik : " + self.nama_pemilik + "\nJumlah Kamar : " + str(self.jml_kamar) + "\n" + "Alamat : " + self.alamat + "\n" + "Tahun Tinggal : " + self.tahun_tinggal + "\nLuas Apartemen : " + self.get_luas_apart() + "m2\n"