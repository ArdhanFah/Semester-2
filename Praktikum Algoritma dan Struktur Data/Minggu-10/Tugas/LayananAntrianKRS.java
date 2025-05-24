package Tugas;

import java.util.Scanner;

public class LayananAntrianKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayananaKRS antrian = new AntrianLayananaKRS(10);
        int pilihan;

        do{
            System.out.println("\n===== Menu Antrian Layanan Akademik =====");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat 2 Antrian Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Lihat Antrian Terakhir");
            System.out.println("6. Jumlah Mahasiswa dalam Antrian");
            System.out.println("7. Jumlah Mahasiswa Belum Dilayani");
            System.out.println("8. Jumlah Mahasiswa Sudah Dilayani");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : " );
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);   
                    break;
                case 2:
                    antrian.panggilMahasiswa();
                    break;
                case 3:
                    antrian.tampilAwal();
                    break;
                case 4:
                    antrian.tampilSemua();
                    break;
                 case 5:
                    antrian.tampilAkhir();
                    break;
                case 6:
                    antrian.jumlahAntrian();
                    break;
                case 7:
                    antrian.jumlahBelumDilayani();
                    break;
                case 8:
                    antrian.jumlahDilayani();
                    break;
                case 9:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terima Kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!!!");
                    break;
            }
        }while(pilihan != 0);

        sc.close();
    }
}
