package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Сортировка трех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        int n3 = Integer.parseInt(reader.readLine());
        int s1, s2, s3;
        if (n1 >= n2 && n1 >= n3) { // agar n1 maximal bulsa
            s1 = n1;
            if (n2 >= n3) {
                s2 = n2;
                s3 = n3;
            } else {
                s2 = n3;
                s3 = n2;
            }
        } else if (n2 >= n1 && n2 >= n3) { // agar n2 maximal bulsa
            s1 = n2;
            if (n1 >= n3) {
                s2 = n1;
                s3 = n3;
            } else {
                s3 = n1;
                s2 = n3;
            }
        } else { // agar n3 maximal bulsa
            s1 = n3;
            if (n1 >= n2) {
                s2 = n1;
                s3 = n2;
            } else {
                s2 = n2;
                s3 = n1;
            }
        }

        System.out.print(s1 + " " + s2 + " " + s3);

    }
}
