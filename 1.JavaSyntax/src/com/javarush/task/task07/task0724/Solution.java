package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grandFather1 = new Human("дед1", true, 100);
        Human grandFather2 = new Human("дед2", true, 110);
        System.out.println(grandFather1);
        System.out.println(grandFather2);

        Human grandMother1 = new Human("бабка1", false, 100);
        Human grandMother2 = new Human("бабка2", false, 110);
        System.out.println(grandMother1);
        System.out.println(grandMother2);

        Human father = new Human("отец", true, 50, grandFather1, grandMother1);
        Human mother = new Human("мать", false, 50, grandFather2, grandMother2);
        System.out.println(father);
        System.out.println(mother);

        Human child1 = new Human("ребенок1", true, 1, father, mother);
        Human child2 = new Human("ребенок2", false, 2, father, mother);
        Human child3 = new Human("ребенок3", true, 3, father, mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}