package PraktikumDua;

public class Mahasiswa {
    String nim, nama, prodi, kelas;

    public Mahasiswa(String nim, String nama, String prodi, String kelas){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilData(){
        System.out.printf("%s - %s - %s - %s%n", nim, nama, prodi, kelas);
    }
}
