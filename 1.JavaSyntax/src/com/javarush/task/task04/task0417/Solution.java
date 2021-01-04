package com.javarush.task.task04.task0417;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Существует ли пара?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if (a == b && a == c) System.out.println(a + " " + b + " " + c);
        else {
            if (a == b) System.out.println(a + " " + b);
            if (a == c) System.out.println(a + " " + c);
            if (c == b) System.out.println(c + " " + b);
        }
    }
}