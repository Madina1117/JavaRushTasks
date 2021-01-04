package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        for(int i = 1; i < 5; i++){
            result = result + s;
            System.out.println(s);
        }
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        for(int i = 1; i < count; i++){
            result = result + s;
            System.out.println(s);
        }
        return result;
    }

    public static void main(String[] args) {
        StringHelper.multiply("Amigo",3);
        StringHelper.multiply("Amigo");

    }
}
