package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
Create 6 objects : grandfather  ( dad's dad ), grandmother ( mom's mom ), dad , mom , son , daughter .
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandpaName = reader.readLine();
        Cat grandpa = new Cat(grandpaName);

        String grandmaName = reader.readLine();
        Cat grandma = new Cat(grandmaName);

        String fatherName = reader.readLine();
        Cat father = new Cat(fatherName, null, grandpa);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, grandma, null);

        String sonName = reader.readLine();
        Cat son = new Cat(sonName, catMother, father);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, father);

        System.out.println(grandpa);
        System.out.println(grandma);
        System.out.println(father);
        System.out.println(catMother);
        System.out.println(son);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parent;
        private Cat parent2;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent) {
            this.name = name;
            this.parent = parent;
        }
        Cat(String name, Cat parent, Cat parent2) {
            this.name = name;
            this.parent = parent;
            this.parent2 = parent2;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            if (parent == null && parent2 == null)
                return "The cat's name is " + name + ", no mother, no father";
            else if(parent == null)
                return "The cat's name is " + name + ", no mother, father is " + parent2.getName();
            else if(parent2 == null)
                return "The cat's name is " + name + ", mother is " + parent.getName() + ", no father ";
            else
                return "The cat's name is " + name + ", mother is" + parent.getName() + ", father is " + parent2.getName();
        }
    }

}
