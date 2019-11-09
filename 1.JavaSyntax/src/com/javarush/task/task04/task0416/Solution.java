package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        double n = Double.parseDouble(r.readLine());

        if (n % 5 >= 0 && n % 5 < 3) {
            System.out.println("зеленый");
        } else if (n % 5 >= 3 && n % 5 < 4) {
            System.out.println("желтый");
        } else {
            System.out.println("красный");
        }

    }
}