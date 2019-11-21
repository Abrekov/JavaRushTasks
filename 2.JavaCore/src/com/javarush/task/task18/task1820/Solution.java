package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = consoleReader.readLine();
        String file2 = consoleReader.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(file1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file2));

        String str;
        ArrayList<String> list = new ArrayList<>();
        while ((str = fileReader.readLine()) != null) {
            String[] strNum = str.split("\\s+");
            list.addAll(Arrays.asList(strNum));
        }

        for (String num: list) {
            double dNum = Double.parseDouble(num);
            long iNum = Math.round(dNum);
            fileWriter.write(iNum + " ");
        }


        consoleReader.close();
        fileReader.close();
        fileWriter.close();
    }
}
