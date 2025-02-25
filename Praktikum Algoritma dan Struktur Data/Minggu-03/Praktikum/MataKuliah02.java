import java.util.Scanner;

public class MataKuliah02 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah02(String kode, String nama, int sks, int jumlahJam){
        this.nama = nama;
        this.kode = kode;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tambahData(Scanner sc){
        System.out.print("Kode      : ");
        kode = sc.nextLine();
        System.out.print("Nama      : ");
        nama = sc.nextLine();
        System.out.print("Sks       : ");
        sks = sc.nextInt();
        System.out.print("Jumlah Jam: ");
        jumlahJam = sc.nextInt();
        System.out.println("---------------------------------");
        sc.nextLine();
    }

    void cetakInfo(){
        System.out.println("Kode   : "+ kode);
        System.out.println("Nama   : " + nama);
        System.out.println("Sks    : "+ sks);
        System.out.println("Jumlah Jam  : "+ jumlahJam);
        System.out.println("---------------------------------");
    }
}
