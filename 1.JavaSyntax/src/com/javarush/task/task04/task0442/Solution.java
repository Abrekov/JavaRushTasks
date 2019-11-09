package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        int sum = 0;
        while (true) {
            n = Integer.parseInt(r.readLine());
            if (n == -1) {
                sum += n;
                System.out.println(sum);
                break;
            }
            sum += n;
        }
    }
}
