package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        FileWriter fileWriter = new FileWriter(args[1]);

        while (fileReader.ready()) {
            String[] words = fileReader.readLine().split("\\s+");
            for (String word: words) {
                if (word.matches("\\S*\\d+\\S*")) {
                    fileWriter.write(word + " ");
                }
            }
        }

        fileReader.close();
        fileWriter.close();
    }
}
