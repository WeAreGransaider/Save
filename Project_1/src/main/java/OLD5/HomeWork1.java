package OLD5;

import java.util.Random;
import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        /*
1. Первый положительный элемент массива
Найти значение первого положительного элемента массива.
Входные данные: int a[8] = {2, -5, 6, -7, -6, 8, 7, 9}
Выходные данные: 2
Входные данные: int a[3] = {-8, -2, 5}
Выходные данные: 5
Входные данные: int a[534] = {0, 0, 0, 0 ... 0, 0, 0}
Выходные данные: 0
         */

        int a[] = {0, 0, 0, 0, 0, 0};
        for (int i = 0;i< a.length;i++) {
            if (a[i] >= 0) {
                System.out.println(a[i]);
                break;
            }

        }


    }
}
