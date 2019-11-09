package com.javarush.task.task08.task0812;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        int count = 1;
        int maxSeq = 1;
        for (int i = 1; i < 10; i++) {
            if (list.get(i).intValue() == list.get(i - 1).intValue()) {
                count++;
            } else {
                count = 1;
            }
            if (maxSeq < count) {
                maxSeq = count;
            }
        }
        System.out.println(maxSeq);
    }
}