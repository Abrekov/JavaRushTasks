package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        FileWriter fileWriter = new FileWriter(args[1]);

        StringBuilder newLine = new StringBuilder();

        while (fileReader.ready()) {
            String[] words = fileReader.readLine().split("\\s+");
            for (String word: words) {
                if (word.length() > 6) {
                    newLine.append(word).append(",");
                }
            }
        }

        fileReader.close();

        fileWriter.write(newLine.substring(0, newLine.length() - 1));

        fileWriter.close();

    }
}
