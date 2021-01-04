package com.javarush.task.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как-то средненько
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a == b || a == c) {
            System.out.println(a);
        } else if (b == c) {
            System.out.println(b);
        }
        if ((b < a && a < c) || (c < a && a < b)) {
            System.out.println(a);
        }
        if ((a < b && b < c) || (c < b && b < a)) {
            System.out.println(b);
        }
        if ((a < c && c < b) || (b < c && c < a)) {
            System.out.println(c);
        }


    }
}
