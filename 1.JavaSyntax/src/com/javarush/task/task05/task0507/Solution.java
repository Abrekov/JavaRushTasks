package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int count = 0;
        double sum = 0;

        while (true) {
            BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(r.readLine());
            if (n == -1) {
                break;
            }
            sum += n;
            count++;
        }
        System.out.println(sum / count);
    }
}

