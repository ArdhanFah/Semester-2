package PraktikumDua;

public class AntrianLayanan {
    Mahasiswa[] data;
    int front,rear,size,max;

    public AntrianLayanan(int max){
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
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil masuk antrian");
        }
    }

    
    public Mahasiswa layaniMahasiswa(){
        if(isEmpty()){
            System.out.println("Antrian Kosong");
            return null;
        }else{
            Mahasiswa mhs = data[front];
            front = (front + 1) % max;
            size--;
            System.out.println(mhs.nama + " berhasil masuk antrian");
            return mhs;
        }
    }

    public void lihatTerdepan(){
        if(isEmpty()){
            System.out.println("Antrian Kosong");
        }else{
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilData();
        }
    }

    public void tampilSemua(){
        if(isEmpty()){
            System.out.println("Antrian Kosong");
            return;
        }else{
            System.out.println("Daftar Mahasiswa dalam Antrian");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            for(int i = 0; i < size; i++){
                int index = (front + i) % max;
                System.out.print((i+1) + ". ");
                data[index].tampilData();
            }
        }
    }

    public void lihatAkhir(){
        if(isEmpty()){
            System.out.println("Antrian Kosong");
        }else{
            System.out.println("Mahasiswa Terakhir: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilData();
        }
    }

    public int getJumlahAntrian(){
        return size;
    }

}
