package OLD4;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        /*
        Необходимо написать программу, которая бы вывела в консоль звездочки вот таким образом, как указано ниже.
        * * * * *
        * * * * *
        * * * * *
        */
        Scanner stars = new Scanner(System.in);
        System.out.print("Введите знак: ");
        String c = stars.nextLine();   //Для работы должен быть первым
        System.out.print("Введите количество звездочек: ");
        int a = stars.nextInt();
        System.out.print("Введите количество строк: ");
        int b = stars.nextInt();

        for (int v = 1; v <= b; v++) {
            for (int i = 1; i <= a; i++) {
                System.out.print(c + " ");
            }
            System.out.println(" ");
        }
    }
}
