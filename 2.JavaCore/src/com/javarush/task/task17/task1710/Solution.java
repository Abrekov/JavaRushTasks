package com.javarush.task.task17.task1710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws IOException, ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        switch (args[0]) {
            case "-c": {
                String name = args[1];
                String sex = args[2];
                Date bd = dateFormat.parse(args[3]);
                Person person;
                if (sex.equals("м")) {
                    person = Person.createMale(name, bd);
                } else {
                    person = Person.createFemale(name, bd);
                }
                allPeople.add(person);
                System.out.println(allPeople.size() - 1);
                break;
            }
            case "-u": {
                int id = Integer.parseInt(args[1]);
                String name = args[2];
                Sex sex;
                if (args[3].equals("м")) {
                    sex = Sex.MALE;
                } else {
                    sex = Sex.FEMALE;
                }
                Date bd = dateFormat.parse(args[4]);
                allPeople.get(id).setName(name);
                allPeople.get(id).setSex(sex);
                allPeople.get(id).setBirthDate(bd);
                break;
            }
            case "-d": {
                int id = Integer.parseInt(args[1]);
                allPeople.get(id).setName(null);
                allPeople.get(id).setSex(null);
                allPeople.get(id).setBirthDate(null);
                break;
            }
            case "-i": {
                int id = Integer.parseInt(args[1]);
                String name = allPeople.get(id).getName();
                String sex = allPeople.get(id).getSex().equals(Sex.MALE) ? "м" : "ж";
                SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                String bd = outputFormat.format(allPeople.get(id).getBirthDate());
                System.out.println(name + " " + sex + " " + bd);
                break;
            }
        }

    }
}
