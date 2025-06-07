package src.Percobaan;

public class Mahasiswa02 {
    public String nim;
    public String nama;
    public String kelas;
    public double ipk;
    public Mahasiswa02(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampil(){
        System.out.printf("%15s %15s %15s %15.2f %n", nim, nama, kelas, ipk);
    }
}