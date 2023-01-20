package OLD6;

import oldClassWork.main6;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        homeWork2();

    }

    public static void homeWork1() {
        /*
        Найти в массиве самую длинную последовательность,
состоящую из одинаковых элементов.
Вывести на экран количество элементов
самой длиной последовательности
Входные данные: 5 8 7 9 6 6 6 2
Входные данные: 3
Входные данные: 0 0 0 0 0 9 0 5 4 8 1
Выходные данные: 5
Входные данные: 0 0 0 0 0 0 0 0 0 0 0 0
Выходные данные: 12
         */

        int array[] = {5, 8, 7, 9, 6, 6, 6, 2};
        int s = 1;
        int max = 1;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                s++;
            } else {
                if (s > max) {
                    max = s;
                }
                s = 1;
            }
        }
        System.out.println(max);
        System.out.println();
    }

    public static void homeWork2() {
        /*
        Дан массив, найти второе максимально число.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Диапазон множества = ");
        int sizeArray = scanner.nextInt();
        int arrey[] = main6.newArray(sizeArray);
        arrey = sortArray(arrey);
        for (int b = arrey.length - 1; b > 0; b--) {
            if (arrey[b] > arrey[b - 1]) {
                System.out.println(arrey[b - 1]);
                break;
            }
        }
    }


    public static int[] sortArray(int arrey[]) {
        int torrent = 0;
        for (int v = 0; v < arrey.length; v++) {
            for (int j = 0; j < arrey.length - 1 - v; j++) {
                if (arrey[j] > arrey[j + 1]) {
                    torrent = arrey[j];
                    arrey[j] = arrey[j + 1];
                    arrey[j + 1] = torrent;
                }
            }
            main6.massivePrint(arrey);
        }
        return arrey;
    }
}
