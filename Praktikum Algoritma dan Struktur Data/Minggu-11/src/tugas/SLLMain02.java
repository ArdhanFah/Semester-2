package src.tugas;
import java.util.Scanner;

public class SLLMain02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SingleLinkedList02 antrian = new SingleLinkedList02(3);
        int pilihan;

        do{
            System.out.println("=== Antrian Mahasiswa ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Panggil Mahasiswa");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Antrian Terdepan");
            System.out.println("5. Antrian Terakhir");
            System.out.println("6. Tampilkan Panjang antrian");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();input.nextLine();
        
            switch (pilihan) {
                case 1:
                    if(!antrian.isFull()){
                        System.out.print("Msasukkan NIM: ");
                        String nim = input.nextLine();
                        System.out.print("Masukkan Nama: ");
                        String nama = input.nextLine();
                        antrian.enqueue(new Mahasiswa02(nim, nama));
                    }else{
                        System.out.println("Antrian sudah penuh, tidak bisa menambah mahasiswa baru.");
                    }
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.print();
                    break;
                case 4:
                    antrian.peekDepan();
                    break;
                case 5:
                    antrian.peekAkhir();
                    break;
                case 6:
                    antrian.antre();
                    break;
                case 7:
                    System.out.println("Keluar dari program.");
                    System.exit(0);
                default:
                    break;
            }
        }while(pilihan != 7);
    input.close();
    }
}