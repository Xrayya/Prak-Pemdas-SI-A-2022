package Pertemuan12;

import java.util.Scanner;

public class MazeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height, width;
        String[][] maze;
        int[] start = new int[2];
        int[] end = new int[2];

        height = sc.nextInt();
        width = sc.nextInt();
        sc.nextLine();

        maze = new String[height][width];

        for (int i = 0; i < height; i++) {
            String line = sc.nextLine();
            if (line.contains("A")) {
                start[0] = i;
                start[1] = line.indexOf("A");
            }

            if (line.contains("A")) {
                end[0] = i;
                end[1] = line.indexOf("B");
            }
            maze[i] = line.split(" ");
            
        }

        int[] currentPos = {start[0], start[1]};
        while (currentPos[0] != end[0] && currentPos[1] != currentPos[1]) {
            if (maze[currentPos[0]][currentPos[1]+1].equals("O")) {
                currentPos[1] += 1;
            }
        }
    }
}
