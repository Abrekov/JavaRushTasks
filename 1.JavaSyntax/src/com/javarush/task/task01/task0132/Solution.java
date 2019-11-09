package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int firstDigit = number / 100;
        int secondDigit = number % 100 / 10;
        int thirdDigit = number % 10;
        return firstDigit + secondDigit + thirdDigit;
    }
}