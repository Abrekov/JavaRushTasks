package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        URL url = new URL(str);
        String[] queries = url.getQuery().split("&");

        String obj = "";

        for (String s: queries) {
            if (s.contains("=")) {
                if (s.contains("obj")) {
                    obj = s.substring(s.indexOf("=") + 1, s.length());
                }
                System.out.print(s.substring(0, s.indexOf("=")) + " ");
            } else {
                System.out.print(s + " ");
            }
        }
        System.out.println("");

        reader.close();

        if (!obj.isEmpty()) {
            if (isNumber(obj)) {
                alert(Double.parseDouble(obj));
            } else {
                alert(obj);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }

    public static boolean isNumber(String str) {
        try {
            Double d = Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
