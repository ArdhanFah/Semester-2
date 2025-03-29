package Praktikum;
public class MahasiswaBerprestasi02 {
    int idx;
    Mahasiswa02 listMhs[];
    MahasiswaBerprestasi02(int jumMhs){
        listMhs = new Mahasiswa02[jumMhs];
    }

    void tambah(Mahasiswa02 m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data Sudah Penuh!!");
        }
    }

    void tampil(){
        int ind = 1;
        for(Mahasiswa02 mhs : listMhs){
            System.out.printf("Data Mahasiswa ke-%s %n", ind);
            mhs.tampilInformasi();
            System.out.println("---------------------------------");
            ind++;
        }
    }

    int sequentialSearch(double cari){
        int posisi = -1;
        for(int i = 0; i < listMhs.length; i++){
            if(listMhs[i].ipk == cari){
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos){
        if(pos != -1){
            System.out.printf("Data Mahasiswa dengan IPK %s ditemukan pada indeks %s %n", x, pos);
        }else{
            System.out.printf("Data %s tidak ditemukan %n", x);
        }
    }

    void tampilDataSearch(double x, int pos){
        if(pos != -1){
            System.out.printf("nim\t: %s %n", listMhs[pos].nim);
            System.out.printf("nama\t: %s %n", listMhs[pos].nama);
            System.out.printf("kelas\t: %s %n", listMhs[pos].kelas);
            System.out.printf("ipk\t: %s %n",x);
        }else{
            System.out.printf("Data Mahasiswa dengan IPK %s tidak ditemukan %n", x);
        }
    }

    int findBinarySearch(double cari, int left, int right){
        int mid;
        if(right <= left){
            mid = (right + left) / 2;
            if(listMhs[mid].ipk  == cari){
                return mid;
            }else if(listMhs[mid].ipk < cari){   //ubah > menjadi <
                return findBinarySearch(cari, left, mid - 1);
            }else{
                return findBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
}
