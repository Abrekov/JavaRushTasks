package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {

        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream myStream = new PrintStream(outputStream);
        System.setOut(myStream);

        testString.printSomething();

        String result = outputStream.toString();

        System.setOut(consoleStream);

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = consoleReader.readLine();
        BufferedOutputStream fileWriter = new BufferedOutputStream(new FileOutputStream(fileName));
        fileWriter.write(result.getBytes());

        System.out.println(result);

        consoleReader.close();
        fileWriter.close();

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

