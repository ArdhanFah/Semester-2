import Surat.StackSurat02;
import Surat.Surat02;
import java.util.Scanner;

public class SuratDemo02 {
    public static void main(String[] args) {
        StackSurat02 stackSurat = new StackSurat02(5);
        Scanner sc = new Scanner(System.in);    
        int choice;

        do{
            System.out.printf("%nMenu:%n");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Masukkan pilihan anda: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();  
                    System.out.print("Masukkan ID Surat: ");
                    String idSurat = sc.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String namaMahasiswa = sc.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Masukkan Jenis Surat (S/I): ");
                    char jenisSurat = sc.next().charAt(0);
                    System.out.print("Masukkan Durasi: ");
                    int durasi = sc.nextInt();
                    Surat02 surat = new Surat02(idSurat, namaMahasiswa, kelas, jenisSurat, durasi);
                    if(!stackSurat.isFull()){
                        stackSurat.push(surat);
                        System.out.println("Surat berhasil ditambahkan.");
                    }
                    break;
                case 2:
                    Surat02 proses = stackSurat.pop();

                    if(proses != null){
                        System.out.printf("Surat dari %s telah diproses %n", proses.namaMahasiswa);
                    }else{
                        System.out.println("Tidak ada surat yang bisa diproses!!");
                    }
                    break;
                case 3:
                    Surat02 show = stackSurat.peek();
                    if(show != null){
                        System.out.printf("Surat Izin Teratas Milik %s %n", show.namaMahasiswa);
                    }
                    break;
                case 4:
                    sc.nextLine();
                    String jenis = ""; 
                    System.out.print("Masukkan nama mahasiswa: ");
                    String nama = sc.nextLine();

                    Surat02 search = stackSurat.cari(nama);
                    if(search != null){
                        System.out.println("-------------------------");
                        System.out.println("\s\s\sSurat Ditemukan");
                        System.out.println("-------------------------");
                        System.out.println("ID Surat: " + search.idSurat);
                        System.out.println("Nama\t: " + search.namaMahasiswa);
                        System.out.println("Kelas\t: " + search.kelas);
                        if(search.jenisSurat == 'S' || search.jenisSurat == 's'){
                            jenis = "Sakit";
                        }else if(search.jenisSurat == 'I' || search .jenisSurat == 'i'){
                            jenis = "Izin";
                        }
                        System.out.println("Jenis\t: " + jenis);
                        System.out.println("Durasi\t: " + search.durasi + " Jam");
                    }else{
                        System.out.println("Tidak ditemukan Surat dari " + nama);
                    }
                    break;
                default:
                    break;
            }
        }while(choice >= 1 && choice <= 4);
        sc.close();
    }
}
