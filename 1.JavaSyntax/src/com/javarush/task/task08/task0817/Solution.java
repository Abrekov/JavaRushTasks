package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {

    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Петров", "Иван");
        map.put("Сидоров", "Иван");
        map.put("Петренок", "Вася");
        map.put("Портнов", "Миша");
        map.put("Николаев", "Коля");
        map.put("Петросян", "Коля");
        map.put("Путин", "Володя");
        map.put("Коровина", "Ксения");
        map.put("Бойченко", "Макс");
        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Map<String, String> copy = new HashMap<>(map);

        for (Map.Entry<String, String> pair: copy.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            map.remove(key);
            if (map.containsValue(value)) {
                removeItemFromMapByValue(map, value);
            } else {
                map.put(key, value);
            }

        }


    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
