public class Sorting02Main {
    public static void main(String[] args) {
        int[] a = {20, 10, 2, 7, 12};
        int[] b = {30, 20, 2, 8, 14};
        int[] c = {40, 10, 4, 9, 3};
        
        Sorting02 dataurut1 = new Sorting02(a, a.length);
        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();

        Sorting02 dataurut2 = new Sorting02(b, b.length);
        System.out.println("Data awal 2");
        dataurut2.tampil();
        dataurut2.SelectionSort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataurut2.tampil();

        Sorting02 dataurut3 = new Sorting02(c,c.length);
        dataurut3.tampil();
        dataurut3.insertionSort();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC)");
        dataurut3.tampil();
    } 
}
