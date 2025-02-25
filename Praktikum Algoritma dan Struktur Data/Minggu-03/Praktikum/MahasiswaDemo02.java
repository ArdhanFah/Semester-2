import java.util.Scanner;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa02[] AoM = new Mahasiswa02[1];
        String dummy;
        
        for(int i = 0; i < AoM.length; i++){
            AoM[i] = new Mahasiswa02();                
            System.out.println("Hasukkan Data Mahasiswa ke-" + (1+1));
            System.out.print("NIM   : ");
            AoM[i].nim = sc.nextLine();
            System.out.print("Nama  : ");
            AoM[i].nama = sc.nextLine();
            System.out.print("Kelas : ");
            AoM[i].kelas = sc.nextLine();
            System.out.print("IPK   : ");
            dummy = sc.nextLine();
            AoM[i].ipk = Float.parseFloat(dummy);
        }

        for(int i = 0; i < AoM.length; i++){
            System.out.println();
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            AoM[i].cetakInfo();
        }

        Mahasiswa02[] myAoM = new Mahasiswa02[3];
        myAoM[0].nim = "244107060033";
        myAoM[0].nama = "AGNES TITANIA KINANTI";
        myAoM[0].kelas = "SIB-1E";
        myAoM[0].ipk = (float) 3.75;

        sc.close();
    }
}
