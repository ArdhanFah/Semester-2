package src.tugas;

public class Mahasiswa02 {
    String nama, nim;

    public Mahasiswa02(String nim, String nama) {
        this.nama = nama;
        this.nim = nim;
    }

    public void print() {
        System.out.println("NIM: " + nim + ", Nama: " + nama);
    }
}
