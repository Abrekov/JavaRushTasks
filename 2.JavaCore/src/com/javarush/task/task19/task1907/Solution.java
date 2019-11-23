package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.CharBuffer;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String file = consoleReader.readLine();
        consoleReader.close();
        FileReader fileReader = new FileReader(file);

        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<String> words = new ArrayList<>();
        while (fileReader.ready()) {
            int symbol = fileReader.read();
            char ch = (char) symbol;
            if (Character.isLetter(ch)) {
                stringBuilder.append(ch);
            } else if (stringBuilder.length() != 0){
                words.add(stringBuilder.toString());
                stringBuilder.delete(0, stringBuilder.length());
            }
        }

        int count = 0;
        for (String world: words) {
            if (world.equals("world")) {
                count++;
            }
        }

        System.out.println(count);

        fileReader.close();
    }
}
