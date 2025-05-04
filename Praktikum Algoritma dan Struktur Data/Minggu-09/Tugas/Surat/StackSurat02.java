package Surat;

public class StackSurat02 {
    int size;
    int top;
    Surat02[] stackSurat;

    public StackSurat02(int size){
        this.size = size;
        stackSurat = new Surat02[size];
        top = -1;
    }

    public boolean isFull(){
        if(top == size -1){
            return true;
        }else{
            return false;
        }
    } 

    public boolean isEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }

    public void push(Surat02 surat){
        if(!isFull()){
            stackSurat[++top] = surat;
        }else{
            System.out.println("Stack Penuh! tidak bisa menambah surat lagi.");
        }
    }

    public Surat02 pop(){
        if(!isEmpty()){
            Surat02 surat = stackSurat[top];
            top--;
            return surat;
        }else{
            return null;
        }
    }

    public Surat02 peek(){
        if(!isEmpty()){
            return stackSurat[top];
        }else{
            return null;
        }
    }

    public Surat02 cari(String nama){
        if(!isEmpty()){
            for(int i = top; i >=0 ; i--){
                if(stackSurat[i].namaMahasiswa.equalsIgnoreCase(nama)){
                    return stackSurat[i];
                }
            }
        }
        return null;
    }
}
