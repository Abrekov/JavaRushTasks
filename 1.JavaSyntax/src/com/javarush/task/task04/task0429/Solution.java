package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
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

        int countNeg = 0;
        int countPos = 0;

        if (a < 0) {
            countNeg++;
        } else if (a > 0) {
            countPos++;
        }
        if (b < 0) {
            countNeg++;
        } else if (b > 0) {
            countPos++;
        }
        if (c < 0) {
            countNeg++;
        } else if (c > 0) {
            countPos++;
        }
        System.out.println("количество отрицательных чисел: " + countNeg);
        System.out.println("количество положительных чисел: " + countPos);


    }
}
