package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        int sum = 0;
        while (fileInputStream.available() > 0) {
            char letter = (char) fileInputStream.read();
            String strLetter = String.valueOf(letter).toLowerCase();
            if (alphabet.contains(strLetter)) {
                sum++;
            }
        }

        System.out.println(sum);

        fileInputStream.close();
    }
}
