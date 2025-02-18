package Tugas;

class Dosen02 {
   String idDosen;
   String nama;
   String bidangKeahlian;
   int tahunBergabung;
   boolean statusAktif;
   
    Dosen02(String idDosen, String nama, String bidangKeahlian, int tahunBergabung, boolean statusAktif){
        this.idDosen = idDosen;
        this.nama = nama;
        this.bidangKeahlian = bidangKeahlian;
        this.tahunBergabung = tahunBergabung;
        this.statusAktif = statusAktif;
    }

    void tampilInformasi(){
        System.out.printf("ID: %s %nNama: %s %nBidang Keahlian: %s %nTahun Bergabung: %s %n",idDosen, nama, bidangKeahlian, tahunBergabung);
        System.out.print("Status: ");
        setStatusAktif(statusAktif);
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
        System.out.println((statusAktif ? "Aktif" : "Tidak Aktif"));
    }

    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

   void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
   }
}