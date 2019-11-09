package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] ints = new int[20];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(bufferedReader.readLine());
        }

        int[] ints1 = new int[10];
        int[] ints2 = new int[10];

        for (int i = 0; i < 10; i++) {
            ints1[i] = ints[i];
        }
        for (int i = 0; i < 10; i++) {
            ints2[i] = ints[i + 10];
        }

        for (int i = 0; i < ints2.length; i++) {
            System.out.println(ints2[i]);
        }
    }
}
