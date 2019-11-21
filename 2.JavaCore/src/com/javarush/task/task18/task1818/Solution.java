package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = consoleReader.readLine();
        String file2 = consoleReader.readLine();
        String file3 = consoleReader.readLine();
        FileInputStream fileInputStream2 = new FileInputStream(file2);
        FileInputStream fileInputStream3 = new FileInputStream(file3);
        FileOutputStream fileOutputStream1 = new FileOutputStream(file1);
        FileOutputStream fileOutputStream1Append = new FileOutputStream(file3, true);


        if (fileInputStream2.available() > 0) {
            byte[] buffer2 = new byte[fileInputStream2.available()];
            int count2 = fileInputStream2.read(buffer2);
            fileOutputStream1.write(buffer2, 0, count2);
            byte[] buffer3 = new byte[fileInputStream3.available()];
            int count3 = fileInputStream3.read(buffer3);
            fileOutputStream1Append.write(buffer3, 0, count3);
        }

        consoleReader.close();
        fileInputStream2.close();
        fileInputStream3.close();
        fileOutputStream1.close();
        fileOutputStream1Append.close();
    }
}
