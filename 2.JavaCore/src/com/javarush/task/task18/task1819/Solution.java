package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = consoleReader.readLine();
        String file2 = consoleReader.readLine();
        FileInputStream fileInputStream1 = new FileInputStream(file1);
        FileInputStream fileInputStream2 = new FileInputStream(file2);

        byte[] buffer1 = new byte[fileInputStream1.available()];
        byte[] buffer2 = new byte[fileInputStream2.available()];
        byte[] buffer21 = new byte[fileInputStream1.available() + fileInputStream2.available()];
        fileInputStream2.read(buffer2);
        for (int i = 0; i < buffer2.length; i++) {
            buffer21[i] = buffer2[i];
        }
        fileInputStream1.read(buffer1);
        for (int i = buffer2.length; i < buffer21.length; i++) {
            buffer21[i] = buffer1[i - buffer2.length];
        }

        FileOutputStream fileOutputStream1 = new FileOutputStream(file1);
        fileOutputStream1.write(buffer21);

        consoleReader.close();
        fileInputStream1.close();
        fileInputStream2.close();
        fileOutputStream1.close();

    }
}
