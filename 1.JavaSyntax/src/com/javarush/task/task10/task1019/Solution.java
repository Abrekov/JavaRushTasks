package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();

        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            int id = Integer.parseInt(s);
            String name = reader.readLine();

            map.put(name, id);
        }

        for (Map.Entry<String, Integer> pair: map.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(value + " " + key);
        }
    }
}
