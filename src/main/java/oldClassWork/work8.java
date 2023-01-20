package oldClassWork;

import oldClassWork.main6;

public class work8 {
    public static void main(String[] args) {
        int a = 5;
        double y = sum(9.3,15.4);
        int x = sum(9,3);
        int z = sum (a,2,5);
        double t = sum(6,4.3,7) ;
        sum (" один"," два");
        System.out.println(y);
        System.out.println(x);
        System.out.println(z);
        System.out.println(t);
    }
    public static void sum (String a,String b) {
        System.out.println(a + b);
    }
    public static double sum(double a,double b) {
        return a + b;
    }
    public static int sum(int a,int b) {
        return a + b;
    }
    public static int sum(int a,int b,int c) {
        return a + b + c;
    }
    public static double sum(int a,double b,int c) {
        return a + b + c;
    }
    public static void tusk() {
        /*
        Дан массив, найти второе максимально число.
         */
        int array[] = main6.newArray(10);
        main6.massivePrint(array);
        int max = array[0];
        int max1 = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (max == max1) {
                max1 = array[i];
            }
            if (array[i] > max) {
                max1 = max;
                max = array[i];
            }
            else if (array[i] > max1 ) {
                max1 = array [i];
            }
        }

        System.out.print(max1);
    }
}
