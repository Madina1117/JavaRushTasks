package com.javarush.task.task06.task0613;

/* 
Кот и статика
*/

public class Solution {
    public static void main(String[] args) {
        // Создай 10 котов
        Cat cat[] = new Cat[10];
        int i;
        for(i=0; i<10; i++){
            cat[i] = new Cat();
        }

        // Выведи значение переменной catCount
        System.out.println(Cat.catCount);

    }

    public static class Cat {
        // Создай статическую переменную catCount
        public static int catCount;

        // Создай конструктор
        public Cat(){
            catCount = catCount + 1;
        }
    }
}
