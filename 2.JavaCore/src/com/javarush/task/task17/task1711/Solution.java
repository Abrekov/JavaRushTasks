package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        switch (args[0]) {
            case "-c": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 3) {
                        String name = args[i];
                        String sex = args[i + 1];
                        Date bd = dateFormat.parse(args[i + 2]);
                        Person person;
                        if (sex.equals("м")) {
                            person = Person.createMale(name, bd);
                        } else {
                            person = Person.createFemale(name, bd);
                        }
                        allPeople.add(person);
                        System.out.println(allPeople.size() - 1);
                    }
                }
                break;
            }
            case "-u": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 4) {
                        int id = Integer.parseInt(args[i]);
                        String name = args[i + 1];
                        Sex sex;
                        if (args[i + 2].equals("м")) {
                            sex = Sex.MALE;
                        } else {
                            sex = Sex.FEMALE;
                        }
                        Date bd = dateFormat.parse(args[i + 3]);
                        allPeople.get(id).setName(name);
                        allPeople.get(id).setSex(sex);
                        allPeople.get(id).setBirthDate(bd);
                    }
                }
                break;
            }
            case "-d": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        int id = Integer.parseInt(args[i]);
                        allPeople.get(id).setName(null);
                        allPeople.get(id).setSex(null);
                        allPeople.get(id).setBirthDate(null);
                    }
                }
                break;
            }
            case "-i": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        int id = Integer.parseInt(args[i]);
                        String name = allPeople.get(id).getName();
                        String sex = allPeople.get(id).getSex().equals(Sex.MALE) ? "м" : "ж";
                        SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                        String bd = outputFormat.format(allPeople.get(id).getBirthDate());
                        System.out.println(name + " " + sex + " " + bd);
                    }
                }
                break;
            }
        }

    }
}
