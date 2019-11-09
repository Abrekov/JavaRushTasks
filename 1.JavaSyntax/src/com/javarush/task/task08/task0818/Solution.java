package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        map.put("dhher", 500);
        map.put("sed", 1000);
        map.put("vrew", 441);
        map.put("fldpp", 447);
        map.put("ojsn", 300);
        map.put("lwmm", 111);
        map.put("ppwkw", 2000);
        map.put("aawsz", 2232);
        map.put("aaswe", 87);
        map.put("ddpllk", 661);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            if (pair.getValue() < 500) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}