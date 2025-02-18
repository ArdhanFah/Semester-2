class Mahasiswa{
    String nim;
    String nama;
    String kelas;
    double ipk;

    void tampilInformasi(){
        System.out.printf("NIM: %s %nNama: %s %nKelas: %s %nIPK: %.1f %n", nim,nama,kelas,ipk);
    }

    void ubahKelas(String kelasBaru){
        this.kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru){
        if(ipk < 0.0 || ipk > 4.0){
            System.out.println( "IPK tidak valid, Harus antara 0.0 dan 4.0");
        }else{
            ipk = ipkBaru;
        }
    }

    String nilaiKerja(double ipk){
        if(ipk >= 3.5){
            return "Kinerja Sangat Baik";
        }else if(ipk >= 3.0){
            return "Kinerja Baik";
        }else if(ipk >= 2.0){
            return "Kinerja Cukup";
        }else{
            return "Kinerja Kurang";
        }
    }
}
