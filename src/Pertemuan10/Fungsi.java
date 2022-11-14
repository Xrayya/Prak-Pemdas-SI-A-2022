package Pertemuan10;

public class Fungsi {

    public static void main(String[] args) {
        printHai();
    }

    static void printHai() {
        System.out.println("HAII");
    }

    static void printHai(String nama, String kelas) {
        System.out.println("HAII " + nama + kelas);
    }

    static int penghitungLuasSegiEmpat(double sisi) {
        return (int) (sisi * sisi);
    }

    // public static int fibbonaci(int n) {
    // if (n == 1 || n == 2) {
    // return 1;
    // }
    //
    // return fibbonaci(n - 1) + fibbonaci(n - 2);
    // }

    static int fibbonaci(int n, int sukuPertama, int sukuKedua) {
        if (n == 1) {
            return sukuPertama;
        }
        if (n == 2) {
            return sukuKedua;
        }

        return fibbonaci(n - 1, sukuPertama, sukuKedua) + fibbonaci(n - 2,
                sukuPertama, sukuKedua);
    }
}
