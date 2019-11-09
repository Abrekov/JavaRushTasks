package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Петр");
        map.put("Путин", "Иван");
        map.put("Портнов", "Сергей");
        map.put("Петров", "Григорий");
        map.put("Селезнев", "Дмитрий");
        map.put("Никулин", "Иван");
        map.put("Горохов", "Владимир");
        map.put("Коровина", "Ксения");
        map.put("Василь", "Юрий");
        map.put("Коваленко", "Иван");

        return map;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> pair: map.entrySet()) {
            if (pair.getValue() == name) {
                count++;
            }
        }
        return count;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> pair: map.entrySet()) {
            if (pair.getKey() == lastName) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {

    }
}
