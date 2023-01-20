package OLD4;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        /*
        Найти максимальное значение между тремя числами a, b, c.
         */
        Scanner nomer = new Scanner(System.in);
        System.out.println("Введите 3 числа: ");
        int a = nomer.nextInt();
        int b = nomer.nextInt();
        int c = nomer.nextInt();
        if (a >= b) {
            System.out.println(a >= c ? a : c);
        }
         else if (a < b) {
            System.out.println(b >= c ? b : c);
        }
        else if (a == b && a == c) {
            System.out.println("Числа равны");
        }
    }
}
