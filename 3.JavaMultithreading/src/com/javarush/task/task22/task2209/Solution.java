package com.javarush.task.task22.task2209;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Составить цепочку слов
*/
public class Solution {
    public static void main(String[] args) {
        try (BufferedReader cReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fReader = new BufferedReader(new FileReader(cReader.readLine())))
        {
            StringBuilder words = new StringBuilder();

            while (fReader.ready()) {
                words.append(fReader.readLine());
            }
            String[] arrayOfWords = words.toString().split("\\s+");

            StringBuilder result = getLine(arrayOfWords);
            System.out.println(result.toString().trim());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static StringBuilder getLine(String... words) {
        StringBuilder line = new StringBuilder();
        if (words.length == 0) {
            return line;
        }

        ArrayList<Integer> indexes = new ArrayList<>();
        ArrayList<Integer> max = new ArrayList<>();

        for (int j = 0; j < words.length; j++) {
            indexes.add(j);
            char last = Character.toUpperCase(words[j].charAt(words[j].length() - 1));
            for (int i = 0; i < words.length; i++) {
                if (indexes.contains(i)) {
                    continue;
                }
                if (last == Character.toUpperCase(words[i].charAt(0))) {
                    indexes.add(i);
                    last = Character.toUpperCase(words[i].charAt(words[i].length() - 1));
                    i = 0;
                }
            }

            if (indexes.size() == words.length) {
                max = indexes;
                break;
            } else {
                if (indexes.size() > max.size()) {
                    max = indexes;
                }
                indexes = new ArrayList<>();
            }

        }

        for (int i: max) {
            line.append(words[i]).append(" ");
        }
        return line;
    }
}
