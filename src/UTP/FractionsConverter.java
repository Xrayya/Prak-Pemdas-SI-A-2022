package UTP;

import java.util.Scanner;

public class FractionsConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long nominator, denominator, integer;

        String input = sc.next();
        sc.close();

        nominator = Long.parseLong(input.substring(0, input.indexOf("/")));
        denominator = Long.parseLong(input.substring(input.indexOf("/") + 1));
        integer = nominator / denominator;

        System.out.printf("%-25s : %s\n", "Bentuk pecahan murni", String.format("%d/%d", nominator, denominator));
        System.out.printf("%-25s : %s\n", "Bentuk pecahan campuran", integer == 0 ? "-"
                : String.format("%d %d/%d", integer, Math.abs(nominator % denominator), denominator));
        System.out.printf("%-25s : %s\n", "Bentuk desimal", String.format("%.2f", (double) nominator / denominator));
        System.out.printf("%-25s : %s\n", "Bentuk persen",
                String.format("%.1f%%", (double) nominator / denominator * 100));
    }
}
