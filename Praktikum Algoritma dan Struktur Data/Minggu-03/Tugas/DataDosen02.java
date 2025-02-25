package Tugas;
public class DataDosen02 {
    int jumlahLaki = 0;
    int jumlahPerempuan = 0;
    void dataSemuaDosen(Dosen02[] arrayOfDosen){
        int index = 0;
        for (Dosen02 dsn : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + (index + 1));
            System.out.println("--------------------------");
            System.out.println("Kode        : " + dsn.kode);
            System.out.println("Nama        : " + dsn.nama);
            System.out.println("Usia        : " + dsn.usia);
            System.out.println("Jenis Kelamin: " + (dsn.jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("--------------------------");
            index++;
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen02[] arrayOfDosen){
        for (Dosen02 dsn : arrayOfDosen) {
            if(dsn.jenisKelamin){
                jumlahLaki++;
            }else{
                jumlahPerempuan++;
            }
        }
        System.out.println("Jumlah Dosen laki-laki: " + jumlahLaki);
        System.out.println("Jumlah Dosen Perempuan: " + jumlahPerempuan);
    }
    
    void rerataUsiaDosenPerJenisKelamin(Dosen02[] arrayOfDosen) {
        double rataLaki = 0, rataPerempuan = 0;

        for (Dosen02 dsn : arrayOfDosen) {
            if(dsn.jenisKelamin){
                rataLaki+=dsn.usia;
                
            }else{
                rataPerempuan+=dsn.usia;
            }
        }

        rataLaki/=jumlahLaki;
        rataPerempuan/=jumlahPerempuan;

        System.out.printf("Rata-rata umur dosen laki-laki dari %s dosen : %s %n", jumlahLaki, rataLaki);
        System.out.printf("Rata-rata umur dosen perempuan dari %s dosen : %s %n", jumlahPerempuan, rataPerempuan);

    }

    void infoDosenPalingTua(Dosen02[] arrayOfDosen){
        Dosen02 maxUmur = arrayOfDosen[0];
    
        for(Dosen02 dsn : arrayOfDosen){
            if(dsn.usia > maxUmur.usia){
                maxUmur = dsn;
            }
        }

        System.out.printf("Dosen Tertua Adalah %s %n", maxUmur.nama);

    }

    void infoDosenPalingMuda(Dosen02[] arrayOfDosen){
        Dosen02 minUmur = arrayOfDosen[0];
    
        for(Dosen02 dsn : arrayOfDosen){
            if(dsn.usia < minUmur.usia){
                minUmur = dsn;
            }
        }

        System.out.printf("Dosen Termuda Adalah %s %n", minUmur.nama);

    }
    
}

