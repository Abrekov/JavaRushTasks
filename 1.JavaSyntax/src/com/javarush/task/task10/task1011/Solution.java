package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        //напишите тут ваш код
        char[] chars = s.toCharArray();
        for (int j = 0; j < 40; j++) {
            for (int i = j; i < chars.length; i++) {
                System.out.print(chars[i]);
            }
            System.out.println("");
        }
    }

}

