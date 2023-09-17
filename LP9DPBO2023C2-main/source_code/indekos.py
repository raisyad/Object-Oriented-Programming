from hunian import Hunian

class Indekos(Hunian):
    def __init__(self, nama_pemilik, nama_penghuni, tahun_awal_kost, bayar_kost, alamat):
        super().__init__("Indekos")
        self.nama_pemilik = nama_pemilik
        self.nama_penghuni = nama_penghuni
        self.tahun_awal_kost = tahun_awal_kost
        self.bayar_kost = bayar_kost
        self.alamat = alamat

    def get_dokumen(self):
        return "Bukti kontrak indekos oleh " + self.nama_penghuni + " dari " + self.nama_pemilik + "."

    def get_nama_pemilik(self):
        return self.nama_pemilik

    def get_nama_penghuni(self):
        return self.nama_penghuni

    def get_summary(self):
        return "Hunian Indekos.\n"
    
    def get_fasilitas(self) :
        return "- Ber-AC\n- Toliet Didalam\n- Ada Dapur"
    
    def get_detail(self) :
        return "Pemilik : " + self.nama_pemilik + "\nJumlah Kamar : " + str(self.jml_kamar) + "\nTahun Awal Kost : " + self.tahun_awal_kost + "\nBayaran Kost : " + self.bayar_kost + "\nAlamat : " + self.alamat + "\nFasilitas : \n" + self.get_fasilitas() + "\n"
    
    def get_picture(self):
        return "pict2pbo.jpg"