package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = consoleReader.readLine();
        String file2 = consoleReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(file1);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);

        if (fileInputStream.available() > 0) {
            byte[] buffer = new byte[fileInputStream.available()];
            int count = fileInputStream.read(buffer);
            byte[] buffer2 = new byte[count];
            for (int i = count - 1; i >= 0; i--) {
                buffer2[count - 1 - i] = buffer[i];
            }
            fileOutputStream.write(buffer2);
        }

        consoleReader.close();
        fileInputStream.close();
        fileOutputStream.close();
    }
}
