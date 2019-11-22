package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            String line = fileScanner.nextLine();
            String[] person = line.split("\\s+", 4);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy");
            Date bd = simpleDateFormat.parse(person[3]);
            return new Person(person[1], person[2], person[0], bd);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
