package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(r.readLine());
        int n2 = Integer.parseInt(r.readLine());
        int n3 = Integer.parseInt(r.readLine());
        int n4 = Integer.parseInt(r.readLine());

        int max = n1;
        if (n2 > max) {
            max = n2;
        }
        if (n3 > max) {
            max = n3;
        }
        if (n4 > max) {
            max = n4;
        }
        if (n1 == n2 && n2 == n3 && n3 == n4) {
            System.out.println(n1);
        } else {
            System.out.println(max);
        }

    }
}
