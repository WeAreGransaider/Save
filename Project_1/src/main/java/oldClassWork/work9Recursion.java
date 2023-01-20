package oldClassWork;

public class work9Recursion {
    public static void main(String[] args) {
        System.out.println(numberRecursion41(50));
    }


    public static void numberRecursion(int x) {
        if (x % 2 == 0) {
            System.out.println(x);
        }
        x--;
        if (x == 0) {
            return;
        }
        numberRecursion(x);
    }

    public static void numberRecursion2(int x, int y) {
        System.out.println(x);
        x++;
        if (x > y) {
            return;
        }
        numberRecursion2(x, y);
    }

    public static void numberRecursion3(int x) {
        if (x == 3) {
            System.out.println("Кратно 3");
            return;
        }
        if (x < 3 || x % 3 != 0) {
            System.out.println(" Не кратно 3");
            return;
        }
        x = x / 3;
        numberRecursion3(x);
    }

    public static void numberRecursion4_1(int x) {
        // 1 1 2 3 5 8... обратная рекурсия
        int f1 = 1;
        int f2 = 1;
        int torrent = 0;
        for (int y = 0; y <= x; y++) {
            torrent = f1;
            f1 = f1 + f2;
            f2 = torrent;
            System.out.println(f1);
        }
    }

    public static long numberRecursion41(long x) {
        //0 1 1 2 3 5 8... обратная рекурсия
        if (x == 1) {
            return 0;
        }
        if (x == 2) {
            return 1;
        }
        return numberRecursion41(x-2)+ numberRecursion41(x-1);
    }

    public static void numberRecursion4(int x) {

    }

    public static void numberRecursion5(int x) {
        if (x == 0) {
            return;
        }
        numberRecursion5(x / 10);
        System.out.print(x % 10 + " ");

    }
}

