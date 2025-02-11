public class praktikum4 {
    public static void main(String[] args) {
        int stok[][] = {{10,5,15,7},
            {6,11,9,12},
            {2,10,10,5},
            {5,7,12,9}};
        int harga[] = {75000, 50000, 60000, 10000};
        
        int[] penghasilan = hasilPendapatan(stok, harga);
        int[][] stokCabang4 = penguranganStok(stok);
        tampilHasil(penghasilan);
        stokStore4(stokCabang4);
    }

    private static int[] hasilPendapatan(int stok[][], int harga[]){
        int hasil[] = new int[stok[0].length];
        
        for(int i = 0; i < stok.length; i++){
            for(int j = 0; j < stok[i].length; j++){
                hasil[i] += stok[i][j] * harga[j];
            }
        }
        return hasil;
    }

    private static int[][] penguranganStok(int stok[][]){
        int stokMati[] = {1, 2, 0, 5};

        for(int i = 0; i < stok.length; i++){
            for(int j = 0; j < stok[i].length; j++){
                if(i == stok.length - 1){
                    stok[i][j] -= stokMati[j];
                }
            }
        }
        return stok;
    }

    private static void stokStore4(int[][] stokCabang4){
        String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};

        for(int i = 0; i < stokCabang4.length; i++){
            if(i == stokCabang4.length - 1){
                System.out.println("-----------------------------");
                System.out.printf("Sisa Stok Royal Garden %d %n", (i+1));
                System.out.println("-----------------------------");
                for(int j = 0; j < stokCabang4[i].length; j++){
                    System.out.printf("%-10s: %-2s %n", namaBunga[j], stokCabang4[i][j]);                 
                } 
            }
        }
    }

    private static void tampilHasil(int[] pendapatan){
        System.out.println("-----------------------------");
        System.out.println("Keuntungan Setiap Store");
        System.out.println("-----------------------------");
        for(int i = 0; i < pendapatan.length; i++){
            System.out.printf("Royal garden %d: Rp.%d %n", (i+1), pendapatan[i]);
        }
    }
}
