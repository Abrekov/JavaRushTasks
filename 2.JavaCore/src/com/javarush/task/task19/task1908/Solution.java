package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = consoleReader.readLine();
        String file2 = consoleReader.readLine();
        consoleReader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(file1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file2));

        while (fileReader.ready()) {
            String line = fileReader.readLine();
            String[] words = line.split("\\s+");
            for (String word: words) {
                if (word.matches("-?\\d+")) {
                    fileWriter.write(word + " ");
                }
            }
        }

        fileReader.close();
        fileWriter.close();

    }
}
