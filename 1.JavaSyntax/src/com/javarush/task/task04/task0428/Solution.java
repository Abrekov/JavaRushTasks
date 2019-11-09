package com.javarush.task.task04.task0428;

/* 
Положительное число
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

        int countPos = 0;
        if (n1 > 0) {
            countPos++;
        }
        if (n2 > 0) {
            countPos++;
        }
        if (n3 > 0) {
            countPos++;
        }
        System.out.println(countPos);
    }
}
