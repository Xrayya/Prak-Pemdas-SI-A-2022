package Pertemuan12;

public class Sorting {
    public static void main(String[] args) {
        int[] arrayOfInt = { 7, 3, 8, 1, 0 };

        for (int i = 0; i < arrayOfInt.length; i++) {
            for (int j = i + 1; j < arrayOfInt.length; j++) {
                if (arrayOfInt[i] > arrayOfInt[j]) {
                    int temp = arrayOfInt[i];
                    arrayOfInt[i] = arrayOfInt[j];
                    arrayOfInt[j] = temp;
                }
            }
        }

        for (int i : arrayOfInt) {
            System.out.println(i);
        }
    }
}
