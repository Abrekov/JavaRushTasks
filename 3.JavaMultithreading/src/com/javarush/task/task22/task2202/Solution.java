package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        if (string != null && !string.isEmpty()) {
            int spaces = string.length() - string.replaceAll(" ", "").length();
            if (spaces < 4) {
                throw new TooShortStringException();
            }
            try {
                int firstIndex = string.indexOf(" ") + 1;
                if (spaces == 4) {
                    return string.substring(firstIndex);
                } else {
                    int spaceCount = 0;
                    int indexCount = 0;
                    for (char ch : string.toCharArray()) {
                        if (ch == ' ') {
                            spaceCount++;
                            indexCount++;
                            if (spaceCount == 5) {
                                break;
                            }
                        } else {
                            indexCount++;
                        }
                    }
                    return string.substring(firstIndex, indexCount).trim();
                }
            } catch (RuntimeException e) {
                throw new TooShortStringException();
            }
        } else {
            throw new TooShortStringException();
        }
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
