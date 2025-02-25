import java.util.Scanner;

public class MataKuliahDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.print("Masukkan Jumlah Length: ");
        int jmlMK = sc.nextInt();
        sc.nextLine();

        MataKuliah02[] AoM = new MataKuliah02[jmlMK];
        String kode="", nama=" ";
        int sks=0, jumlahJam=0;

        for(int i = 0; i < AoM.length; i++){
            System.out.println("Masukkan Data Matakuliah ke-"+(i+1));
            AoM[i] = new MataKuliah02(kode, nama, sks, jumlahJam);
            AoM[i].tambahData(sc);
        }

        for(int i=0; i < AoM.length; i++) {
            System.out.println();
            System.out.println("Data Matakuliah ke-" + (i + 1));
            AoM[i].cetakInfo();
        }
    }
}