package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String file = consoleReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(file);

        Set<Integer> set = new HashSet<>();

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            set.add(data);
        }

        Integer[] bytes = set.toArray(new Integer[0]);

        for (int i = 0; i < bytes.length - 1; i++) {
            for (int j = 1; j < bytes.length; j++) {
                if (bytes[j - 1] > bytes[j]) {
                    int temp = bytes[j];
                    bytes[j] = bytes[j - 1];
                    bytes[j - 1] = temp;
                }
            }
        }

        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + " ");
        }

        consoleReader.close();
        fileInputStream.close();

    }
}
