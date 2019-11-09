package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat inputDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date inputDate = inputDateFormat.parse(reader.readLine());

        DateFormat outputDateFormat = new SimpleDateFormat("MMM dd',' yyyy", Locale.ENGLISH);
        System.out.println(outputDateFormat.format(inputDate).toUpperCase());
    }
}
