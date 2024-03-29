package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = consoleReader.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));

        while (fileReader.ready()) {
            String line = fileReader.readLine();
            String[] lineWords = line.split("\\s+");

            int count = 0;
            for (int i = 0; i < lineWords.length; i++) {
                if (words.contains(lineWords[i])) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(line);
            }
        }

        consoleReader.close();
        fileReader.close();

    }
}
