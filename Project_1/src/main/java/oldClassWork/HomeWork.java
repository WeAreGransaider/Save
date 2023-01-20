package oldClassWork;

import java.util.Random;

import static java.lang.Math.abs;

public class HomeWork {
    public static void main(String[] args) {
        homeWork3();
        homeWork3();
    }

    public static void homeWork1() {
        /*
 Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99].
 Вывести массив на экран.
         */
        Random random = new Random();
        int array[][] = new int[8][5];
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                array[x][y] = random.nextInt(99) + 10;
                System.out.print(array[x][y] + " ");
            }
            System.out.println();
        }
    }

    public static void homeWork2() {
        /*
Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99].
Вывести массив на экран.
После на отдельной строке вывести на экран значение максимального элемента этого массива (его индекс не имеет значения)
         */
        Random random = new Random();
        int array[][] = new int[5][8];

        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                array[x][y] = random.nextInt(198) - 99;
                System.out.print(array[x][y] + " ");
            }
            System.out.println();
        }
        int max = array[0][0];
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length - 1; y++) {
                if (max < array[x][y + 1]) {
                    max = array[x][y + 1];
                }
            }
        }
        System.out.println(max);
    }

    public static void homeWork3() {
        /*
Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5].
Вывести массив на экран. Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов.
Если таких строк несколько, то вывести индекс первой встретившейся из них.
         */
        Random random = new Random();
        int array[][] = new int[7][4];
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                array[x][y] = random.nextInt(10) - 5;
                System.out.print(array[x][y] + " ");
            }
            System.out.println();
        }

        int torrent;
        int max = 0;
        int index = 0;
        for (int x = 0; x < array.length; x++) {
            torrent = array[x][0];
            for (int y = 0; y < array[x].length - 1; y++) {
                torrent = torrent * array[x][y + 1];
                if (torrent < 0) {
                    torrent = torrent * -1;
                }
            }
            if (max < torrent) {
                max = torrent;
                index = x;
            }
            System.out.println(torrent);
        }
        System.out.println("Максимальное значение = " + max);
        System.out.println(index);
    }
}
