package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Random;

public class TestList {
    public static void main(String[] args) {
        Random random = new Random();
        MyLinkedList<String/*Integer*/> test1 = new MyLinkedList<>();
//        int a = 1000000;
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < a; i++) {
//            //  test1.add(String.valueOf(random.nextLong(50)));
//            test1.add(i);
//        }
//        long finish = System.currentTimeMillis();
//        long itog = finish - start;
//        System.out.println(itog);
        test1.add("Ячейка1");
        test1.add("Ячейка2");
        test1.add("Ячейка3");
        test1.add("Ячейка4");
        test1.print();
        test1.insert("Test",0);
//        test1.remove(0);
        test1.print();
//        CompMyLinkedList comparator = new CompMyLinkedList();
//        System.out.println();
//        long start1 = System.currentTimeMillis();
//        //test1.sort(comparator);
//        System.out.println(test1.get(999999));
//        long finish1 = System.currentTimeMillis();
//        long itog1 = finish1 - start1;
//        System.out.println(itog1);
//        MyLinkedList<Integer> test2 = new MyLinkedList<>();
//
//        print calcul = (x, y) -> x + y;
//        System.out.println(calcul.calc(30, 20));
    }

    interface print {
        Integer calc(Integer x, Integer y);
    }
}
