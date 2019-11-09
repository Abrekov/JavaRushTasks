package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
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

        // n1 n2 n3
        // n1 n3 n2
        // n2 n1 n3
        // n2 n3 n1
        // n3 n1 n2
        // n3 n2 n1
        if (n1 >= n2 && n2 >= n3) {
            System.out.println(n1 + " " + n2 + " " + n3);
        } else if (n1 >= n3 && n3 >= n2) {
            System.out.println(n1 + " " + n3 + " " + n2);
        } else if (n2 >= n1 && n1 >= n3) {
            System.out.println(n2 + " " + n1 + " " + n3);
        } else if (n2 >= n3 && n3 >= n1) {
            System.out.println(n2 + " " + n3 + " " + n1);
        } else if (n3 >= n1 && n1 >= n2) {
            System.out.println(n3 + " " + n1 + " " + n2);
        } else if (n3 >= n2 && n2 >= n1) {
            System.out.println(n3 + " " + n2 + " " + n1);
        }

    }
}
