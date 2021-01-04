package com.javarush.task.task04.task0413;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
День недели
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String day = reader.readLine();
        int nday = Integer.parseInt(day);
        if (nday > 7 || nday < 1) {
            System.out.println("такого дня недели не существует");
        } else {
            if (nday == 1) {
                System.out.println("понедельник");
            } else if (nday == 2) {
                System.out.println("вторник");
            } else if (nday == 3) {
                System.out.println("среда");
            } else if (nday == 4) {
                System.out.println("четверг");
            } else if (nday == 5) {
                System.out.println("пятница");
            } else if (nday == 6) {
                System.out.println("суббота");
            } else {
                System.out.println("воскресенье");
            }

        }
    }
}