package Tugas;

public class Dosen02 {
    String kode,nama,jenisKelamin;
    int usia;

    Dosen02(String kd, String name, Boolean jk, int age){
        kode = kd;
        nama = name;
        usia = age;
        jenisKelamin = (jk) ? "Pria" : "Wanita";
    }

    void tampil(){
        System.out.printf("Kode: %s%nNama: %s%nUsia: %s%nJenis Kelamin: %s%n", kode, nama, usia, jenisKelamin);
    }
}
