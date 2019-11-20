package com.javarush.task.task18.task1803;

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String file = consoleReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(file);

        Map<Integer, Integer> map = new HashMap<>();

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            if (map.containsKey(data)) {
                map.put(data, map.get(data) + 1);
            } else {
                map.put(data, 1);
            }
        }
        int maxValue = 1;
        for (Map.Entry<Integer, Integer> pair: map.entrySet()) {
            int key = pair.getKey();
            int value = pair.getValue();
            if (maxValue < value) {
                maxValue = value;
            }
        }

        for (Map.Entry<Integer, Integer> pair: map.entrySet()) {
            int key = pair.getKey();
            int value = pair.getValue();
            if (value == maxValue) {
                System.out.print(key + " ");
            }
        }


        fileInputStream.close();

    }
}
