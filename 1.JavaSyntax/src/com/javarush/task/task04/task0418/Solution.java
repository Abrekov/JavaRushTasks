package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(r.readLine());
        int n2 = Integer.parseInt(r.readLine());

        if (n1 <= n2) {
            System.out.println(n1);
        } else if (n2 <= n1) {
            System.out.println(n2);
        }
    }
}