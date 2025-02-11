import java.util.Scanner;

public class praktikum3
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumMatkul = 8;
        String[] namaMatkul = new String[jumMatkul];
        int[] nilAngka = new int[jumMatkul];
        int bobotSks[] = new int[jumMatkul];
        String nilHuruf[] = new String[jumMatkul];
        float nilSetara[] = new float[jumMatkul];


        System.out.println("-----------------------------------------------");
        System.out.println("---- PROGRAM HITUNG IP SEMESTER POLINEMA ------");
        System.out.println("-----------------------------------------------");
        for(int i = 0; i < namaMatkul.length;){
            System.out.printf("Masukkan nama Matkul ke-%d: ", (i+1));
            namaMatkul[i] = sc.nextLine();

            System.out.printf("Masukkan nilai Angka Matkul %s: ", namaMatkul[i]);
            int nil = sc.nextInt();
            if(nil < 0 || nil > 100){
                System.out.println("Masukkan nilai antara [1-100]");
                continue;
            }else{
                nilAngka[i] = nil;
            }

            System.out.printf("Masukkan Bobot SKS Matkul %s: ", namaMatkul[i]);
            int sks = sc.nextInt();
            if(sks < 0 || sks > 3){
                System.out.println("Masukkan nilai antara [1-100]");
                continue;
            }else{
                bobotSks[i] = sks;
                i++;
            }

            System.out.println();
            sc.nextLine();
        }

        sc.close();
        // Konversi nilai Angka ke nilai Huruf
        for(int i = 0; i < nilAngka.length; i++){
            if (nilAngka[i] > 80 && nilAngka[i] <= 100) {
                nilHuruf[i] = "A";
            } else if (nilAngka[i] > 73 && nilAngka[i] <= 80) {
                nilHuruf[i] = "B+";
            } else if (nilAngka[i] > 65 && nilAngka[i] <= 73) {
                nilHuruf[i] = "B";
            } else if (nilAngka[i] > 60 && nilAngka[i] <= 65) {
                nilHuruf[i] = "C+";
            } else if (nilAngka[i] > 50 && nilAngka[i] <= 60) {
                nilHuruf[i] = "C";
            } else if (nilAngka[i] > 39 && nilAngka[i] <= 50) {
                nilHuruf[i] = "D";
            } else if (nilAngka[i] >= 0 && nilAngka[i] <= 39) {
                nilHuruf[i] = "E";
            } else{
                nilHuruf[i] = "E";
            }
        }

        // Konversi nilai Huruf ke nilai Setara atau bobot Setara
        for(int i = 0; i < nilHuruf.length; i++){
            switch (nilHuruf[i]) {
                case "A":
                    nilSetara[i] = 4.0f;
                    break;
                case "B+":
                    nilSetara[i] = 3.5f;
                    break;
                case "B":
                    nilSetara[i] = 3.0f;
                    break;
                case "C+":
                    nilSetara[i] = 2.5f;
                    break;
                case "C":
                    nilSetara[i] = 2.0f;
                    break;
                case "D":
                    nilSetara[i] = 1.0f;
                    break;
                case "E":
                    nilSetara[i] = 0.0f;
                    break;
                default:
                    break;
            }
        }


        // Hitung IP Semester
        int totSks = 0;
        double ipAkhir = 0;
        for (int s : bobotSks) {
            totSks += s;
        }

       
        for(int i = 0; i < bobotSks.length; i++){
            double nilMatkul = 0;
            nilMatkul = (nilSetara[i] * bobotSks[i]) / totSks;
            ipAkhir+= nilMatkul;
        }

        System.out.println("--------------------------------- HASIL KONVERSI ----------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.printf("%-20s %-15s %-15s %-15s %-15s%n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai", "SKS");
        System.out.println("----------------------------------------------------------------------------------------");
        for(int i = 0; i < namaMatkul.length; i++){
            System.out.printf("%-20s %-15s %-15s %-15s %-15s %n", namaMatkul[i], nilAngka[i], nilHuruf[i], nilSetara[i], bobotSks[i]);
        }
       
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.printf("IP SEMSTER: %.2f %n", ipAkhir);
    } 
}
