package pertemuan6;

import java.util.Scanner;

public class MethodString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // boolean z = true;
        // switch (z) {
        // case true:
        // System.out.println("menu 1");
        // break;
        // case false:
        // System.out.println("menu 2");
        // break;
        // case "3":
        // System.out.println("menu 3");
        // default:
        // System.out.println("menunya gaada");
        // break;
        // }
        // int x = 10;
        // if (x > 5) {
        // if (x > 10) {
        // System.out.println(x + "lebih dari 10");
        // } else {
        // System.out.println(x + "lebih kecil sama dengan 10");
        // }
        // } else {
        // System.out.println(x + "kurang dari sama dengan 5");
        // }
        String x = "Aku suka makan bakso";
        int i = x.length();
        System.out.println(i);
        System.out.println(x.charAt(x.length() - 1));
        System.out.println(x.substring(10));
        System.out.println(x.toLowerCase());
        System.out.println(x.toUpperCase());
        System.out.println(x.indexOf("suka"));
        System.out.println(x.lastIndexOf("k"));
    }
}
