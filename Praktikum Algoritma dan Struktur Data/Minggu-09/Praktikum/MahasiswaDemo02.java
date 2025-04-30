import java.util.Scanner;
import Mahasiswa.StackTugasMahasiswa02;
import Mahasiswa.Mahasiswa02;


public class MahasiswaDemo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackTugasMahasiswa02 stack = new StackTugasMahasiswa02(2);
        int choice;
        
        do {
            System.out.printf("%nMenu%n");
            System.out.printf("1. Mengumpulkan Tugas%n2. Menilai Tugas%n3. Melihat Tugas Teratas%n4. Melihat Daftar Tugas%n5. Melhat Tugas Terbawah%n6. Jumlah Tugas yang Terkumpul%n");
            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    System.out.print("Nama: ");
                    String name = scanner.nextLine();
                    System.out.print("NIM:  ");
                    String nim = scanner.nextLine();
                    System.out.print("Kelas ");
                    String kelas = scanner.nextLine();
                    Mahasiswa02 mhs = new Mahasiswa02(nim, name, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan %n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa02 diNilai = stack.pop();
                    if (diNilai != null) {
                        System.out.printf("Menilai tugas dari %s %n", diNilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scanner.nextInt();
                        diNilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d%n", diNilai.nama, diNilai.nilai);
                    }
                    break;
                case 3:
                    Mahasiswa02 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas:");
                    stack.print();
                    break;
                case 5:
                    stack.bottom();
                    break;
                case 6:
                    System.out.printf("Total Tugas yang Sudah Dikumpulkan: %s%n", stack.hitungTugas()); 
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }
    }while(choice >= 1 && choice <= 6);
    scanner.close();
        
    }
}
