package pertemuan6;

import java.util.Scanner;

public class SolveKantongKering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int batasPengeluaran, biaya, x1, y1, x2, y2, totalBiaya;

        batasPengeluaran = sc.nextInt();
        biaya = sc.nextInt();
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        sc.close();

        double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        totalBiaya = biaya + (int) Math.round(dist * 15000);

        System.out.printf("%-20s: %.2f km\n", "Jarak", dist);
        System.out.printf("%-20s: Rp %,d\n", "Total biaya", totalBiaya);
        System.out.printf("%-20s: Rp %,d\n", "Batas pengeluaran", batasPengeluaran);
        System.out.println();
        if (totalBiaya == batasPengeluaran) {
            System.out.println("Sisa uangmu akan menjadi Rp 0, terserah padamu.");
        } else if (totalBiaya < batasPengeluaran) {
            System.out.println("Masih ada sisa uang, gas pesen ojol!");
        } else {
            System.out.println("Uangmu tidak cukup, kamu harus jalan kaki!");
        }
    }
}
