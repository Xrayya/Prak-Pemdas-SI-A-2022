package pertemuan6;

import java.util.Scanner;

public class SolveUbahFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte hour, minutes, second;
        boolean pm = false;

        String input = sc.next();
        sc.close();

        hour = Byte.parseByte(input.substring(0, input.indexOf(":")));
        minutes = Byte.parseByte(input.substring(input.indexOf(":") + 1, input.lastIndexOf(":")));
        second = Byte.parseByte(input.substring(input.lastIndexOf(":") + 1));

        // byte hour = Byte.parseByte(input.substring(0, 2));
        // byte minutes = Byte.parseByte(input.substring(3, 5));
        // byte second = Byte.parseByte(input.substring(6));

        if (hour >= 0 && hour < 24 && minutes >= 0 && minutes < 60 && second >= 0 && second < 60) {
            if (hour == 0) {
                hour = 12;
            } else if (hour == 12) {
                pm = true;
            } else if (hour > 12) {
                hour -= 12;
                pm = true;
            }
            System.out.printf("%02d:%02d:%02d %s", hour, minutes, second, pm ? "PM" : "AM");
        } else {
            System.out.println("format anda salah");
        }

    }
}
