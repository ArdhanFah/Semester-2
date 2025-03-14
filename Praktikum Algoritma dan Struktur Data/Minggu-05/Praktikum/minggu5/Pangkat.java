package minggu5;

public class Pangkat {
    int nilai, pangkat;

    Pangkat(int n, int p){
        nilai = n;
        pangkat = p;
    }    

    int pangkatBF(){
        int hasil = 1;
        for(int i = 0; i < pangkat; i++){                         
            hasil *= nilai;
        }
        return hasil;
    }

    int pangaktDC(int a, int n){
        if(n == 1){
            return a;
        }else{
            if(n % 2 == 1){
                return a * (pangaktDC(a, n/2) * pangaktDC(a, n/2));
            }else{
                return pangaktDC(a, n/2) * pangaktDC(a, n/2);
            }
        }
    }
}
