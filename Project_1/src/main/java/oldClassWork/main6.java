package oldClassWork;

import java.util.Date;
import java.util.Random;

// без d и оптимизация цикла, без проверок максимальных значений
public class main6 {
    public static void main(String[] args) {
        Random random = new Random();
        int array[] = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);

        }
        massivePrint(array);
        int buffer = 0;
        Date dateOld = new Date();

        for (int v = 0; v < array.length; v++) {
            for (int j = 0; j < array.length - 1 - v; j++) {
                if (array[j] > array[j + 1]) {
                    buffer = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buffer;
                }
            }
        }

        Date dateNew = new Date();
        System.out.println(dateNew.getTime() - dateOld.getTime());
        massivePrint(array);
    }

    public static int[] newArray(int arraySize){
        Random rand = new Random();
        int arr[] = new int[arraySize];
        for (int i = 0; i < arraySize; i++){
            arr[i] = rand.nextInt(90) + 10;
        }
        return arr;
    }
    public static void massivePrint(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


}


