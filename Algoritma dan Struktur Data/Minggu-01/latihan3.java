import java.util.Scanner;

public class latihan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--------- SIAKAD -----------");
        System.out.print("Masukkan jumlah Mahasiswa: ");
        int jmlMhs = sc.nextInt();
        System.out.print("Masukkan jumlah Mata Kuliah: "); 
        int jmlMatkul = sc.nextInt();
        System.out.println("-----------------------------");
        
        int nilaiMatkul[][] = new int[jmlMhs][jmlMatkul];

        for(int i = 0; i < nilaiMatkul.length; i++){
            System.out.println("-------------------------------");
            System.out.printf("\t Mahasiswa ke-%s %n", (i+1));
            System.out.println("-------------------------------");
            for(int j = 0; j < nilaiMatkul[i].length; j++){
                System.out.printf("Masukkan nilai matkul ke-%s: ", (j+1));
                nilaiMatkul[i][j] = sc.nextInt();
            }
        }


        int rataNilai[] = rataRata(nilaiMatkul);
        String status[] = cekKelulusan(rataNilai);

        display(nilaiMatkul, status, rataNilai);

        sc.close();
    }

    static int[] rataRata(int nilaiMatkul[][]){
        int rataNilai[] = new int[nilaiMatkul.length];

        for(int i = 0; i < nilaiMatkul.length; i++){
            int nilai = 0;
            for(int j = 0; j < nilaiMatkul[i].length; j++){
                nilai += nilaiMatkul[i][j];
            }
            // Rata nilai dibagi dengan jumlah matkul
            rataNilai[i] = nilai / nilaiMatkul[i].length;
        }
        return rataNilai;
    }

    static String[] cekKelulusan(int rataNilai[]){
        String[] status  = new String[rataNilai.length];
        
        for(int i = 0; i < status.length; i++){
            status[i] = (rataNilai[i] >= 75) ? "lulus" : "Tidak Lulus";
        }

        return status;
    }

    static void display(int[][] nilaiMatkul, String status[], int rataNilai[]){
        System.out.printf("%-15s", " ");
        for(int i = 0; i < nilaiMatkul[0].length; i++){
            System.out.printf("%-15s", "Mata Kuliah " + (i+1));
        }
        System.out.printf("%-15s", "Rata-rata");
        System.out.printf("%-15s", "Status");

        for(int i = 0; i < nilaiMatkul.length; i++){
            System.out.printf("%n%-15s", "Mahasiswa " + (i+1));
            for(int j = 0; j < nilaiMatkul[i].length; j++){
                System.out.printf("%-15s", nilaiMatkul[i][j]);
            }
            System.out.printf("%-15s", rataNilai[i]);
            System.out.printf("%-15s", status[i]);
        }
    }
}