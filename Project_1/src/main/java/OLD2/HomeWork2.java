package OLD2;

public class HomeWork2 {
    public static void main(String[] args) {
   /*
     Дано целое число, состоящее из разных цифр.
     Определить, какая из цифр заданного числа больше,
     т. е. найти наибольшую цифру числа.
     Если числа одинаковые, то вывести "Числа равны".
     Входные данные: 89
     Выходные данные: 9
     Входные данные: 36587
     Выходные данные: 8
     Входные данные: 11
     Выходные данные: Числа равны
   */
        int x = 63467;
        int max = 0;
        boolean isEqual = true;
        while (x != 0) {
            if (max < x % 10) {
                max = x % 10;
            }
            if (max != x % 10) {
                isEqual = false;
            }
            x = x / 10;
        }
        if (isEqual) {
            System.out.println("Числа равны");
        } else {
            System.out.println(max);
        }
    }
}