package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = consoleReader.readLine();

        if (args.length > 0) {

            BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName, true));

            ArrayList<String> lines = new ArrayList<>();

            while (fileReader.ready()) {
                String line = fileReader.readLine();
                int idFromLine = Integer.parseInt(line.substring(0, 8).trim());
                int idFromArgs = Integer.parseInt(args[1]);
                if (idFromArgs == idFromLine) {
                    if (args[0].equals("-d")) {
                        continue;
                    } else if (args[0].equals("-u")) {
                        String temp = args[1] + "        ";
                        String id = temp.substring(0, 8);
                        temp = args[2] + "                              ";
                        String productName = temp.substring(0, 30);
                        temp = args[3] + "        ";
                        String price = temp.substring(0, 8);
                        temp = args[4] + "    ";
                        String quantity = temp.substring(0, 4);

                        String product = id + productName + price + quantity;
                        lines.add(product);
                    }
                } else {
                    lines.add(line);
                }
            }

            PrintWriter printWriter = new PrintWriter(fileName);
            printWriter.close();

            fileWriter.write(lines.get(0));
            for (int i = 1; i < lines.size(); i++) {
                fileWriter.write("\n" + lines.get(i));
            }

            fileReader.close();
            fileWriter.close();
        }
        consoleReader.close();

    }
}
