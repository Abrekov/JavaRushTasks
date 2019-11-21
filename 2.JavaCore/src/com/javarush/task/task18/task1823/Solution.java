package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = consoleReader.readLine();
        while (!fileName.equals("exit")) {
            new ReadThread(fileName).start();
            fileName = consoleReader.readLine();
        }

        consoleReader.close();

    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            try {
                FileInputStream fileInputStream = new FileInputStream(fileName);
                byte[] buffer = new byte[fileInputStream.available()];
                int count = fileInputStream.read(buffer);
                Map<Byte, Integer> map = new HashMap<>();

                for (int i = 0; i < buffer.length; i++) {
                    byte key = buffer[i];
                    if (map.containsKey(key)) {
                        map.put(key, map.get(key) + 1);
                    } else {
                        map.put(key, 1);
                    }
                }

                int max = 1;
                byte maxKey = 0;
                for (Map.Entry<Byte, Integer> pair: map.entrySet()) {
                    byte key = pair.getKey();
                    int value = pair.getValue();
                    if (max < value) {
                        max = value;
                        maxKey = key;
                    }
                }

                resultMap.put(fileName, (int) maxKey);

                fileInputStream.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }
}
