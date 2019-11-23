package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = consoleReader.readLine();
        String file2 = consoleReader.readLine();
        consoleReader.close();
        FileReader fileReader = new FileReader(file1);
        FileWriter fileWriter = new FileWriter(file2);

        int count = 1;
        while (fileReader.ready()) {
            int symbol = fileReader.read();
            if (count % 2 == 0) {
                fileWriter.append((char) symbol);
            }
            count++;
        }

        fileReader.close();
        fileWriter.close();

    }
}
