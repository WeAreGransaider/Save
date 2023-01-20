package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
       /* 2. Написать программу - пользователь вводит ip адрес, проверить его на валидность
                - если пользователь ввел все верно - пишем все верно
        - если пользователь ввел лишние символы (не цифры лишние) но ip адрес верный, написать ему верно ли его поняли, и если да то все ок, он молодец
                - иначе напистаь что ip введен не корректно
        3. Написать программу, которая принимает через командную строку несколько числовых диапазонов и выдает на экран список чисел.
                Например: ''1,2,4-7,18-21'' -> 1,2,4,5,6,7,18,19,20,21.*/

        //№3



        String text = "1,2,4-7,18-21";
        String stroki[] = text.split(",");
        for (String s: stroki) {
            if (!s.contains("-")) {
                System.out.println(s + " ");
            } else {
                String buf[] = s.split("-");
                int start = Integer.parseInt(buf[0]);
                int end = Integer.parseInt(buf[1]);
                for (;start <= end;start++) {
                    System.out.println(start + " " );
                }
            }
        }


        idRegex();
    }

    //№2
    //17.227.209.82
    public static void idRegex() {
        Scanner scanner = new Scanner(System.in);
        String idText = scanner.nextLine();
        idText = idText.replaceAll("([a-zA-Z])", "");
        Pattern pattern = Pattern.compile("\\d{1,3}.\\d{1,3}.\\d{1,3}.\\d{1,3}");
        Matcher matcher = pattern.matcher(idText);
        int buffer = 0;
        if (matcher.find()) {
            String id[] = idText.split("\\.");
            for (String o : id) {
                buffer = Integer.parseInt(o);
                if (buffer > 255 || buffer < 0) {
                    System.out.println("error");
                    return;
                }
            }
        } else {
            System.out.println("error");
            return;
        }
        System.out.println(idText);

    }
}
