package oldClassWork;

public class main3 {
    public static void main(String[] args) {
        int x = 1784747642;
        while ( x != 0 ) {
            int v = x % 10;
            System.out.println(v);
            x = x / 10;
        }
    }
}
