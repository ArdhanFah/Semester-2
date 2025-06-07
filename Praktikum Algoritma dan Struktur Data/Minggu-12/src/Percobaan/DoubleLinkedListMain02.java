package src.Percobaan;
import java.util.Scanner;

public class DoubleLinkedListMain02 {
    
    static private Mahasiswa02 inputMahasiswa() {
            Scanner sc1 = new Scanner(System.in);
            System.out.print("Masukkan NIM: ");
            String nim = sc1.nextLine();
            System.out.print("Masukkan Nama: ");
            String nama = sc1.nextLine();
            System.out.print("Masukkan Kelas: ");
            String kelas = sc1.nextLine();
            System.out.print("Masukkan IPK: ");
            double ipk = sc1.nextDouble();
            sc1.nextLine();
            sc1.close();
            return new Mahasiswa02(nim, nama, kelas, ipk);
        }
    
    public static void main(String[] args) {
        DoubleLinkedList02 list = new DoubleLinkedList02();
        Scanner sc = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Tambah setelah NIM tertentu");
            System.out.println("4. Hapus di awal");
            System.out.println("5. Hapus di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("7. Cari mahasiswa berdasarkan NIM");
            System.out.println("8. Tambahkan data");
            System.out.println("9. Hapus by Index");
            System.out.println("10. Tampilkan Head");
            System.out.println("11. Tampilkan Tail");
            System.out.println("12. Tampilkan by Index");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1 -> {
                    Mahasiswa02 mhs = inputMahasiswa();
                    list.addFirst(mhs);
                    break;
                }
                case 2 -> {
                    Mahasiswa02 mhs = inputMahasiswa();
                    list.addLast(mhs);
                    break;
                }
                case 3 -> {
                    Mahasiswa02 mhs = inputMahasiswa();
                    System.out.print("Masukkan NIM mahasiswa sebelumnya: ");
                    String key = sc.nextLine();
                    if(list.search(key) != null) {
                        list.insertAfter(key, mhs);
                    } else {
                        System.out.println("NIM " + key + " tidak ditemukan.");
                        System.out.println("Menambahkan " + mhs.nama + " dengan NIM: " + mhs.nim  + " di Akhir List.");
                        list.addLast(mhs);
                    }
                    
                }
                case 4 -> list.removeFirst();
                case 5 -> list.removeLast();
                case 6 -> list.print();
                case 7 -> {
                    System.out.println("Masukkan NIM mahasiswa yang dicari: ");
                    String nim = sc.nextLine();
                    Node02 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan:");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan");
                    }
                }
                case 8 -> {
                    Mahasiswa02 mhs4 = inputMahasiswa();
                    System.out.print("Masukkan index keberapa data akan ditambahkan: ");
                    int index = sc.nextInt(); sc.nextLine();
                    list.add(index, mhs4);
                }
                case 9 -> {
                    System.out.print("Masukkan Index keberapa data akan dihapus: ");
                    int index = sc.nextInt(); sc.nextLine();
                    list.remove(index);
                }
                case 10 -> {
                    Mahasiswa02 head = list.getFirst();
                    if (head != null) {
                        System.out.println("Data Head: ");
                        head.tampil();
                    } else {
                        System.out.println("List kosong, tidak ada Head.");
                    }
                }

                case 11 -> {
                    Mahasiswa02 tail = list.getLast();
                    if (tail != null) {
                        System.out.println("Data Tail: ");
                        tail.tampil();
                    } else {
                        System.out.println("List kosong, tidak ada Tail.");
                    }
                }
                case 12 -> {
                    System.out.print("Masukkan index keberapa data akan ditampilkan: ");
                    int index = sc.nextInt(); sc.nextLine();
                    Mahasiswa02 nodeAtIndex = list.getIndex(index);
                    if (nodeAtIndex != null) {
                        System.out.println("Data pada index " + index + ":");
                        nodeAtIndex.tampil();
                    } else {
                        System.out.println("Index di luar batas list.");
                    }
                }
                case 0 -> {
                    System.out.println("Keluar dari program"); 
                    System.exit(0);
                }
                default -> System.out.println("Pilihan tidak valid");
            }
        }while (pilihan != 0);
        sc.close();
    }    
}
