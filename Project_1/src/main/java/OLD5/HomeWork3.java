package OLD5;

public class HomeWork3 {
    public static void main(String[] args) {
        /*
Поиск минимально элемента в массиве.
Найти минимальный элемент массива и вывести его.
Входные данные: 7 8 9 4 6 3 2 5
Выходные данные: 2
Входные данные: 3 5 6 4 8 7
Выходные данные: 3
Входные данные: 8 5 4 7 2 3 1 4 9 7 6
Выходные данные: 1
         */

        int a[] = {5, 3, 4, 5, 6, 8, 7, 9, 2, 3, 3, 10};
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
             min = a[i];
            }
            System.out.println(min);
        }

        /*
        var nums = new int[]{1, 4, -2, 3};
        var min = nums[0];
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println(min);
*/

    }
}


