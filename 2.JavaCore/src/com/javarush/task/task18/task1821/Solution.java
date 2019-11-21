package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream stream = new FileInputStream(args[0]);
        byte[] buffer = new byte[stream.available()];
        int count = stream.read(buffer);

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < buffer.length; i++) {
            char key = (char) buffer[i];
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        Character[] keys = map.keySet().toArray(new Character[0]);
        for (int i = 0; i < keys.length - 1; i++) {
            for (int j = 1; j < keys.length; j++) {
                int prevChar = keys[j - 1];
                int curChar = keys[j];
                if (prevChar > curChar) {
                    char temp = keys[j];
                    keys[j] = keys[j - 1];
                    keys[j - 1] = temp;
                }
            }
        }

        for (char key: keys) {
            System.out.println(key + " " + map.get(key));
        }

        stream.close();

    }
}
