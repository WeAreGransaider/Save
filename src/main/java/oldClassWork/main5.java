package oldClassWork;

import java.util.Random;

public class main5 {
    public static void main(String[] args) {
        /*int num[] = {1, 5, 4, 8, 10};
        int v = 0;
        for (int i = 0; i < num.length; i++) {
            v = v + num[i];
            System.out.println(v);
        }
        System.out.println(v / num.length);
        System.out.println((num[0]+num[2]+num[4])/3);
        */
        Random random = new Random();
        int num[] = new int[100];
        int v = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(100);
            v = v + num[i];
            System.out.println(num[i]);
        }
        System.out.println(v / num.length);


    }


}

