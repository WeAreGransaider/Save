package OLD5;

public class HomeWork4 {
    public static void main(String[] args) {
        /*
Найти разность между максимальным и минимальным элементами массива
В одномерном массиве найти минимальный и максимальный элементы.
Вычислить их разность.
Входные данные: int a[2] = {9, 8}
Выходные данные: 1
Входные данные: int a[7] = {6, 2, 5, 3, 4, 8, 7}
Выходные данные: 6
Входные данные: int a[16] = {5, 6, 4, 7, 8, 9, 1, 9, 8, 3, 4, 2, 2, 8, 5, 6, 7}
Выходные данные: 9
         */
        int a[] = {5, 6, 4, 7, 8, 9, 1, 9, 8, 3, 4, 2, 2, 8, 5, 6, 7};
        int max = a[0];
        int min = a[0];
        for (int i = 0;i<a.length;i++) {
            if (max < a[i]) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(max - min);


    }
}
