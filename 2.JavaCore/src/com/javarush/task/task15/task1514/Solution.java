package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static
    {
        labels.put(0.1, "dfwef");
        labels.put(2.1, "dfwefw");
        labels.put(7.1, "dfwerf");
        labels.put(9.1, "dfwfef");
        labels.put(3.1, "dfvwef");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
