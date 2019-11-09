package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] strings = new ArrayList[5];
        for (int i = 0; i < 5; i++) {
            ArrayList<String> list = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                list.add(Integer.toString(j));
            }
            strings[i] = list;
        }
        return strings;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}