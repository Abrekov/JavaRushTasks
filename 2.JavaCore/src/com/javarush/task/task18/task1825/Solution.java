package com.javarush.task.task18.task1825;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = consoleReader.readLine();
        int lastDot = fileName.lastIndexOf(".");
        String fullFileName = fileName.substring(0, lastDot);

        Map<Integer, String> map = new HashMap<>();

        while (!fileName.equals("end")) {
            int numOfFile = Integer.parseInt(fileName.substring(lastDot + 5));
            map.put(numOfFile, fileName);
            fileName = consoleReader.readLine();
        }

        Set<Integer> keys = map.keySet();
        Integer[] parts = keys.toArray(new Integer[0]);

        for (int i = 0; i < parts.length - 1; i++) {
            for (int j = 1; j < parts.length; j++) {
                if (parts[j - 1] > parts[j]) {
                    int temp = parts[j];
                    parts[j] = parts[j - 1];
                    parts[j - 1] = temp;
                }
            }
        }

        FileOutputStream fileOutputStream = new FileOutputStream(fullFileName, true);

        for (int i = 0; i < parts.length; i++) {
            FileInputStream fileInputStream = new FileInputStream(map.get(parts[i]));
            byte[] buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer);
            fileInputStream.close();
            fileOutputStream.write(buffer);
        }

        consoleReader.close();
        fileOutputStream.close();

    }
}
