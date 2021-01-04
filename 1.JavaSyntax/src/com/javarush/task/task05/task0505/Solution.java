package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Cat masha = new Cat("masha", 2, 1, 2);
        Cat petya = new Cat("petya", 1, 2, 2);
        Cat vova = new Cat("vova", 2, 3, 3);

        if (masha.fight(petya)) {
            System.out.println("Masha won Petya");
        } else {
            System.out.println("Masha did not win Petya");
        }

        if (masha.fight(vova)) {
            System.out.println("Masha won Vova");
        } else {
            System.out.println("Masha did not win Vova");
        }

        if (petya.fight(vova)) {
            System.out.println("Petya won Vova");
        } else {
            System.out.println("Petya did not win Vova");
        }
    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // return score > 0 ? true : false;
        }
    }
}
