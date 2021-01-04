package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg girlOne = new Zerg();
        girlOne.name = "Raji";
        Zerg girlTwo = new Zerg();
        girlTwo.name = "Neetu";
        Zerg girlThree = new Zerg();
        girlThree.name = "Jyothi";
        Zerg girlFour = new Zerg();
        girlFour.name = "Varsha";
        Zerg girlFive = new Zerg();
        girlFive.name = "Tanu";
        Protoss boyOne = new Protoss();
        boyOne.name = "Ken";
        Protoss boyTwo = new Protoss();
        boyTwo.name = "Arvind";
        Protoss boyThree = new Protoss();
        boyThree.name = "Stiven";
        Terran studentOne = new Terran();
        studentOne.name = "Derya";
        Terran studentTwo = new Terran();
        studentTwo.name = "Fatma";
        Terran studentThree = new Terran();
        studentThree.name = "Olga";
        Terran studentFour = new Terran();
        studentFour.name = "Nicole";

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
