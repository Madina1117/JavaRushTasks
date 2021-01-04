package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        int a = Integer.parseInt(reader.readLine());
        //напишите тут ваш код
        if (a > 0){
            for (int i = 1; i<=a; i++){
                int b = Integer.parseInt(reader.readLine());
                if(i == 1) maximum = b;
                if (b > maximum) maximum = b;
            }
            System.out.println(maximum);
        }

    }
}