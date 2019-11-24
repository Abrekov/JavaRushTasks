package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));

        Map<String, Double> map = new HashMap<>();

        while (fileReader.ready()) {
            String[] line = fileReader.readLine().split("\\s+");
            if (map.containsKey(line[0])) {
                map.put(line[0], Double.parseDouble(line[1]) + map.get(line[0]));
            } else {
                map.put(line[0], Double.parseDouble(line[1]));
            }
        }

        String[] names = map.keySet().toArray(new String[0]);

        for (int i = 0; i < names.length - 1; i++) {
            for (int j = 1; j < names.length; j++) {
                if (names[j - 1].compareTo(names[j]) > 0) {
                    String temp = names[j];
                    names[j] = names[j - 1];
                    names[j - 1] = temp;
                }
            }
        }

        for (String name : names) {
            System.out.println(name + " " + map.get(name));
        }

        fileReader.close();

    }
}
