package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = consoleReader.readLine();
        String file2 = consoleReader.readLine();
        BufferedReader file1Reader = new BufferedReader(new FileReader(file1));
        BufferedReader file2Reader = new BufferedReader(new FileReader(file2));
        String file1Line = file1Reader.readLine();

        while (file1Line != null) {
            allLines.add(file1Line);
            file1Line = file1Reader.readLine();
        }

        String file2Line = file2Reader.readLine();

        while (file2Line != null) {
            forRemoveLines.add(file2Line);
            file2Line = file2Reader.readLine();
        }
        consoleReader.close();
        file1Reader.close();
        file2Reader.close();

        new Solution().joinData();

    }

    public void joinData() throws CorruptedDataException {

        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}
