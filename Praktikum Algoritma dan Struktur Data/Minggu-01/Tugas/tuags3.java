import java.util.Scanner;

public class tuags3 {
    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        int pilihan = 4, jmlMatkul = 0;
       
        System.out.print("Jumlah mata kuliah: ");
        jmlMatkul = scInt.nextInt();
        
        String namaMatkul[] = new String[jmlMatkul];
        int sks[] = new int[jmlMatkul];
        int semester[] = new int[jmlMatkul];
        String hariKuliah[] = new String[jmlMatkul];
        
        tambahData(scStr, scInt, namaMatkul, sks, semester, hariKuliah);

        do{
            System.out.println("--------- POLIEMA -----------");
            System.out.println("1. Tampil Seluruh Jadwal");
            System.out.println("2. Tampil by Hari");
            System.out.println("3. Tampil by Semester");
            System.out.println("4. Tampil by Nama Matkul");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = scInt.nextInt();
            switch (pilihan) {
                case 1:
                    tampilJadwal(namaMatkul, sks, semester, hariKuliah);
                    break;
                case 2:
                    tampilByDays(scStr, namaMatkul, sks, semester, hariKuliah);
                    break;
                case 3:
                    tampilBySmt(scInt, namaMatkul, sks, semester, hariKuliah);
                    break;
                case 4:
                    tampilByNama(scStr, namaMatkul, sks, semester, hariKuliah);
                    break;
                case 5:
                    System.out.println("Bye!!");
                    break;
                default:
                    break;
            } 
        }while(pilihan != 5);
    }

    private static void tambahData(Scanner scStr, Scanner scInt, String namaMatkul[], int sks[], int semester[], String hariKuliah[]){

        System.out.println("----- Tambah Matakuliah -----");
        for(int i = 0; i < namaMatkul.length; i++){
            System.out.println("--------------------------");
            System.out.printf("Mata Kuliah Ke-%d %n", (i+1));
            System.out.println("--------------------------");
            System.out.printf("Masukkan Nama Matkul: ");
            namaMatkul[i] = scStr.nextLine();
            System.out.printf("Masukkan SKS Matkul: ");
            sks[i] = scInt.nextInt();
            System.out.printf("Masukkan Semester Matkul: ");
            semester[i] = scInt.nextInt();
            System.out.printf("Masukkan Hari Matkul: ");
            hariKuliah[i] = scStr.nextLine();
        }
    }

    private static void tampilJadwal(String[] namaMatkul, int[] sks, int semester[], String hariKuliah[]){
        System.out.printf("%-12s %-12s %-12s %-12s%n", "Nama Matkul", "SKS", "Semester", "Hari");
        for(int i = 0; i < namaMatkul.length; i++){
            System.out.printf("%-12s %-12s %-12s %-12s %n", namaMatkul[i], sks[i], semester[i], hariKuliah[i]);
        }
    }

    private static void tampilByDays(Scanner scStr, String[] namaMatkul, int[] sks, int semester[], String hariKuliah[]){
        System.out.print("Pilih by Hari: ");
        String hari = scStr.nextLine();
        
        System.out.printf("%-12s %-12s %-12s %-12s%n", "Nama Matkul", "SKS", "Semester", "Hari");
        for(int i = 0; i < hariKuliah.length; i++){
            if(hariKuliah[i].equalsIgnoreCase(hari)){
                System.out.printf("%-12s %-12s %-12s %-12s %n", namaMatkul[i], sks[i], semester[i], hariKuliah[i]);
            }
        }
    }

    private static void tampilBySmt(Scanner scInt, String[] namaMatkul, int[] sks, int semester[], String hariKuliah[]){
        System.out.print("Pilih by Semester: ");
        int smt = scInt.nextInt();
        
        System.out.printf("%-12s %-12s %-12s %-12s%n", "Nama Matkul", "SKS", "Semester", "Hari");
        for(int i = 0; i < hariKuliah.length; i++){
            if(semester[i] == smt){
                System.out.printf("%-12s %-12s %-12s %-12s %n", namaMatkul[i], sks[i], semester[i], hariKuliah[i]);
            }
        }
    }

    private static void tampilByNama(Scanner scStr, String namaMatkul[], int sks[], int semester[], String hariKuliah[]){
        System.out.print("Pilih by Nama Matkul: ");
        String inpHari = scStr.nextLine();
        
        System.out.printf("%-12s %-12s %-12s %-12s%n", "Nama Matkul", "SKS", "Semester", "Hari");
        for(int i = 0; i < hariKuliah.length; i++){
            if(namaMatkul[i].equalsIgnoreCase(inpHari)){
                System.out.printf("%-12s %-12s %-12s %-12s %n", namaMatkul[i], sks[i], semester[i], hariKuliah[i]);
            }
        }
    }
}
