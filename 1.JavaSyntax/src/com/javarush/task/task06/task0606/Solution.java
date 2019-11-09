package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(b.readLine());
        int q = n;
        int r = 0;
        do {
            r = q % 10;
            if (r % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            q = q / 10;
        } while (q != 0);
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
