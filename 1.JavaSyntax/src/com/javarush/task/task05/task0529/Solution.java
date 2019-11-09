package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int sum = 0;
        while (true) {
            String s = b.readLine();
            if (s.equals("сумма")) {
                break;
            }
            int n = Integer.parseInt(s);
            sum += n;
            count++;

        }
        System.out.println(sum);
    }
}
