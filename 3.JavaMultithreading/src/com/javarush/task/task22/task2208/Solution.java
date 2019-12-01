package com.javarush.task.task22.task2208;

import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {

    }

    public static String getQuery(Map<String, String> params) {

        StringBuilder where = new StringBuilder();

        for (Map.Entry<String, String> pair: params.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            if (value != null) {
                where.append(key + " = " + "\'" + value + "\' and ");
            }
        }

        if (where.length() != 0) {
            where.delete(where.length() - 5, where.length());
            return where.toString();
        } else {
            return "";
        }
    }
}
