package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        if (a <= 0 || b <= 0) {
            throw new Exception();
        }

        int min = a <= b ? a : b;

        int div = 1;
        for (int i = min; i > 1; i--) {
            if (a % i == 0 && b % i == 0) {
                div = i;
                break;
            }
        }
        System.out.println(div);
    }


}
