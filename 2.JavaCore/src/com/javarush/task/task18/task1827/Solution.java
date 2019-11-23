package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = consoleReader.readLine();

        if (args.length > 0) {

            BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName, true));

            int maxId = 0;
            while (fileReader.ready()) {
                int id = Integer.parseInt(fileReader.readLine().substring(0, 8).trim());
                if (maxId < id) {
                    maxId = id;
                }
            }

            String s = ++maxId + "        ";
            String id = s.substring(0, 8);
            s = args[1] + "                              ";
            String productName = s.substring(0, 30);
            s = args[2] + "        ";
            String price = s.substring(0, 8);
            s = args[3] + "    ";
            String quantity = s.substring(0, 4);

            String product = "\n" + id + productName + price + quantity;
            fileWriter.write(product);

            consoleReader.close();
            fileReader.close();
            fileWriter.close();
        }

    }
}
