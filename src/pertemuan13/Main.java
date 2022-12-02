package pertemuan13;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        int[] arrayOfInt = { 1, 2, 7, 2, 6, 8, 2, 1, 0 };
        for (int i : arrayOfInt) {
            System.out.print(i + " ");
        }

        System.out.println();
        Arrays.sort(arrayOfInt);
        for (int i : arrayOfInt) {
            System.out.print(i + " ");
        }

        System.out.println();

        String[] arrayOfString = { "A", "aaa", "alksjdfal", "woiuerwo", "aabd", "a" };
        Arrays.sort(arrayOfString);

        for (String string : arrayOfString) {
            System.out.print(string + " ");
        }
    }
}
