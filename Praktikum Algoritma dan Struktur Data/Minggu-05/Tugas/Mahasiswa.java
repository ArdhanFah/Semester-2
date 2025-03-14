package Tugas;

public class Mahasiswa {
    String nama, nim, tahunMasuk;
    int nilUts, nilUas;

    Mahasiswa(String nama, String nim, String tahunMasuk, int nilUts, int nilUas) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilUts = nilUts;
        this.nilUas = nilUas;
    }

    double nilaiUtsTerendah(Mahasiswa mhs[], int kiri, int kanan){
        if(kiri == kanan){
            return mhs[kiri].nilUts;
        }else{
            int tengah = (kiri + kanan)/2;
            double minKiri = nilaiUtsTerendah(mhs, kiri, tengah);
            double minKanan = nilaiUtsTerendah(mhs, tengah+1, kanan);
            if(minKiri < minKanan){
                return minKiri;
            }else{
                return minKanan;
            }
        }
    }

    double nilaiUastertinggi(Mahasiswa mhs[], int kiri, int kanan){
        if(kiri == kanan){
            return mhs[kiri].nilUas;
        }else{
            int tengah = (kiri + kanan)/2;
            double maxKiri = nilaiUastertinggi(mhs, kiri, tengah);
            double maxKanan = nilaiUastertinggi(mhs, tengah+1, kanan);
            if(maxKiri > maxKanan){
                return maxKiri;
            }else{
                return maxKanan;
            }
        }
    }

    double rataNilaiUas(Mahasiswa mhs[]){
        double rata = 0;
        for(Mahasiswa m : mhs){
            rata += m.nilUas;
        }
        return rata/mhs.length;
    }
}
