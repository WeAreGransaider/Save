package OLD;

/*ано целое число N (>0). Если оно является степенью числа 3, то вывести на экран True,
        иначе – вывести False. - решить через цикл for
 */
public class HomeWork1and3 {
    public static void main(String[] args) {

        int m = 9;
        String result = "False";
        for (int i = 3; i <= m; i = i * 3) {
            if (i == m) {
                result = "True";
            }
        }
        System.out.println(result);

    }
}