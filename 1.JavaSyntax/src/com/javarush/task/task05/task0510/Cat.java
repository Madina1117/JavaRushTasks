package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int age;
    int weight;
    String address;
    String color;

    public void initialize(String name){
        this.name = name;
        this.age = 6;
        this.weight = 2;
        this.color = "white";
        this.address = null;
    }
    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "white";
        this.address = null;
    }
    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 4;
        this.color = "brown";
        this.address = null;
    }
    public void initialize(int weight, String color){
        this.name = null;
        this.age = 6;
        this.weight = weight;
        this.color = color;
        this.address = null;
    }
    public void initialize(int weight, String color, String address){
        this.name = null;
        this.age = 5;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

}
