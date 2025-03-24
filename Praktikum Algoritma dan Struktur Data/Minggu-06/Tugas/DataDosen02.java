package Tugas;
public class DataDosen02 {
    Dosen02 dataDosen[] = new Dosen02[10];
    int idx;

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

        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
            System.out.println("===========================================");
        }
    }


    void bubbleSort(){
        for(int i = 0; i < dataDosen.length-1; i++){
            for(int j = 1; j < dataDosen.length-i; j++){
                if(dataDosen[j].usia < dataDosen[j-1].usia){
                    Dosen02 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j-1];
                    dataDosen[j-1] = tmp;
                }
            }
        }
    }

    void selectionSort(){
        for(int i = 0; i < dataDosen.length-1; i++){
            int idxMin = i;
            for(int j = i + 1; j < dataDosen.length; j++){
                if(dataDosen[idxMin].usia < dataDosen[j].usia){
                    idxMin = j;
                }
            } 
            Dosen02 tmp = dataDosen[idxMin];
            dataDosen[idxMin] = dataDosen[i];
            dataDosen[i] = tmp;
        }
    }
}
