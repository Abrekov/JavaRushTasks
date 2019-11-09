package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());
        int c = Integer.parseInt(r.readLine());


        // a <= b <= c
        // a <= c <= b
        // b <= a <= c
        // b <= c <= a
        // c <= a <= b
        // c <= b <= a

        if (a <= b && b <= c) {
            System.out.println(b);
        } else if (a <= c && c <= b) {
            System.out.println(c);
        } else if (b <= a && a <= c) {
            System.out.println(a);
        } else if (b <= c && c <= a) {
            System.out.println(c);
        } else if (c <= a && a <= b) {
            System.out.println(a);
        } else if (c <= b && b <= a) {
            System.out.println(b);
        } else if (a == b && b == c) {
            System.out.println(a);
        }

    }
}
