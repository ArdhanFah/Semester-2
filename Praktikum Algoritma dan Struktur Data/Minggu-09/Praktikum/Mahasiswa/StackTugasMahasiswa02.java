package Mahasiswa;

public class StackTugasMahasiswa02 {
  Mahasiswa02[] stack;
  int top;
  int size;

  public StackTugasMahasiswa02(int size){
    this.size = size;
    stack = new Mahasiswa02[size];
    top = -1;
  }

  public boolean isFull(){
    if(top == size - 1){ 
       return true;
    } else {
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

  public void push(Mahasiswa02 mhs){
    if(!isFull()){
      stack[++top] = mhs;
    }else{
      System.out.println("Stack Penuh! tidak bisa menambah tugas lagi.");
    }
  }

  public Mahasiswa02 pop(){
    if(!isEmpty()){
      Mahasiswa02 m = stack[top];
      top--;
      return m;
    }else{
      System.out.println("Stack kosong! Tidak ada tugas untuk dinilai");
      return null;
    }
  }

  public Mahasiswa02 peek(){
    if(!isEmpty()){
      return stack[top];
    }else{
      System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
      return null;
    }
  }

  public void print(){
    System.out.println("+------------+---------------+--------------+");
    System.out.printf("%-15s %-15s %-15s %n", "Nama", "Nim", "Kelas");
    System.out.println("+------------+---------------+--------------+");

    for(int i = top; i >= 0; i--){
      System.out.printf("%-15s %-15s %-15s %n", stack[i].nama, stack[i].nim, stack[i].kelas);
    }
    System.out.println(" ");
  }

  public void bottom(){
    if(!isEmpty()){
      System.out.println("Tugas pertama dikumpulkan oleh " + stack[0].nama);
    }else{
      System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
    }
  }

  public int hitungTugas(){
    return top + 1;
  }

  public String konversiDesimalKeBiner(int nilai){
    StackKonversi02 stack = new StackKonversi02();
    while(nilai != 0){   // perbedaan dengan sebelumnya adalah dalam menangangi nilai negative
      int sisa = nilai % 2;
      stack.push(sisa);
      nilai = nilai / 2;
    }

    String biner = new String();
    while (!stack.isEmpty()) {
      biner += stack.pop();
    }
    return biner;
  }
}
