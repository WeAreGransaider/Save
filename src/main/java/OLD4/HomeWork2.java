package OLD4;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        /*
        Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что:
        первый и второй члены последовательности равны единицам
        а каждый следующий — сумме двух предыдущих
        То есть числа Фибоначчи - это 1  1  2  3  5  8  13  21  34  55  89  и т.д.
         */
        Scanner Fib = new Scanner(System.in);
        System.out.print("Введите количество чисел из последовательности: ");
        int n = Fib.nextInt();
        int a = 1, b = 1;
        System.out.print(a + " " + b);
        int fib = 2, i = 2;
        while (i < n) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.print(" " + fib);
            i++;
        }
        }
    }

