package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());

        if (n < 1 || n > 7) {
            System.out.println("такого дня недели не существует");
        } else {
            if (n == 1) {
                System.out.println("понедельник");
            } else if (n == 2) {
                System.out.println("вторник");
            } else if (n == 3) {
                System.out.println("среда");
            } else if (n == 4) {
                System.out.println("четверг");
            } else if (n == 5) {
                System.out.println("пятница");
            } else if (n == 6) {
                System.out.println("суббота");
            } else {
                System.out.println("воскресенье");
            }
        }

    }
}