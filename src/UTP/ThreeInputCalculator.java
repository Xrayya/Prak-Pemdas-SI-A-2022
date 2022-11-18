package UTP;

import java.util.Scanner;

public class ThreeInputCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // var1 and var2, var3 max value is 2 * 10^9
        double var1, var2, var3, result = 1;
        char op1, op2;
        byte w1 = 0, w2 = 0;

        var1 = sc.nextDouble();
        op1 = sc.next().charAt(0);
        var2 = sc.nextDouble();
        op2 = sc.next().charAt(0);
        var3 = sc.nextDouble();

        sc.close();

        // weighting
        switch (op1) {
            case '+':
            case '-':
                w1 = 1;
                break;
            case '*':
            case '/':
                w1 = 2;
            case '^':
                w1 = 3;
        }

        switch (op2) {
            case '+':
            case '-':
                w2 = 1;
                break;
            case '*':
            case '/':
                w2 = 2;
            case '^':
                w2 = 3;
        }

        // if second op has higher priority
        if (w2 > w1) {
            switch (op2) {
                case '^':
                    result = Math.pow(var2, var3);
                    break;
                case '*':
                    result = var2 * var3;
                    break;
                case '/':
                    result = var2 / var3;
                    break;
                case '+':
                    result = var2 + var3;
                    break;
                case '-':
                    result = var2 - var3;
                    break;
            }

            switch (op1) {
                case '*':
                    result = var1 * result;
                    break;
                case '/':
                    result = var1 / result;
                    break;
                case '+':
                    result = var1 + result;
                    break;
                case '-':
                    result = var1 - result;
                    break;
            }

            // if the first op has higher or same priority
        } else {
            switch (op1) {
                case '^':
                    result = Math.pow(var1, var2);
                    break;
                case '*':
                    result = var1 * var2;
                    break;
                case '/':
                    result = var1 / var2;
                    break;
                case '+':
                    result = var1 + var2;
                    break;
                case '-':
                    result = var1 - var2;
                    break;
            }

            switch (op2) {
                case '^':
                    result = Math.pow(result, var3);
                    break;
                case '*':
                    result *= var3;
                    break;
                case '/':
                    result /= var3;
                    break;
                case '+':
                    result += var3;
                    break;
                case '-':
                    result -= var3;
                    break;
            }

            if (Math.floor(result) == result) {
                System.out.printf("%.0f", result);
            } else {
                System.out.printf("%.2f", result);
            }
        }
    }
}
