package Mahasiswa;

public class Mahasiswa02 {
  public String nim, nama, kelas;
  public int nilai;

  public Mahasiswa02(){ }

  public Mahasiswa02(String nim, String nama, String kelas){
    this.nim = nim;
    this.nama = nama;
    this.kelas = kelas;
    nilai = -1;
  }

  public void tugasDinilai(int nilai){
    this.nilai = nilai;
  }

}
