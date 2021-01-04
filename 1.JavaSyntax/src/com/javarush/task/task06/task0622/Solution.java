package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] ar = new int[5];
        for (int i = 0; i < ar.length; i++) {
            int a = Integer.parseInt(reader.readLine());
            ar[i] += a;
        }
        Arrays.sort(ar);
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }

        }



    }
