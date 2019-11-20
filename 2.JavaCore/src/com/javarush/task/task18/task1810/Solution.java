package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String file = consoleReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(file);
        int sizeOfFile = fileInputStream.available();

        while (sizeOfFile >= 1000) {
            file = consoleReader.readLine();
            fileInputStream = new FileInputStream(file);
            sizeOfFile = fileInputStream.available();
        }

        consoleReader.close();
        fileInputStream.close();

        throw new DownloadException();

    }

    public static class DownloadException extends Exception {

    }
}
