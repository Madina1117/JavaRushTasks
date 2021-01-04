package com.javarush.task.task01.task0131;

/* 
Полнометражная картина
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getMetreFromCentimetre(243));
    }

    public static int getMetreFromCentimetre(int centimetre) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        return centimetre/100;

    }
}