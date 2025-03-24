import java.util.Scanner;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        // Input Jumlah Mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = input.nextInt();
        input.nextLine();

        // Membuat object dari class mahasiswaberprestasi02
        MahasiswaBerprestasi02 mhslist = new MahasiswaBerprestasi02(jumMhs);

        for(int i = 0; i < jumMhs; i++){
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("Masukkan nim: ");
            String nim = input.nextLine();
            System.out.print("Masukkan nama: ");
            String nama = input.nextLine();
            System.out.print("Masukkan kelas: ");
            String kls = input.nextLine();
            System.out.print("Masukkan IPK: ");
            double ip = input.nextDouble();
            input.nextLine();

            Mahasiswa02 list = new Mahasiswa02(nim,nama,kls,ip);
            mhslist.tambah(list);
        }

        System.out.println("Data Mahasiswa Sebelum di Sorting: ");
        mhslist.tampil();

        System.out.println("Data Mahasiswa Setelah sorting berdasarkan IPK (DESC): ");
        mhslist.bubbleSort();
        mhslist.tampil();

        System.out.println("Data Mahasiswa Setelah sorting berdasarkan IPK (ASC): ");
        mhslist.selectionSort();
        mhslist.tampil();

        System.out.println("Data Mahasiswa Setelah sorting berdasarkan IPK (ASC): ");
        mhslist.insetionSort();
        mhslist.tampil();
        input.close();
        
    }
}
