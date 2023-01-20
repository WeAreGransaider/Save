package OLD;

/*
Вводится натуральное число с клавиатуры (пускай будет N). Необходимо вывести все точные квадраты натуральных чисел, не превосходящие данного числа N.
*/
public class HomeWork2 {
    public static void main(String[] args) {
        int a = 1000;
        int x = 1;
        for (int b = 1; (x = b * b) < a; ++b) {
            System.out.println(x);
       /*if (a==b){
           System.out.println(+b);
       } else {
           System.out.println(+b);*/
        }
    }
}
