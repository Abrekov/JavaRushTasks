package com.javarush.task.task22.task2211;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* 
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(args[0]);
        FileOutputStream fileOutputStream = new FileOutputStream(args[1]))
        {
            Charset windows1251 = Charset.forName("Windows-1251");
            Charset utf8 = StandardCharsets.UTF_8;
            byte[] buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer);
            String s = new String(buffer, windows1251);
            buffer = s.getBytes(utf8);
            fileOutputStream.write(buffer);

        } catch (IOException e) {

        }

    }
}
