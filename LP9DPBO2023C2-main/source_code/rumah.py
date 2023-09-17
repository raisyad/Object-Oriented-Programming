from hunian import Hunian

class Rumah(Hunian):
    def __init__(self, nama_pemilik, tahun_kepemilikan, alamat, jml_penghuni, jml_kamar):
        super().__init__("Rumah", jml_penghuni, jml_kamar)
        self.nama_pemilik = nama_pemilik
        self.tahun_kepemilikan = tahun_kepemilikan
        self.alamat = alamat

    def get_dokumen(self):
        return "Izin Mendirikan Bangunan (IMB) a/n " + self.nama_pemilik

    def get_nama_pemilik(self):
        return self.nama_pemilik
    
    def get_tingkat_rumah(self):
        return "3 Tingkat"
    
    def get_detail(self):
        return "Pemilik : " + self.nama_pemilik + "\nJumlah Kamar : " + str(self.jml_kamar) + "\n" + "Tahun Kepemilikan : " + self.tahun_kepemilikan + "\nAlamat : " + self.alamat + "\nTingkat Rumah : " + self.get_tingkat_rumah()  + "\n"
    
    def get_picture(self):
        return "pict3pbo.jpg"
   