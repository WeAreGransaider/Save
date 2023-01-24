package org.example;

import java.util.Random;

public class Thread {
    public static void main(String[] args) {
        Random random = new Random();
        java.lang.Thread.currentThread().setName("Оснвоной");
        System.out.println(java.lang.Thread.currentThread().getName() + " поток запущен");
        int a[] = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(99) + 10;
            //System.out.print(a[i] + " ");
        }
        Runnable runMax = () -> {
            System.out.println(java.lang.Thread.currentThread().getName() + "дочерний поток MAX открыт");
            int buffer = a[0];
            for (int i = 0; i < a.length - 1; i++) {
                if (buffer <= a[i]) {
                    buffer = a[i];
                }
            }
            System.out.println(buffer);
            System.out.println(java.lang.Thread.currentThread().getName() + "дочерний поток MAX закрыт");
        };
        runMax.run();
        Runnable runMin = () -> {
            System.out.println(java.lang.Thread.currentThread().getName() + "дочерний поток MIN открыт");
            int buffer = a[0];
            for (int i = 0; i < a.length - 1; i++) {
                if (buffer >= a[i]) {
                    buffer = a[i];
                }
            }
            System.out.println(buffer);
            System.out.println(java.lang.Thread.currentThread().getName() + "дочерний поток MIN закрыт");
        };
        runMin.run();
        System.out.println(java.lang.Thread.currentThread().getName() + " поток закрыт");
    }
}
