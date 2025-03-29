package Tugas;

public class DataDosen02 {
    int idx;
    Dosen02 dataDosen[];
    DataDosen02(int jumDosen){
        dataDosen = new Dosen02[jumDosen];
    }


    void tambah(Dosen02 dsn){
        if(idx < dataDosen.length){
            dataDosen[idx] = dsn;
            idx++;
        }else{
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil(){
        if (idx == 0) {
            System.out.println("Belum ada data dosen!");
            return;
        }
        System.out.println("====================================");
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
            System.out.println("===================================");
        }
    }

    void pencarianDataSequential02(String nma){
        boolean found = false;
        int jum = 0;
        int idx = -1;
        for(int i = 0; i < dataDosen.length; i++){
            if(dataDosen[i].nama.equalsIgnoreCase(nma)){
                found = true;
                idx = i;
                jum++;
            }
        }
        if(found != false && jum == 1){
            System.out.printf("Dosen dengan nama %s ditemukan pada indeks %s%n", nma, idx);
            System.out.printf("Kode\t: %s%nNama\t: %s %nUsia\t: %s %nJenis Kelamin\t: %s %n",dataDosen[idx].kode, dataDosen[idx].nama, dataDosen[idx].usia, dataDosen[idx].jenisKelamin);
        }else if(jum > 1){
            System.out.printf("Peringatan!!! Ada %s dosen yang memiliki nama %s %n",jum, nma);
        }else{
            System.out.printf("Tidak ditemukan dosen dengan nama %s%n", nma);
        }

    }

    void bubbleSort02(){
        for(int i = 0; i < dataDosen.length-1; i++){
            for(int j = 1; j < dataDosen.length-i; j++){
                if(dataDosen[j-1].usia > dataDosen[j].usia){
                    Dosen02 temp = dataDosen[j-1];
                    dataDosen[j-1] = dataDosen[j];
                    dataDosen[j] = temp;
                }
            }
        }
    }

    void binarySearchRecursive02(int cariUmur, int left, int right) {
        if (left > right) {
            System.out.printf("Data dosen dengan umur %d tidak ditemukan %n", cariUmur);
            return;
        }
    
        int mid = (left + right) / 2;  // tahap Devide
    
        // tahap Conquer
        if (dataDosen[mid].usia == cariUmur) {
            int jum = 1; 
            int l = mid - 1;
            int r = mid + 1;
    
            while (l >= 0 && dataDosen[l].usia == cariUmur) {
                jum++;
                l--;
            }
    
            while (r < dataDosen.length && dataDosen[r].usia == cariUmur) {
                jum++;
                r++;
            }
    
            // Combine
            if (jum > 1) {
                System.out.printf("Peringatan!!! ada %d dosen yang memiliki umur %d %n", jum, cariUmur);
            } else {
                System.out.printf("Data dosen dengan umur %d ditemukan pada indeks %d %n", cariUmur, mid);
                System.out.printf("Kode\t: %s%nNama\t: %s %nUsia\t: %s %nJenis Kelamin\t: %s %n",dataDosen[mid].kode, dataDosen[mid].nama, dataDosen[mid].usia, dataDosen[mid].jenisKelamin);
            }
            return;
        } else if (dataDosen[mid].usia < cariUmur) {
            binarySearchRecursive02(cariUmur, mid + 1, right); // Pencarian di kanan
        } else {
            binarySearchRecursive02(cariUmur, left, mid - 1);  // Pencarian di kiri
        }
    }
}

