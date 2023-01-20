package org.example;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;

public class MyLinkedList<E> {
    private Entity firstEntity = null;
    private Entity lastEntity = null;
    private int sizeOfList = 0;

    public MyLinkedList(Collection<E> collection) {
        for (E element : collection) {
            add(element);
        }
    }

    public MyLinkedList() {
    }

    public MyLinkedList(E data) {
        firstEntity = new Entity(data);
        this.sizeOfList = 1;
    }

    public void add(E data) {
        Entity newData = new Entity(data);

        if (firstEntity == null) {
            firstEntity = newData;
            lastEntity = newData;
        } else {
            lastEntity.next = newData;
            newData.previous = lastEntity;
            lastEntity = newData;
        }
        this.sizeOfList++;
    }

    public int size() {
        return this.sizeOfList;
    }

    public void print() {
        Entity temp = firstEntity;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public E get(int index) {
        if (index >= this.sizeOfList) {
            throw new ArrayIndexOutOfBoundsException("too mach index");
        }
        Entity temp;
        if (index < sizeOfList / 2) {
            temp = firstEntity;
            for (int i = 0; i != index; i++) {
                temp = temp.next;
            }
        } else {
            temp = lastEntity;
            for (int i = sizeOfList - 1; i != index; i--) {
                temp = temp.previous;
            }
        }
        return temp.data;
    }

    public boolean insert(E data, int index) { // вставляет элемент по указанному id //!
        if (index >= this.sizeOfList || index < 0) {
            return false;
        }
        Entity temp;
        if (index < sizeOfList / 2) {
            temp = firstEntity;
            for (int i = 0; i != index; i++) {
                temp = temp.next;
            }
        } else {
            temp = lastEntity;
            for (int i = sizeOfList - 1; i != index; i--) {
                temp = temp.previous;
            }
        }
        Entity first = temp.previous;
        Entity newData = new Entity(data);
        first.next = newData;
        newData.previous = first;
        temp.previous = newData;
        newData.next = temp;
        return true;
    }
//Петя,(Иван),Дима,Вова

    public boolean remove(int index) {
        if (index >= this.sizeOfList) {
            return false;
        }
        Entity temp;
        if (index < sizeOfList/2) {
            temp = firstEntity;
            for (int i = 0; i != index; i++) {
                temp = temp.next;
            }
        } else {
            temp = lastEntity;
            for (int i = sizeOfList - 1; i != index; i--) {
                temp = temp.previous;
            }
        }
        Entity first = temp.previous;
        Entity third = temp.next;
        temp.previous = null;
        temp.next = null;
        if (firstEntity == temp) {
            firstEntity = third;
        }
        if (first != null) {
            first.next = third;
        } else {
            this.firstEntity = third;
        }
        if (third != null) {
            third.previous = first;
        }
        sizeOfList--;
        return true;
    }

    //1,2,3
    public void sort(Comparator<E> comparator) {
        for (int i = 0; i < sizeOfList; i++) {
            Entity current = firstEntity;
            while (current.next != null) {
                if (comparator.compare(current.data, current.next.data) < 0) {
                    if (current == firstEntity) {
                        firstEntity = current.next;
                    }
                    Entity first = current;
                    Entity second = first.next;
                    Entity third = second.next;
                    current = second;
                    first.next = third;
                    current.next = first;
                    second.previous = first.previous;
                    first.previous = second;
                    if (third != null) {
                        third.previous = first;
                    }
                    if (second.previous != null) {
                        second.previous.next = second;
                    }
                }
                current = current.next;
            }
            lastEntity = current;
        }
    }

    class Entity {
        public Entity previous = null;
        public Entity next = null;
        public E data;

        public Entity(E data) {
            this.data = data;
        }
    }
}