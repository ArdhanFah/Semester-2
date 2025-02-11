import java.util.Scanner;

public class praktikum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int nilTugas, nilKuis, Uts, Uas;

        System.out.println("---------- POLINEMA -----------");
        System.out.print("Msukkan nilai Tugas: ");
        nilTugas = sc.nextInt();
        System.out.print("Masukkan nilai Kuis: ");
        nilKuis = sc.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        Uts = sc.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        Uas = sc.nextInt();
        System.out.println("-------------------------------");

        if((nilKuis < 0 && nilKuis > 100 ) || 
            (nilTugas < 0 && nilTugas > 100) ||
            (Uts < 0 && Uts > 100) || (Uas < 0 && Uas > 100)){
                System.out.println("Nilai Tidak Valid!");
            }else{
                double totalNilai = (nilTugas * 0.2) + (nilKuis * 0.2) + (Uts * 0.3) + (Uas * 0.3);
                String nilAngka;

                if (totalNilai > 80 && totalNilai <= 100) {
                    nilAngka = "A";
                } else if (totalNilai > 73 && totalNilai <= 80) {
                    nilAngka = "B+";
                } else if (totalNilai > 65 && totalNilai <= 73) {
                    nilAngka = "B";
                } else if (totalNilai > 60 && totalNilai <= 65) {
                    nilAngka = "C+";
                } else if (totalNilai > 50 && totalNilai <= 60) {
                    nilAngka = "C";
                } else if (totalNilai > 39 && totalNilai <= 50) {
                    nilAngka = "D";
                } else if (totalNilai >= 0 && totalNilai <= 39) {
                    nilAngka = "E";
                } else {
                    sc.close();
                    return;
                }
                
                System.out.printf("Nilai Akhir = %s\n", totalNilai);
                System.out.printf("Nilai Angka = %s\n", nilAngka);
                System.out.println("---------------------------------");

                if(nilAngka.equals("D") || nilAngka.equals("E")){
                    System.out.println("MAAF ANDA TIDAK LULUS");
                }else{
                    System.out.println("SELAMAT ANDA LULUS");
                }

                sc.close();
            }
    }
}
