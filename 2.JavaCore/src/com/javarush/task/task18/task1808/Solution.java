package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = consoleReader.readLine();
        String file2 = consoleReader.readLine();
        String file3 = consoleReader.readLine();
        FileInputStream fileInputStream1 = new FileInputStream(file1);
        FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
        FileOutputStream fileOutputStream3 = new FileOutputStream(file3);

        if (fileInputStream1.available() > 0) {
            int half1;
            int half2;
            if (fileInputStream1.available() % 2 == 0) {
                half1 = fileInputStream1.available() / 2;
                half2 = fileInputStream1.available() / 2;
            } else {
                half1 = fileInputStream1.available() / 2 + 1;
                half2 = fileInputStream1.available() / 2;
            }
            byte[] buffer = new byte[half1];
            int count = fileInputStream1.read(buffer);
            fileOutputStream2.write(buffer, 0, count);
            buffer = new byte[half2];
            count = fileInputStream1.read(buffer);
            fileOutputStream3.write(buffer, 0, count);

        }

        consoleReader.close();
        fileInputStream1.close();
        fileOutputStream2.close();
        fileOutputStream3.close();
    }
}
