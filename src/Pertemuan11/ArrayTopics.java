package Pertemuan11;

public class ArrayTopics {
    public static void main(String[] args) throws Exception {
        String[] arrayStrings = new String[10];
        int[] a = { 1, 2, 3, 4, 5, 6, 7 };
        for (int i = 0; i < arrayStrings.length; i++) {
        if(i%2==0){
        arrayStrings[i] = "genap";
        }else{
        arrayStrings[i] = "ganjil";
        }
        }
        for (int i = 0; i < arrayStrings.length; i++) {
        System.out.println(arrayStrings[i]);
        }
        int[][] arrayInt2D = new int[2][2];
        int[][] arrayInt2DLangsung = { { 1, 2, 3 }, { 3, 2, 1 } };
        arrayInt2D[0][0] = 1;
        arrayInt2D[0][1] = 2;
        arrayInt2D[1][0] = 3;
        arrayInt2D[1][1] = 4;
        for (int i = 0; i < arrayInt2D.length; i++) {
            for (int j = 0; j < arrayInt2D[i].length; j++) {
                System.out.print(arrayInt2D[i][j] + " ");
            }
            System.out.println();
        }
        int x = 2;
        int y = 3;
        x = y;
        System.out.println(x);
        int [] b = a;
        b[0] = 10;
        System.out.println(a);
        System.out.println(b);

        printerArray(a);
        printerArray(b);
        kaliDua(a);
        printerArray(a);
        int angka1 = 20;
        ubahInt(angka1);
        System.out.println(angka1);
    }

    static void ubahInt (int a){
        a= a*2;
    }

    static void kaliDua(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }
    }

    static void printerArray(int [] array){
        for (int i : array) {
            System.out.print(i +" ");
        }
        System.out.println();
    }
}
