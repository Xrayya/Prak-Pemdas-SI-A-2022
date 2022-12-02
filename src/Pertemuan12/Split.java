package Pertemuan12;

import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "Nama saya Hary umur ...";

        String[] words = s.split("y");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
