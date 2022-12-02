package Pertemuan12;

import java.util.Scanner;

// dilarang mengubah code apa pun yang sudah tersedia. Hanya boleh menambahkan code
// di tempat yang di awali // TODO:
public class BelahKetupatSpesial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tinggi;
        String kumpulanKarakter;

        tinggi = sc.nextInt();
        kumpulanKarakter = sc.next();
        sc.close();

        // TODO: panggil method gambarBelahKetupat dan ubahKeArrayOfChar untuk
        // menyelesaikan main method
        System.out.println(gambarBelahKetupat(tinggi, ubahKeArrayOfChar(kumpulanKarakter)));
    }

    // method ini menerima parameter bertipe String yang kemudian dikonversi menjadi
    // array of character (char[])
    public static char[] ubahKeArrayOfChar(String s) {
        // TODO: selesaikan method ini
        char[] output = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            output[i] = s.charAt(i);
        }

        return output;
    }

    // sesuai namanya, method ini mengembalikan (return) sebuah string panjang yang
    // menghasilkan sebuah bentuk belah ketupat yang tersusun dari kumpulan karakter
    // yang telah diinputkan
    public static String gambarBelahKetupat(int tinggi, char[] daftarKarakter) {
        // TODO: selesaikan method ini
        String output = "";

        for (int i = 1; i <= tinggi / 2 + 1; i++) {
            String currentLine = "";
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j <= i) {
                    currentLine += daftarKarakter[(j - 1) % daftarKarakter.length] + " ";
                } else {
                    currentLine += currentLine.charAt((2 * i - j - 1) * 2) + " ";
                }
            }
            for (int k = tinggi / 2 + 1 - i; k >= 1; k--) {
                output += "  ";
            }
            output += currentLine + "\n";
        }

        for (int i = tinggi / 2; i >= 1; i--) {
            String currentLine = "";
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j <= i) {
                    currentLine += daftarKarakter[(j - 1) % daftarKarakter.length] + " ";
                } else {
                    currentLine += currentLine.charAt((2 * i - j - 1) * 2) + " ";
                }
            }
            for (int k = tinggi / 2 - i; k >= 1; k--) {
                output += "  ";
            }
            output += "  " + currentLine + "\n";
        }

        return output.substring(0, output.length() - 1);
    }
}
