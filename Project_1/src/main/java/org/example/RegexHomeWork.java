package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexHomeWork {
    public static void main(String[] args) {
        /*1.  Написать программу которая анализирует строку на правила:
        - открытые скобки должны закрываться, три типа скобок {} [] ()
                - если в строка не заканчивается открывающей скобкой она должна заканчиваться ;
        - между парой скобок не может стоять лишь одна единственная скобка.*/
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        //String text = "Кабан (Кошка) [Собака] {Волк};";
        Pattern pattern = Pattern.compile("[\\(.++\\)\\{.++\\}\\[.++\\]]\\;$");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            while (matcher.find()) {
                System.out.println(text.substring(matcher.start(), matcher.end()));
            }
        } else {
            System.out.println("error");
        }
    }
}
