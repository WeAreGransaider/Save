package oldClassWork;

import java.util.Random;

public class ninSerth {
    public static void main(String[] args) {
        int array[] = createArray(50);
        printArray(array);
        array = sortArray(array);
        printArray(array);
        searchArray(array, 32);
    }

    public static int[] createArray(int size) {
        Random random = new Random();
        int array[] = new int[size];
        int y = 0;
        for (; y < array.length - 1; y++) {
            array[y] = random.nextInt(99) + 1;
        }
        array[0] = 31;
        return array;

    }

    public static int[] sortArray(int array[]) {
        int torrent = 0;
        for (int y = 0; y < array.length; y++) {
            for (int x = 0; x < array.length - 1 - y; x++) {
                if (array[x] > array[x + 1]) {
                    torrent = array[x + 1];
                    array[x + 1] = array[x];
                    array[x] = torrent;
                }
            }
        }
        return array;
    }

    public static void printArray(int array[]) {
        for (int x = 0; x < array.length; x++) {
            System.out.print(array[x] + " ");
        }
        System.out.println();
    }

    public static void searchArray(int array[], int y) {
        int size = array.length;
        int start = 0;
        while (true) {
            if (array[start + size / 2] == y) {
                System.out.println(y);
                break;
            } else if (size == 1) {
                System.out.println("Ответа нет");
                break;
            } else if (array[start + size / 2] > y) {
                size = size / 2;
            } else if (array[start + size / 2] < y) {
                start = start + size / 2;
                size = size / 2;
            }
        }
    }
}

