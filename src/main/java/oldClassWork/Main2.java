package oldClassWork;

public class Main2 {
    public static void main(String[] args) {
      /*  int x = 753;
        int a,b,c;
        a = x/100;
        b = (x%100)/10;
        c = x%10;
        System.out.println(a);
        System.out.print(b+"\t");
        System.out.println(c);
*/
       for ( int a = 2; a <= 10 ; a++) {
           for (int i = 1;i<=9;++i){
               int a1 = a * i;
               System.out.print(a1+"\t");
           }
           System.out.println("");
       }
    }
}
