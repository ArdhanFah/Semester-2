package src.Pertemuan12;
import java.util.Scanner;

public class SLLMain02 {
    public static void main(String[] args) {
        SingleLinkedList02 sll = new SingleLinkedList02();
        // Scanner input = new Scanner(System.in);
        // do{
        //     System.out.println("Single Linked List");
        //     System.out.println("1. Tambah Data Mahasiswa");
        //     System.out.println("2. Tampilkan Data Mahasiswa");
        //     System.out.println("3. Keluar");
        //     System.out.print("Masukkan Pilihan Anda: ");
        //     int pilihan = input.nextInt();
        //     input.nextLine();
        //     switch(pilihan){
        //         case 1:
        //             System.out.print("Masukkan Nama Mahasiswa: ");
        //             String nama = input.nextLine();
        //             System.out.print("Masukkan NIM Mahasiswa: ");
        //             String nim = input.nextLine();
        //             System.out.print("Masukkan Kelas Mahasiswa: ");
        //             String kelas = input.nextLine();
        //             System.out.print("Masukkan IPK Mahasiswa: ");
        //             double ipk = input.nextDouble();
        //             Mahasiswa02 mhs = new Mahasiswa02(nim, nama, kelas, ipk);
        //             sll.addLast(mhs);
        //             break;
        //         case 2:
        //             sll.print();
        //             break;
        //         case 3:
        //             System.out.println("Terima kasih");
        //             System.exit(0);
        //             break;
        //         default:
        //             System.out.println("Pilihan tidak tersedia");
        //     }
        // }while(true);
        sll.print();
        sll.addFirst(new Mahasiswa02("21212203", "Dirga", "4D", 3.6));
        sll.print();
        sll.addLast(new Mahasiswa02("24212200", "Alvaro", "1D", 4.0));
        sll.print();
        sll.insertAfter("Dirga", new Mahasiswa02("22212202", "Cintia", "3C", 3.5));
        sll.insertAt(2, new Mahasiswa02("23212201", "Bimon", "2D", 3.8));
        sll.print();

        System.out.println("data index 1: ");
        sll.getdata(1);
        System.out.println("data mahasiswa an Bimon pada index" + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLAst();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
