package src.Pertemuan12;

public class Mahasiswa02{
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa02(){

    }

    public Mahasiswa02(String nm, String name, String kls, double ip){
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }

    public void tampilInformasi(){
        System.out.printf("%-15s %-15s %-15s %-15s %n", nim, nama, kelas, ipk);
    }
}