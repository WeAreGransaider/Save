package oldClassWork;

import java.util.Random;

public class main7 {
    public static void main(String[] args) {
        Random random = new Random();
        int arrain[][] = new int[50][20];
        for (int y = 0; y < arrain.length; y++) {
            for (int x = 0; x < arrain[y].length; x++) {
                arrain[y][x] = random.nextInt(90) + 10;
                System.out.print(arrain[y][x] + " ");
            }
            System.out.println();
        }
    }
}

