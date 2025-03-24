package Tugas;

import java.util.Scanner;

public class DemoDosen02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean jenisKelamin;
        DataDosen02 dosenlist = new DataDosen02();

        int maxDsn = 10; // Jumlah Dosen
        for(int i = 0; i < maxDsn; i++){
            System.out.println("Masukkan data dosen ke-" + (i+1));
            System.out.print("Masukkan Kode: ");
            String kode = input.nextLine();
            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();
            System.out.print("Masukkan Usia: ");
            int usia = input.nextInt();
            input.nextLine();

            do{
                System.out.print("Masukkan Jenis Kelamin (p/l): ");
                char jk = input.nextLine().charAt(0);

                if(jk == 'p' || jk == 'P'){
                    jenisKelamin = false; // Untuk Perempuan
                    break;
                }else if(jk == 'l' || jk == 'L'){
                    jenisKelamin = true; // Untuk laki laki
                    break;
                }else{
                    System.out.println("Jenis Kelamin yang anda masukkan salah!!");
                }
            }while(true);

            Dosen02 list = new Dosen02(kode, nama, jenisKelamin, usia);
            dosenlist.tambah(list);
        }
        System.out.println("Data Sebelum di sorting");
        dosenlist.tampil();

        System.out.println("Data setelah disorting menggunakan Bubble Sort (ASC)");
        dosenlist.bubbleSort();
        dosenlist.tampil();

        System.out.println("Data setelah disorting menggunakan Selection Sort(DESC)");
        dosenlist.selectionSort();
        dosenlist.tampil();

        input.close();
    }
}
