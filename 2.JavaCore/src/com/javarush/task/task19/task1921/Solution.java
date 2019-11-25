package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {

        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));

        while (fileReader.ready()) {
            String[] line = fileReader.readLine().split("\\s");
            StringBuilder name = new StringBuilder();
            StringBuilder birthday = new StringBuilder();
            for (String s : line) {
                if (s.matches("\\d+")) {
                    birthday.append(" " + s);
                } else {
                    name.append(" " + s);
                }
            }

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d M yyyy");
            Date birthDate = simpleDateFormat.parse(String.valueOf(birthday).trim());

            PEOPLE.add(new Person(String.valueOf(name).trim(), birthDate));
        }

        fileReader.close();

    }

}
