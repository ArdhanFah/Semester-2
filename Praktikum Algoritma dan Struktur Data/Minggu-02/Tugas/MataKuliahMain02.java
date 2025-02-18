package Tugas;
public class MataKuliahMain02 {
    public static void main(String[] args) {
        // Konstruktor Default
        MataKuliah02 matkul1 = new MataKuliah02();
        matkul1.kodeMK = "RTL123";
        matkul1.nama = "Matdas";
        matkul1.sks = 3;
        matkul1.jumlahJam = 6;
        matkul1.tampilInformasi();

        System.out.println("-------------------------");
        // Konstruktor dengan Paramemter
        MataKuliah02 matkul2 = new MataKuliah02("ER12","RPL",2,4);
        matkul2.tampilInformasi();
        matkul2.kurangiJam(7);

    }
}
