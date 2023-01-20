package StudentWork;

import java.util.Random;
import java.util.Scanner;

public class StudentHomeWork {
    public static void main(String[] args) {
        //String name = in.nextLine();
        //int a = month.nextInt();
        Random random = new Random();
        Scanner console = new Scanner(System.in);

        Student arrayStudent[] = new Student[2];
        for (int i = 0; i < arrayStudent.length; i++) {
            System.out.println();
            System.out.println("Введите id, имя и фималию: ");
            Student chel = new Student(console.nextLine(), console.nextLine(), Integer.parseInt(console.nextLine()));
            arrayStudent[i] = chel;
            System.out.println(chel.info());
            System.out.println("Оценки: ");
            chel.estimation();
            chel.printMarks();
            System.out.println();
            System.out.println("Среднея оценка: " + chel.chelItogMark());
            System.out.println("Среднея оценка: " + arrayStudent[i].chelItogMark());
        }
        System.out.println();
    }



}

