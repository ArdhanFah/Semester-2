package Praktikum;
import java.util.Locale;
import java.util.Scanner;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // agari nput double bisa menggunakan titik
        System.out.println("----------------------------");
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();
        MahasiswaBerprestasi02 list = new MahasiswaBerprestasi02(jumMhs);

        for(int i = 0; i < jumMhs; i++){
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("NIM : ");
            String nim = sc.nextLine();
            System.out.print("Nama : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK : ");
            String ip = sc.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("--------------------------------------------");
            
            list.tambah(new Mahasiswa02(nim, nama, kelas, ipk));
        }

        list.tampil();

        System.out.println("-----------------------------");
        System.out.println("Pencarian Data");
        System.out.println("-----------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("Menggunakan Squensial Searching");
        int posisi = list.sequentialSearch(cari);
        int pos = posisi;
        list.tampilPosisi(cari, pos);
        list.tampilDataSearch(cari, pos);

        sc.close();
    }
}
