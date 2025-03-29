package Tugas;

import java.util.Scanner;

public class DosenDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.print("Masukkan Jumlah Dosen: ");
        int jumDosen = sc.nextInt();
        sc.nextLine();

        DataDosen02 listDosen = new DataDosen02(jumDosen);

        for(int i = 0; i < jumDosen; i++){
            System.out.println("Masukkan Data Dosen Ke-" + (i+1));                                          
            System.out.print("Kode\t: ");
            String kode = sc.nextLine();
            System.out.print("Nama\t: ");
            String nama = sc.nextLine();
            System.out.print("Umur\t: ");
            int umur = sc.nextInt();
            sc.nextLine();
            
            boolean jk = false;
            do{
                System.out.print("Jenis Kelamin (p/l)\t: ");
                String jenisKelamin = sc.nextLine();

                if(jenisKelamin.equalsIgnoreCase("p")){
                    jk = false;
                    break;
                }else if(jenisKelamin.equalsIgnoreCase("l")){
                    jk = true;
                    break;
                }else{
                    System.out.println("pilih jenis kelamin yang benar!!");
                }
            }while(true);

            listDosen.tambah(new Dosen02(kode, nama, jk, umur));
        }

        listDosen.tampil();

        System.out.println("=============================");
        System.out.println("Pencarian Data Dosen By Nama");
        System.out.println("=============================");
        System.out.print("Masukkan Nama: ");
        String cariNama = sc.nextLine();
        listDosen.pencarianDataSequential02(cariNama);

        System.out.println("=============================");
        System.out.println("Pencarian Data Dosen By Umur");
        System.out.println("=============================");
        System.out.print("Masukkan Umur: ");
        int cariUmur = sc.nextInt();
        listDosen.bubbleSort02();
        listDosen.binarySearchRecursive02(cariUmur, 0, jumDosen-1);

        sc.close();
    }
}
