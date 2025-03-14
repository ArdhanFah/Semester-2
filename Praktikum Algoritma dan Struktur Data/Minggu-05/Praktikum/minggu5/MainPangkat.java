package minggu5;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masuukan jumlah elemen: ");
        int elemen = input.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for(int i = 0; i < elemen; i++){
            System.out.print("Masukkan nilai basis elemen ke-"+(i+1)+": ");
            int basis = input.nextInt();
            System.out.print("Masukkan nilai pemangkat elemen ke-"+(i+1)+": ");
            int pangkat = input.nextInt();
            png[i] = new Pangkat(basis, pangkat);
        }

        System.out.println("Hasil pangkat Brute Force");
        for(Pangkat p : png){
            System.out.println("Nilai "+p.nilai+" pangkat "+p.pangkat+" adalah: "+p.pangkatBF());
        }

        System.out.println("Hasil pangkat Divide and Conquer");
        for(Pangkat p : png){
            System.out.println("Nilai "+p.nilai+" pangkat "+p.pangkat+" adalah: "+p.pangaktDC(p.nilai, p.pangkat));
        }

        input.close();
    }    
}
