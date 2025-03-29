package Praktikum;
public class Mahasiswa02{
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
        System.out.printf("Nim  : %s %n", nim);
        System.out.printf("Nama : %s %n", nama);
        System.out.printf("Kelas: %s %n", kelas);
        System.out.printf("IPK  : %s %n", ipk);
    }
}