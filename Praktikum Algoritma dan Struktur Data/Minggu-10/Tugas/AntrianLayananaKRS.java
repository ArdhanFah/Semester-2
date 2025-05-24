package Tugas;

public class AntrianLayananaKRS {
    Mahasiswa[] data;
    int front,rear,size,max;
    int jumlahDilayani;

    public AntrianLayananaKRS(int max){
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    private boolean isFull(){
        if(size == max){
            return true;
        }else{
            return false;
        }
    }

    private boolean isEmpty(){
        if(size == 0){
            return true;
        }else{
            return false;
        }
    }

    public void tambahAntrian(Mahasiswa mhs){
        if(isFull()){
            System.out.println("Antrian Penuh, tidak dapat menambah mahasiswa");
            return;
        }else{
            if(jumlahDilayani < 30){
                rear = (rear + 1) % max;
                data[rear] = mhs;
                size++;
                System.out.println(mhs.nama + " berhasil masuk antrian");
            }else{
                System.out.println("DPA sudah menangani 30 mahasiswa");
            }
           
        }
    }

    public void panggilMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong");
        } else {
            if (size == 1) {
                // Hanya satu mahasiswa yang bisa dilayani
                Mahasiswa mhs = data[front];
                front = (front + 1) % max;
                size--;
                jumlahDilayani++;
                System.out.println(mhs.nama + " sudah dilayani");
            } else {
                // Layani dua mahasiswa
                for (int i = 0; i < 2; i++) {
                    Mahasiswa mhs = data[front];
                    front = (front + 1) % max;
                    size--;
                    jumlahDilayani++;
                    System.out.println(mhs.nama + " sudah dilayani");
                }
            }
        }
    }

    public void tampilAwal(){
        if(isEmpty()){
            System.out.println("Antrian Kosong");
        }else{
            if(size == 1){
                System.out.println("Mahasiswa paling depan:");
                data[front].tampilData();
            }else{
                System.out.println("Data terdepan: ");
                int idx = front;
                for (int i = 0; i < 2 && i < size; i++) {
                    Mahasiswa mhs = data[idx];
                    mhs.tampilData();
                    idx = (idx + 1) % max;
                }   
            }
        }
    }

    public void tampilAkhir(){
        if(!isEmpty()){
            System.out.println("Mahasiswa paling akhir:");
            data[rear].tampilData();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void tampilSemua(){
        if(!isEmpty()){
            System.out.println("Data Antrian:");
            for(int i = 0; i < size; i++){
                data[(front + i) % max].tampilData();
            }
        } else {
            System.out.println("Antrian kosong.");
        }
    }
    public void clear(){
        front = rear = -1;;
        size = 0;
        System.out.println("Antrian Kosong.");
    }   

    public void jumlahAntrian(){
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }

    public void jumlahDilayani(){
        System.out.println("Jumlah mahasiswa yang sudah dilayani: " + jumlahDilayani);
    }

    public void jumlahBelumDilayani(){
        System.out.println("Jumlah mahasiswa yang belum dilayani: " + size);
    }

}
