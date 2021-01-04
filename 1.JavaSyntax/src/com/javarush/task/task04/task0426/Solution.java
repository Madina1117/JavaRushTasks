package com.javarush.task.task04.task0426;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ярлыки и числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        if (num < 0 && num % 2 == 0) {
            System.out.println("отрицательное четное число");
        }else if (num < 0 && num % 2 != 0)
            System.out.println("отрицательное нечетное число");
        if (num == 0) {
            System.out.println("ноль");
        }
        if (num > 0 && num % 2 == 0) {
            System.out.println("положительное четное число");
        }else if (num > 0 && num % 2 != 0) {
            System.out.println("положительное нечетное число");
        }
    }
}
