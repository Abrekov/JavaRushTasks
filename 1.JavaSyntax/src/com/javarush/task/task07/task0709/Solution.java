package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            list.add(bufferedReader.readLine());
        }

        String shortString = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() < shortString.length()) {
                shortString = list.get(i);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (shortString.length() == list.get(i).length()) {
                System.out.println(list.get(i));
            }
        }

    }
}
