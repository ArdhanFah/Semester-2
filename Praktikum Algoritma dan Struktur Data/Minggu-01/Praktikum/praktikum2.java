import java.util.Scanner;

public class praktikum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.print("Masukkan NIM : ");
        long NIM = sc.nextLong();

        if(NIM < 100){
            sc.close();
            System.out.println("NIM harus diatas 100");                                     
            return;
        }

        NIM %= 100;
        if(NIM <= 10){
            NIM += 10;
        }
       
        System.out.println("-------------------------");
        System.out.println("N : " + NIM);
        for(int i = 1; i <= NIM; i++){
            if(i % 2 != 0){
                System.out.print("* ");
            }else{
                if(i != 6 && i != 10){
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
        sc.close();
    }
}
