package com.javarush.task.task22.task2201;

public class StringForSecondThreadTooShortException extends RuntimeException {
    @Override
    public String getMessage() {
        return "java.lang.StringIndexOutOfBoundsException: String index out of range: -1";
    }
}
