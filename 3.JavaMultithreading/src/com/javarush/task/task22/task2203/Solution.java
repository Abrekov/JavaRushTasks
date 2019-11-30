package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if (string != null && !string.isEmpty()) {
            int tabs = string.length() - string.replaceAll("\t", "").length();
            if (tabs < 2) {
                throw new TooShortStringException();
            }
            int firstIndex = string.indexOf("\t") + 1;
            int endIndex = string.indexOf("\t", firstIndex);
            return string.substring(firstIndex, endIndex);
        } else {
            throw new TooShortStringException();
        }
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший\t сервис \tобучения Java\t."));
    }
}
