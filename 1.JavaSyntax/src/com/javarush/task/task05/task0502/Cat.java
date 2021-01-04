package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int me = 0, another = 0;
        if (this.age > anotherCat.age) { me++; }
        if (this.age < anotherCat.age) { another++; }
        if (this.weight > anotherCat.weight) { me++; }
        if (this.weight < anotherCat.weight) { another++; }
        if (this.strength > anotherCat.strength) { me++; }
        if (this.strength < anotherCat.strength) { another++; }
        return me > another;
    }

    public static void main(String[] args) {


    }
}
