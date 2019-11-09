package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(bufferedReader.readLine());
        }

        String shortString = list.get(0);
        String longString = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < shortString.length()) {
                shortString = list.get(i);
            }
            if (list.get(i).length() > longString.length()) {
                longString = list.get(i);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == shortString.length() || list.get(i).length() == longString.length()) {
                System.out.println(list.get(i));
                break;
            }
        }
    }
}
