import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        do {
            // Menampilkan menu
            System.out.println("---- MATEMATIKA POLINEMA ----");
            System.out.println("1. Hitung Volume Kubus");
            System.out.println("2. Hitung Luas Permukaan Kubus");
            System.out.println("3. Hitung Keliling Kubus");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    tampilVolume(sc);
                    break;
                case 2:
                    tampilLuas(sc);
                    break;
                case 3:
                    tampilKeliling(sc);
                    break;
                case 4:
                    System.out.println("Bye!!");
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid!!!!!!!");
            }
            System.out.println();
        } while (pilihan != 4); // Keluar dari loop jika pengguna memilih "4. Keluaer"
    }

    private static double hitungVolume(double s) {
        return s * s * s;
    }

    private static double hitungLuas(double s) {
        return 6 * (s * s);
    }

    private static double hitungKeliling(double s) {
        return 12 * s;
    }

    private static void tampilVolume(Scanner sc) {
        System.out.print("Masukkan sisi kubus: ");
        double s = sc.nextDouble();
        double Volume = hitungVolume(s);
        System.out.printf("Volume Kubus: %.2f %n", Volume);
    }

    private static void tampilLuas(Scanner sc) {
        System.out.print("Masukkan sisi kubus: ");
        double s = sc.nextDouble();
        double Luas = hitungLuas(s);
        System.out.printf("Luas Permukaan Kubus: %.2f %n", Luas);
    }

    private static void tampilKeliling(Scanner sc) {
        System.out.print("Masukkan sisi kubus: ");
        double s = sc.nextDouble();
        double Keliling = hitungKeliling(s);
        System.out.printf("Keliling Kubus: %.2f %n", Keliling);
    }
}