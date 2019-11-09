package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader num1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader num2 = new BufferedReader(new InputStreamReader(System.in));

        String name = n.readLine();
        int sum = Integer.parseInt(num1.readLine());
        int years = Integer.parseInt(num2.readLine());

        System.out.println(name + " получает " + sum + " через " + years + " лет.");
    }
}
