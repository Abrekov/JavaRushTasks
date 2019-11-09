package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            strings.add(bufferedReader.readLine());
        }

        String longString = strings.get(0);
        for (int i = 1; i < strings.size(); i++) {
            if (strings.get(i).length() > longString.length()) {
                longString = strings.get(i);
            }
        }

        for (int i = 0; i < strings.size(); i++) {
            if (longString.length() == strings.get(i).length()) {
                System.out.println(strings.get(i));
            }
        }
    }
}
