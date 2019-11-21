package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String file = consoleReader.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(file));

        String str = fileReader.readLine();
        String[] line = str.split("\\s+");
        while (Integer.parseInt(line[0]) != Integer.parseInt(args[0])) {
            str = fileReader.readLine();
            line = str.split("\\s+");
        }

        System.out.println(str);

        consoleReader.close();
        fileReader.close();

    }
}
