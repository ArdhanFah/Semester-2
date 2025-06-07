package src.Percobaan;

public class DoubleLinkedList02 {
    Node02 head;
    Node02 tail;
    
    public DoubleLinkedList02() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa02 data){
        Node02 newNode = new Node02(data);
        if(isEmpty()){
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa02 data){
        Node02 newNode = new Node02(data);
        if(isEmpty()){
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa02 data){
        Node02 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if(current == null){
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node02 newNode = new Node02(data);
        if(current == tail){
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Node berhasil disisipkan seteah NIM" + keyNim);
    }

    public void add(int index, Mahasiswa02 data) {
        if (index < 0) {
            System.out.println("Index tidak valid.");
            return;
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        Node02 current = head;
        int count = 0;

        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Index melebihi jumlah node dalam list.");
            return;
        }

        Node02 newNode = new Node02(data);
        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null) {
            current.next.prev = newNode;
        } else {
            tail = newNode; 
        }
        current.next = newNode;
    }


    public void print(){
       if(isEmpty()){
           System.out.println("List kosong.");
           return;
       }else{
            Node02 current = head;
            while(current != null){
                current.data.tampil();
                current = current.next;
            }
        }
    }

    public void removeFirst(){
        if(isEmpty()){
            System.out.println("List kosong, tidak dapat menghapus.");
            return;
        }
        if(head == tail){
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast(){
        if(isEmpty()){
            System.out.println("List kosong, tidak dapat menghapus.");
            return;
        }
        if(head == tail){
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void removeAfter(String key){
        Node02 current = head;

        while(current != null && !current.data.nim.equals(key)){
            current = current.next;
        }

        if(current == null){
            System.out.println("Node dengan NIM " + key + " tidak ditemukan.");
            return;
        }

        if(current.next == null){
            System.out.println("Tidak ada node setelah NIM " + key + ".");
            return;
        }   

        Node02 nodeToDelete = current.next;
        if(nodeToDelete == tail){
            tail = current;
            current.next = null;
        }else{
            current.next = nodeToDelete.next;
            nodeToDelete.next.prev = current;
        }
    }

    public void remove(int index){
        if(isEmpty()){
            System.out.println("List kosong, tidak dapat menghapus.");
            return;
        }
        if(index < 0){
            System.out.println("Index tidak valid.");
            return;
        }

        Node02 current = head;
        int count = 0;

        while(current != null && count < index){
            current = current.next;
            count++;
        }

        if(current == null){
            System.out.println("Index melebihi jumlah node dalam list.");
            return;
        }

        String deleteData = current.data.nama;

        if(current == head){
            removeFirst();
        }else if(current == tail){
            removeLast();
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah: " + deleteData);
    }

    public Mahasiswa02 getFirst(){
        if(isEmpty()){
            System.out.println("List kosong, tidak ada data yang bisa diambil.");
            return null;
        }
        return head.data;
    }

    public Mahasiswa02 getLast(){
        if(isEmpty()){
            System.out.println("List kosong, tidak ada data yang bisa diambil.");
            return null;
        }
        return tail.data;
    }

     public Mahasiswa02 getIndex(int index){
        if(isEmpty()){
            System.out.println("List kosong, tidak ada data yang bisa diambil.");
            return null;
        }
        if(index < 0){
            System.out.println("Index tidak valid.");
            return null;
        }

        Node02 current = head;
        int count = 0;
        Mahasiswa02 found = null;

        while(current != null && count < index){
            found = current.data;
            count++;
        }

        return found;
    }


    public Node02 search(String key){
        Node02 current = head;
        while(current!= null){
            if(current.data.nim.equals(key)){
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public int size(){
        int count = 0;
        Node02 current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }
}
