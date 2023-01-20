package oldClassWork;

public class Main1 {
    public static void main(String[] args) {

        //1.    Вывести на консоль последовательность чисел: 1 2 4 8 16 32 64 128 256 512
        //2.    Вывести на консоль последовательность чисел: 7 14 21 28 35 42 49 56 63 70 77 84 91 98

        /*do {
            System.out.println(i);
        } while (i * 2);
        {
            if (i == 512) {
                break;
            }
            System.out.println(i);
        }
*/
        /*
        for (int a = 7; a <= 98;a=a+7) {
            System.out.println(a);
        }

        int i = 1;
        while ( i < 512) {
            i= i*2;
            System.out.println(i);
        }


        for( int i = 1; i <= 512;i = i*2 ) {
            System.out.println(i);
        }

        int a = 7;
        do {
            System.out.println(a);
            a = a +7;
        } while ( a <= 98);
 */

        //3.    Дано целое число N (>0). Если оно является степенью числа 3, то вывести на экран True,
        //иначе – вывести False.
       double N =85;
       while (N>3) {
           N= N/3;
           if (N==3){
               System.out.println("True");
               break;
           } else if (N<3) {
               System.out.println("False");

           }

       }

       int M = 81;
       int I = 3;
       while (I<M) {
            I = I*3;
       }
        if (I==M) {
            System.out.println("true");
        } else {
            System.out.println("False");
        }

















    }


}