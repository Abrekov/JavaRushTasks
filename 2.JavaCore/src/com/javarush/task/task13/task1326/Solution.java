package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(fileInputStream));

        ArrayList<Integer> list = new ArrayList<>();
        String s = fileReader.readLine();

        int n;
        while (s != null) {
            n = Integer.parseInt(s);
            if (n % 2 == 0) {
                list.add(n);
            }
            s = fileReader.readLine();
        }

        int steps = list.size();
        int temp;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 1; j < steps; j++) {
                if (list.get(j - 1) > list.get(j)) {
                    temp = list.get(j);
                    list.set(j, list.get(j - 1));
                    list.set(j - 1, temp);
                }
            }
        }

        for (Integer number: list) {
            System.out.println(number);
        }

        reader.close();
        fileReader.close();
    }
}
