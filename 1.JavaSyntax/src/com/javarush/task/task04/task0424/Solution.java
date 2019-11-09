package com.javarush.task.task04.task0424;

/* 
Три числа
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

        if (n1 == n2 && n2 != n3) {
            System.out.println(3);
        } else if (n2 == n3 && n1 != n2) {
            System.out.println(1);
        } else if (n1 == n3 && n3 != n2) {
            System.out.println(2);
        }
    }
}
