package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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

        Double[] values = map.values().toArray(new Double[0]);
        double maxValue = 0.0;
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] > maxValue) {
                maxValue = values[i];
            }
        }

        ArrayList<String> names = new ArrayList<>();

        for (Map.Entry<String, Double> pair: map.entrySet()) {
            String key = pair.getKey();
            Double value = pair.getValue();
            if (value == maxValue) {
                names.add(key);
            }
        }

        for (int i = 0; i < names.size() - 1; i++) {
            for (int j = 1; j < names.size(); j++) {
                if (names.get(j - 1).compareTo(names.get(j)) > 0) {
                    String temp = names.get(j);
                    names.set(j, names.get(j - 1));
                    names.set(j - 1, temp);
                }
            }
        }


        for (String name : names) {
            System.out.println(name);
        }

        fileReader.close();


    }
}
