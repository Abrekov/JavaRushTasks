package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader r2 = new BufferedReader(new InputStreamReader(System.in));
        int years = Integer.parseInt(r1.readLine());
        String name = r2.readLine();


        System.out.println(name + " захватит мир через " + years + " лет. Му-ха-ха!");
    }
}
