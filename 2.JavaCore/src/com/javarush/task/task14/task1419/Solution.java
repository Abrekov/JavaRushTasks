package com.javarush.task.task14.task1419;

import java.io.FileInputStream;
import java.util.*;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        try {
            int[] ints = {1, 2};
            int a = ints[2];
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String str = null;
            System.out.println(str.length());
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("sdggsg.txt");
        } catch (Exception e) {
            exceptions.add(e);
        }
        // 5
        try {
            Object s = new String("Hi");
            double d = (double) s;
        } catch (Exception e) {
            exceptions.add(e);
        }
        // 6
        try {
            String str = new String("Hi");
            char ch = str.charAt(2);
        } catch (Exception e) {
            exceptions.add(e);
        }

        // 7
        try {
            int num = Integer.parseInt("Hi");
        } catch (Exception e) {
            exceptions.add(e);
        }

        // 8
        try {
            ArrayList list = new ArrayList();
            list.get(1);
        } catch (Exception e) {
            exceptions.add(e);
        }

        // 9
        try {
            List<String> str = Arrays.asList("A", "B", "C");
            str.add("D");
            System.out.println(str);
        } catch (Exception e) {
            exceptions.add(e);
        }

        // 10
        try {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            System.out.println(x);
        } catch (Exception e) {
            exceptions.add(e);
        }

        // 11
    }
}
