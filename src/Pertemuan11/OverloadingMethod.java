package Pertemuan11;

public class OverloadingMethod {
    public static void main(String[] args) {
        // PrintHai();
        // PrintHai("Azhary");
        // PrintHai(5);
        // PrintHai("Bambang", 18);
        // PrintHai();

        // int[] arrayOfInt = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        // for (int i = 0; i < arrayOfInt.length; i++) {
        // System.out.print(arrayOfInt[i] + " ");
        // }

        // System.out.println();

        // for (int integer : arrayOfInt) {
        // System.out.print(integer + " ");
        // }

        PrintHai(2);
        PrintHai(2, 3);
        PrintHai(2, 3, 4, 2, 1, 5, 67, 3, 1, 3, 54);
    }

    // public static void PrintHai() {
    // System.out.println("Haiiii");
    // }

    // PrintHai()
    public static void PrintHai() {
        PrintHai("Tanpa nama");
    }

    // PrintHai(String)
    public static void PrintHai(String name) {
        System.out.println("Haiiii " + name);
    }

    // PrintHai(int)
    // public static void PrintHai(int angka) {
    // System.out.println("Haiiii " + angka);
    // }

    // public static void PrintHai(int angka1, int angka2) {
    // System.out.println("Haiiii " + angka1 + " " + angka2);
    // }

    public static void PrintHai(double angka) {
        System.out.println("Haiiii " + angka);
    }

    // PrintHai(String, int)
    public static void PrintHai(String name, int umur) {
        System.out.println("Haiiii " + name + " umur dia " + umur);
    }

    public static void PrintHai(int... n) {
        for (int i : n) {
            System.out.print(i + " ");
        }
    }
}
