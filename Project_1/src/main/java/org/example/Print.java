package org.example;

public interface Print {

    void print();


    static void staticPrint() {
        System.out.println("Статик");
    }

    default void printable() {
        System.out.println("дэфолт");
    }

}
