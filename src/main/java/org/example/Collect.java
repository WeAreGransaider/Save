package org.example;
import oldClassWorkAnimal.Animal;
import oldClassWorkAnimal.Wolf;

import java.util.ArrayList;
import java.util.Collections;

public class Collect {
    public static void main(String[] args) {
/*
1. Напишите Java-программу для вставки элемента в список массивов в первой позиции.
2. Напишите Java-программу для извлечения элемента (по указанному индексу) из заданного списка массивов.
3. Напишите Java-программу для обновления определенного элемента массива по заданному элементу
4. Напишите программу на Java для удаления третьего элемента из списка массивов
5. Напишите программу на Java для поиска элемента в списке массивов
6. Напишите программу на Java для копирования одного списка массивов в другой
7. Напишите программу на Java для перемешивания элементов в списке массивов
 */
        Wolf wolf1 = new Wolf("1");
        Wolf wolf2 = new Wolf("2");
        Wolf wolf3 = new Wolf("3");
        ArrayList<Animal> animals = new ArrayList<>(10);
        animals.add(0,wolf1);                                  //Добавить в коллекцию
        System.out.println(animals.get(0));                          //Извлечь из задданого списка
        animals.set(0,wolf2);                                        //Замена объекта в коллекции
        System.out.println(animals.get(0));
        animals.add(1,wolf3);
        animals.remove(1);                                     //Убрать объект из коллекции
        System.out.println(animals.contains(1));                     //Проверка наличия объекта в коллекции
        ArrayList<Animal> animals1 = new ArrayList<>(animals);
        //animals1.forEach();
        System.out.println(animals1.get(0));
        Collections.shuffle(animals);                                //Перемешка элементов в коллекции
        animals.toArray();                                           //Возвращение последовательности в первоначальный вид
        System.out.println(animals1.size());                         //Размер коллекции
        animals1.clear();                                            //Чистит коллекцию
        animals.clone();
        System.out.println(animals.equals(0));                       //Сравнивает объект со всем списком
    }
}
