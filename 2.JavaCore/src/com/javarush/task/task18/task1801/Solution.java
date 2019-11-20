package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String file = consoleReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(file);

        int max = 0;
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            if (max < data) {
                max = data;
            }
        }
        System.out.println(max);

        fileInputStream.close();
    }
}
