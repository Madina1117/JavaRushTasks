package com.javarush.task.task03.task0314;

/* 
Таблица умножения Ӏ Java Syntax: 3 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int i;
        int j;
        for(i=1;i<=10;++i){
            for(j=1;j<=10;++j){
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}