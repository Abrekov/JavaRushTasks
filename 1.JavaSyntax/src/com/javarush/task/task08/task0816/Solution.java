package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Петров", dateFormat.parse("JUNE 1 2000"));
        map.put("Сидоров", dateFormat.parse("JULY 1 2018"));
        map.put("Путин", dateFormat.parse("AUGUST 1 2019"));
        map.put("Давыдов", dateFormat.parse("SEPTEMBER 1 2015"));
        map.put("Горбачев", dateFormat.parse("OCTOBER 1 2016"));
        map.put("Шварцнейгер", dateFormat.parse("NOVEMBER 1 2013"));
        map.put("Абреков", dateFormat.parse("DECEMBER 1 2017"));
        map.put("Клянин", dateFormat.parse("JANUARY 1 2009"));
        map.put("Имбирь", dateFormat.parse("MARCH 1 2010"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            Date date = pair.getValue();
            LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int month = localDate.getMonthValue();
            if (month > 5 && month < 9) {
                iterator.remove();
            }
        }

    }

    public static void main(String[] args) throws ParseException {

//        Map<String, Date> map = createMap();
//        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<String, Date> pair = iterator.next();
//            String key = pair.getKey();
//            String value = pair.getValue().toString();
//            System.out.println(key + " : " + value);
//        }

    }
}
