package com.javarush.task.task04.task0412;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Положительное и отрицательное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        //System.out.println("Enter num: ");
        int num = scan.nextInt();
        if (num > 0) {
            System.out.println(num *= 2);
        } else if (num < 0) {
            System.out.println(num += 1);
        } else
            System.out.println(0);
    }


    }
