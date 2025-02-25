package Tugas;
import java.util.Scanner;

public class DosenDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Dosen02[] dosen = new Dosen02[2];
        String nama = "", kode = "";
        int usia = 0 ;
        Boolean jenisKelamin = false;

        for(int i = 0; i < dosen.length; i++){
            System.out.println("Hasukkan Data Mahasiswa ke-" + (i+1));                
            dosen[i] = new Dosen02(kode, nama, jenisKelamin, usia);
            dosen[i].tambahData(sc);
        }

        System.out.println("\nData Dosen yang Telah Dimasukkan:");
        DataDosen02 dataDosen = new DataDosen02();
        dataDosen.dataSemuaDosen(dosen);

        dataDosen.jumlahDosenPerJenisKelamin(dosen);
        dataDosen.rerataUsiaDosenPerJenisKelamin(dosen);
        dataDosen.infoDosenPalingTua(dosen);
        dataDosen.infoDosenPalingMuda(dosen);
        sc.close();
    }
}
