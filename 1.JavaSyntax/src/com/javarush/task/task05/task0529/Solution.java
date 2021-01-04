package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        int sum = 0;
        String str = reader.readLine();
        while (!str.equals("сумма")) {
            i = Integer.parseInt(str);
            sum += i;
            str = reader.readLine();
        }
        System.out.println(sum);
    }
}