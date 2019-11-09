package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        String word;
        for (int i = 0; i < strings.size(); ) {
            word = strings.get(i);
            if (word.contains("р") && word.contains("л")) {
                i++;
            } else if (word.contains("р")) {
                strings.remove(i);
            } else if (word.contains("л")) {
                strings.add(i + 1, word);
                i += 2;
            } else {
                i++;
            }
        }
        return strings;
    }
}