package oldClassWork;

import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        Scanner diapazon = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = diapazon.nextInt();
        System.out.println("Введите второе число: ");
        int b = diapazon.nextInt();
        for (; a <= b; a++) {
            if (a % 2 != 0) {
                continue;    // Возращает в начало цикла
            }
            if (a == 50) {
                break;       // Прерывает цикл
            }
            System.out.println(a);
        }
    }
}
