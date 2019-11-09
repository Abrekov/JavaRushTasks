package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int n = 1;
        int m = 1;
        while (m <= 10) {
            while (n <= 10) {
                System.out.print(m * n + " ");
                n++;
            }
            System.out.println("");
            m++;
            n = 1;
        }
    }
}
