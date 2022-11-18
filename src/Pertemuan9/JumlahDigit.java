package Pertemuan9;

import java.util.Scanner;

public class JumlahDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long input, oddSum, evenSum;

        input = sc.nextLong();
        sc.close();

        oddSum = 0;
        evenSum = 0;
        while (input > 0) {
            oddSum += input % 10;
            input /= 10;

            evenSum += input % 10;
            input /= 10;
        }

        System.out.printf("%d %d", oddSum, evenSum);
    }
}
