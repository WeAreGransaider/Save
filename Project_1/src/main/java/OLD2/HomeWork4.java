package OLD2;

public class HomeWork4 {
    public static void main(String[] args) {
        /*
        Вводится натуральное число.
        Найти сумму четных чисел, до введенного.
        Входные данные: 1
        Выходные данные: 0
        Входные данные: 6
        Выходные данные: 6
        Входные данные: 15
        Выходные данные: 56
         */
        int a = 15;
        int v = 0;
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                v = v + i;
                System.out.println(v);
            }
        }
    }
}
