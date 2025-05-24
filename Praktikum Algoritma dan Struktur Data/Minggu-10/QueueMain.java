import java.util.Scanner;
import Praktikum.Queue;

public class QueueMain {
    public static void menu(){
        System.out.println("Masukkan operasi yang diiinginkan");
        System.out.println("1. Enqueue ");
        System.out.println("2. Dequeue ");
        System.out.println("3. Print ");   
        System.out.println("4. Peek ");
        System.out.println("5. Clear ");
        System.out.println("---------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int n = sc.nextInt();
        int pilih;

        Queue Q = new Queue(n);

        do {
            menu();
            System.out.println("Masukkan pilihan anda: ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = sc.nextInt();
                    Q.enQueue(dataMasuk);
                    break;
                case 2: 
                    int dataKeluar = Q.deQueue();
                    if(dataKeluar != 0){
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                    }
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
                default:
                    System.out.println("Pilih menu 1-5!!!!");
                    continue;
            }
        }while( pilih > 0 || pilih < 6);


    }
}
