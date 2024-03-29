package com.javarush.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String word : array) {
            System.out.println(word);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        String temp;
        int steps = array.length;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < steps; j++) {
                String a = array[j - 1];
                String b = array[j];
                if (isGreaterThan(a, b)) {
                    temp = a;
                    array[j - 1] = b;
                    array[j] = temp;
                }
            }
            steps--;
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
