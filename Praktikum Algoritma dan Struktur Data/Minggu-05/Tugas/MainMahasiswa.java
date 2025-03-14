package Tugas;

public class MainMahasiswa {
    public static void main(String[] args) {
        String[] nama = {"Ahmad", "Budi", "Cindy", "Dian", "Eko","Fajar","Gina","Hadi"};
        String[] nim = {"123", "124", "125", "126", "127","128","129","130"};
        String[] tahunMasuk = {"2022", "2021", "2020", "2019", "2018","2017","2016","2015"};
        int[] nilUts = {78,85,90,76,92,88,80,82};
        int[] nilUas = {82,88,87,79,95,85,83,84};
        
        Mahasiswa[] mhs = new Mahasiswa[nama.length];
        for(int i=0; i<nama.length; i++){
            mhs[i] = new Mahasiswa(nama[i], nim[i], tahunMasuk[i], nilUts[i], nilUas[i]);
        }

        System.out.println("Nilai UTS terendah mahasiswa: " + mhs[0].nilaiUtsTerendah(mhs, 0, mhs.length-1));
        System.out.println("Nilai UAS tertinggi mahasiswa: " + mhs[0].nilaiUastertinggi(mhs, 0, mhs.length-1));
        System.out.println("Rata-rata nilai UAS mahasiswa: " + mhs[0].rataNilaiUas(mhs));

    }

}