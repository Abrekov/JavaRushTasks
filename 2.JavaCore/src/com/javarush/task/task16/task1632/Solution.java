package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        class Thread1 implements Runnable {

            @Override
            public void run() {
                Thread thread = Thread.currentThread();
                while (!thread.isInterrupted()) {

                }
            }
        }

        class Thread2 implements Runnable {

            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        System.out.println("InterruptedException");
                        break;
                    }
                }
            }
        }

        class Thread3 implements Runnable {

            @Override
            public void run() {
                while (true) {
                    try {
                        System.out.println("Ура");
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        break;
                    }
                }
            }
        }

        class Thread4 extends Thread implements Message {
            boolean isCancel = false;
            @Override
            public void showWarning() {
                isCancel = true;
            }

            @Override
            public void run() {
                while (!isCancel) {

                }
            }
        }

        class Thread5 implements Runnable {

            @Override
            public void run() {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                Thread thread = Thread.currentThread();
                    try {
                        String str = reader.readLine();
                        int sum = 0;
                        while (!str.equals("N")) {
                            sum += Integer.parseInt(str);
                            str = reader.readLine();
                        }
                        System.out.println(sum);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        threads.add(new Thread(new Thread1()));
        threads.add(new Thread(new Thread2()));
        threads.add(new Thread(new Thread3()));
        threads.add(new Thread4());
        threads.add(new Thread(new Thread5()));

    }

    public static void main(String[] args) {

    }
}