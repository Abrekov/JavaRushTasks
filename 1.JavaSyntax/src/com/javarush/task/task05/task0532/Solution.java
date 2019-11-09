package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.parseInt(reader.readLine());

        //напишите тут ваш код
        int n;
        int max = Integer.parseInt(reader.readLine());
        for (int i = 1; i < maximum; i++) {
            n = Integer.parseInt(reader.readLine());
            max = n > max ? n : max;
        }

        System.out.println(max);
    }
}
