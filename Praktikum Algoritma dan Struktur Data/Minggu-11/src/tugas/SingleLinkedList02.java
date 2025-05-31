package src.tugas;

public class SingleLinkedList02 {
    Node02 front, rear;
    int size, maxSize;

    public SingleLinkedList02(int maxSize){
        front = null;
        rear = null;
        size = 0;
        this.maxSize = maxSize;
    }

    public boolean isEmpty(){
        return front == null;
    }

    public boolean isFull(){
        return size >= maxSize;
    }
    
    public void enqueue(Mahasiswa02 input){
        if(size < maxSize){
            Node02 newNode = new Node02(input);
           if (isEmpty()) {
                front = rear = newNode;
            }else {
                rear.next = newNode;
                rear = newNode;
            }
            size++;
            System.out.println("Mahasiswa " + input.nama + " telah ditambahkan ke antrian.");
        }
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Antrian kosong, tidak ada data yang bisa dihapus.");
            return;
        }
        System.out.println("Memanggil: ");
        front.data.print();
        front = front.next;
        if(front == null){
            rear = null; 
        }
        size--;
        System.out.println("Data mahasiswa telah dihapus dari antrian.");
    }

    public void print(){
        if(!isEmpty()){
            Node02 tmp = front;
            System.out.println("Data Mahasiswa: ");
            while(tmp != null){
                tmp.data.print();
                tmp = tmp.next;
            }
            System.out.println();
        }else{
            System.out.println("Data kosong");
        }
    }

    public void peekAkhir(){
        if(isEmpty()){
            System.out.println("Antrian kosong, tidak ada data yang bisa ditampilkan.");
            return;
        }else {
            System.out.println("Data mahasiswa terakhir: ");
            rear.data.print();
        }
    }

    public void peekDepan(){
        if(isEmpty()){
            System.out.println("Antrian kosong, tidak ada data yang bisa ditampilkan.");
            return;
        }else{
            System.out.println("Data antrian terdepan : ");
            front.data.print();
        }
    }

    public void antre(){
        System.out.println("Jumlah Mahasiswa Mengantri: " + size);; 
    }
}
