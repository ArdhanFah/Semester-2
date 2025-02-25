package Tugas;

import java.util.Scanner;

public class Dosen02 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    public Dosen02(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    void tambahData(Scanner sc){
        System.out.print("Kode   : ");
        kode = sc.nextLine();
        System.out.print("Nama  : ");
        nama = sc.nextLine();
        System.out.print("Usia : ");
        usia = sc.nextInt();
        System.out.print("Jenis Kelamin  (P/L): ");
        char jenis = sc.next().charAt(0);
        
        if(jenis == 'L'){
            jenisKelamin = true;
        }else if(jenis == 'P'){
            jenisKelamin = false;
        }
        sc.nextLine();
    }
}
