package Tugas;

public class DosenMain02 {

    public static void main(String[] args) {
        Dosen02 dosen1 = new Dosen02("122","Pak Imam","Dosen Ahli TI", 2016, true);
        Dosen02 dosen2 = new Dosen02("123", "Pak Bagas", "Dosen Ahli TI", 2014, true);
        Dosen02 dosen3 = new Dosen02("124", "Pak Hasyim", "Dosen Ahli TI",1990, true);

        dosen1.ubahKeahlian("Rektor Polinema");
        dosen2.hitungMasaKerja(2025);
        dosen3.setStatusAktif(false);

        System.out.println();
        System.out.println("=== Setelah di Update ===");
        dosen1.tampilInformasi();
        System.out.println();

        dosen2.tampilInformasi();
        System.out.printf("Masa Kerja: %d Tahun %n", dosen2.hitungMasaKerja(2025));
        
        System.out.println();
        dosen3.tampilInformasi();
    }
}