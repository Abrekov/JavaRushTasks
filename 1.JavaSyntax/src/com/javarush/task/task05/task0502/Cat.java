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
        int ourPoints = 0;
        int anotherCatPoints = 0;
        boolean win = false;

        if (this.age > anotherCat.age) {
            ourPoints++;
        } else if (this.age < anotherCat.age) {
            anotherCatPoints++;
        }

        if (this.strength > anotherCat.strength) {
            ourPoints++;
        } else if (this.strength < anotherCat.strength) {
            anotherCatPoints++;
        }

        if (this.weight > anotherCat.weight) {
            ourPoints++;
        } else if (this.weight < anotherCat.weight) {
            anotherCatPoints++;
        }

        return ourPoints > anotherCatPoints;
    }

    public static void main(String[] args) {

    }
}
