package Tugas;

class MataKuliah02{
    String kodeMK, nama;
    int sks, jumlahJam;

    MataKuliah02(){

    }

    MataKuliah02(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi(){
        System.out.printf("Nama MK: %s%nKode MK: %s%nSKS: %s%nJumlah Jam: %s%n",  nama, kodeMK, sks, jumlahJam);
    }

    void ubahSKS(int sksBaru){
        sks = sksBaru;
        System.out.printf("SKS Telah Diubah menjadi %s%n", sksBaru);
    }

    void tambahJam(int jam){
        jumlahJam += jam;
    }

    void kurangiJam(int jam){
        if(jam > jumlahJam){
            System.out.printf("Jam tidak bisa dikurangi %s jam karena hanya tersisa %s jam %n", jam, jumlahJam);
        }else{
            jumlahJam -= jam;
        }
    }
}