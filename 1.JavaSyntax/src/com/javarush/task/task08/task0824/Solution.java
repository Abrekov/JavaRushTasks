package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> childrenOfChildren = new ArrayList<>();

        Human child1 = new Human("Ребенок1", true, 10, childrenOfChildren);
        Human child2 = new Human("Ребенок2", false, 15, childrenOfChildren);
        Human child3 = new Human("Ребенок3", true, 5, childrenOfChildren);
        ArrayList<Human> children = new ArrayList<>();
        children.add(child1);
        children.add(child2);
        children.add(child3);

        Human father = new Human("Папа Денис", true, 50, children);
        Human mother = new Human("Мама Вера", false, 50, children);
        ArrayList<Human> parent1 = new ArrayList<>();
        parent1.add(father);
        ArrayList<Human> parent2 = new ArrayList<>();
        parent2.add(mother);

        Human grandFather1 = new Human("Дед Коля", true, 100, parent1);
        Human grandFather2 = new Human("Дед Толя", true, 110, parent2);
        Human grandMother1 = new Human("Бабушка Тяня", false, 100, parent1);
        Human grandMother2 = new Human("Бабушка Тоня", false, 110, parent2);

        System.out.println(grandFather1);
        System.out.println(grandFather2);
        System.out.println(grandMother1);
        System.out.println(grandMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
