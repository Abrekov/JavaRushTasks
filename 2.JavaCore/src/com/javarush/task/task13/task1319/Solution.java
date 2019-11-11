package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));
        String s;

        do {
            s = reader.readLine();
            writer.write(s);
            writer.newLine();
        } while (!s.equals("exit"));

        reader.close();
        writer.close();

    }
}
