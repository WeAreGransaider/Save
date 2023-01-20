package OLD4;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        /*
        Разработать программу определения числа дней в месяце, если он задан номером от 1 до 12.
         */
        Scanner month = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int a = month.nextInt();
        // Название месяца
        if (a == 1) {
            System.out.println("Январь");
        }
        else if (a == 2) {
            System.out.println("Февраль");
        }
        else if (a == 3) {
            System.out.println("Март");
        }
        else if (a == 4) {
            System.out.println("Апрель");
        }
        else if (a == 5) {
            System.out.println("Май");
        }
        else if (a == 6) {
            System.out.println("Июнь");
        }
        else if (a == 7) {
            System.out.println("Июль");
        }
        else if (a == 8) {
            System.out.println("Август");
        }
        else if (a == 9) {
            System.out.println("Сентябрь");
        }
        else if (a == 10) {
            System.out.println("Октябрь");
        }
        else if (a == 11) {
            System.out.println("Ноябрь");
        }
        else if (a == 12) {
            System.out.println("Декабрь");
        }
        //Число дней в месяце

        if (a == 2) {
            System.out.println("В месяце 28 дней");
        }
        else if (a == 2 || a == 4 || a == 6 || a == 9) {
            System.out.println("В месяце 30 дней");
        }
        else {
            System.out.println("В месяце 31 день");
        }
    }
}
