package OLD3;

public class HomeWork5 {
    public static void main(String[] args) {
        /*
        Для каждого натурального числа в промежутке от M до N
        вывести все делители, кроме единицы и самого числа.
        Значения M и N вводятся с клавиатуры.
        Входные данные: 1 4
        Выходные данные: 2
        Входные данные: 2 8
        Выходные данные: 2 3 4
        Входные данные: 1 20
        Выходные данные: 2 3 4 5 6 7 8 9
         */

        int b = 1;
        int n = 20;
        for (; b <= n; b++) {
            System.out.print(b + ": ");
            for (int m = 2; m < b; m++) {
                if (b % m == 0) {
                    System.out.print(m + " ");
                }
            }
            System.out.println();
        }
    }
}