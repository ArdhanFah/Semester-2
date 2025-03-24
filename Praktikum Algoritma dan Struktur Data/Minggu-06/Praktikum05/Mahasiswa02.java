public class Mahasiswa02 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa02(){

    }

    Mahasiswa02(String nm, String name, String kls, double ip){
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi(){
        System.out.printf("Nim: %s %nNama: %s%nKelas: %s%nIPK: %s%n", nim, nama, kelas, ipk);
    }
}
