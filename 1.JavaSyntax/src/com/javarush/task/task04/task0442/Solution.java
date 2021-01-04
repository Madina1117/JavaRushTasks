package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num, x = 0;
        while (true) {
            num = Integer.parseInt(reader.readLine());
            x = x + num;
            if (num == -1 ) {
                break;
            }
        }
        System.out.println(x);
    }
}

