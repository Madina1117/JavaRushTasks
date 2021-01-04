package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        int a = 0; // count of positive numbers
        int b = 0; // count of negative numbers

        // If num1 is positive a = a + 1
        if (num1 > 0) {
            a = a + 1;
        }
        // If num1 is negative b = b + 1
        if (num1 < 0) {
            b = b + 1;
        }
        if (num2 > 0) {
            a = a + 1;
        }
        if (num2 < 0) {
            b = b + 1;
        }
        if (num3 > 0) {
            a = a + 1;
        }
        if (num3 < 0) {
            b = b + 1;
        }
        System.out.println("количество отрицательных чисел: " + b);
        System.out.println("количество положительных чисел: " + a);

    }
}
