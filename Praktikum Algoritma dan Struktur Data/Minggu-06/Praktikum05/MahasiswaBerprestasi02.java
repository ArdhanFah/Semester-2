public class MahasiswaBerprestasi02 {
    int jumMhs;
    int idx;

    Mahasiswa02 list[];
    MahasiswaBerprestasi02(int jumMhs){
        this.list = new Mahasiswa02[jumMhs];
    }

    void tambah(Mahasiswa02 m){
        if(idx < list.length){
            list[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil(){
        for(Mahasiswa02 m : list){
            m.tampilInformasi();
            System.out.println("================================");
        }
    }

    void bubbleSort(){
        for(int i = 0; i < list.length-1; i++){
            for(int j = 1; j < list.length-i; j++){
                if(list[j].ipk > list[j-1].ipk){
                    Mahasiswa02 tmp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = tmp;
                }
            }
        }
    }

    void selectionSort(){
        for(int i = 0; i < list.length-1; i++){
            int idxMin = i;
            for(int j = i + 1; j < list.length; j++){
                if(list[j].ipk < list[idxMin].ipk){
                    idxMin = j;
                }
            }
            Mahasiswa02 tmp = list[idxMin];
            list[idxMin] = list[i];
            list[i] = tmp;
        }
    }

    void insetionSort(){
        for(int i = 1; i < list.length; i++){
            Mahasiswa02 temp = list[i];
            int j = i;
            while (j > 0 && list[j-1].ipk < temp.ipk) {
                list[j] = list[j-1];
                j--;
            }
            list[j] = temp;
        }
    }
}
