package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        PrintStream systemout = System.out;

        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(stream);

        System.setOut(printStream);

        testString.printSomething();

        System.setOut(systemout);

        StringBuilder stringBuilder = new StringBuilder(stream.toString());
        String[] lines = stringBuilder.toString().split("\n");

        for (int i = 0; i < lines.length; i++) {
            if (i % 2 != 0) {
                System.out.println(lines[i]);
                System.out.println("JavaRush - курсы Java онлайн");
            } else {
                System.out.println(lines[i]);
            }
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
