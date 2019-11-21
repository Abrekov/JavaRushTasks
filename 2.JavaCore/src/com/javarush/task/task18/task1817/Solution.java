package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream stream = new FileInputStream(args[0]);

        int numOfSymbols = 0;
        int numOfSpaces = 0;
        while (stream.available() > 0) {
            byte[] buffer = new byte[stream.available()];
            numOfSymbols = stream.read(buffer);
            for (byte b : buffer) {
                char symbol = (char) b;
                if (symbol == ' ') {
                    numOfSpaces++;
                }
            }
        }

        double ratio = (double) numOfSpaces / numOfSymbols * 100;
        String ratioTwoDigit = String.format(Locale.ENGLISH, "%.2f", ratio);
        System.out.println(Double.parseDouble(ratioTwoDigit));

        stream.close();
    }
}
