package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        even = 0;
        odd = 0;

        int i;
// читаем цифру
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
// оставляем в строке
        String num = reader.readLine();
// переводим в число
        int numb = Integer.parseInt(num);
// проверка числа на положительность
        if (numb > 0) {
// цикл от нуля до конца строки
            for (i = 0; i < num.length(); i++) {
// загоняем текущий символ в переменную типа char
                char tmp = num.charAt(i);
// если (перевод char в int делается таким "своеобразным способом") div 2 равен нулю
                if ((tmp - '0') % 2 == 0) {
// значит четное и плюсуем even
                    even++;
                } else
// иначе не четное и плюсуем odd
                    odd++;
            }
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }

}
