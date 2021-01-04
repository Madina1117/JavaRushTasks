package com.javarush.task.task03.task0319;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Предсказание на будущее
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println(name + " получает " + number1 + " через " + number2 + " лет.");

    }
}
