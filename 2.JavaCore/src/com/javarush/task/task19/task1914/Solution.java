package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.invoke.SwitchPoint;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream myStream = new PrintStream(outputStream);
        System.setOut(myStream);

        testString.printSomething();

        String result = outputStream.toString().trim() + " ";

        System.setOut(consoleStream);

        String[] partsOfExpression = result.split("\\s+");
        int operand1 = Integer.parseInt(partsOfExpression[0]);
        int operand2 = Integer.parseInt(partsOfExpression[2]);
        String operator = partsOfExpression[1];

        switch (operator) {
            case "+":
                System.out.println(result + (operand1 + operand2));
                break;
            case "-":
                System.out.println(result + (operand1 - operand2));
                break;
            case "*":
                System.out.println(result + (operand1 * operand2));
                break;
            default:
                break;
        }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

