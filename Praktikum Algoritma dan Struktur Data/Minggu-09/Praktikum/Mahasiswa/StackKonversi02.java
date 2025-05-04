package Mahasiswa;

public class StackKonversi02 {
    public int[] tumpukanBiner;
    public int top;
    public int size;

    public StackKonversi02(){
        this.size = 32;
        tumpukanBiner = new int[size];
        top = -1;
    }

    public boolean isEmpty(){
        return top == - 1;
    }

    public boolean isFull(){
        return top == size -1;
    }

    public void push(int data){
        if(isFull()){
            System.out.println("Stack penuh");
        }else{
            tumpukanBiner[++top] = data;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack kosong");
            return -1;
        }else{
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }
}
