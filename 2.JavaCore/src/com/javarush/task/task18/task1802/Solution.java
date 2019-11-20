package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String file = consoleReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(file);

        int min = 256;
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            if (min > data) {
                min = data;
            }
        }
        System.out.println(min);

        fileInputStream.close();

    }
}
