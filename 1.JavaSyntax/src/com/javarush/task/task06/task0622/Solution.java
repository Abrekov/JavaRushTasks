package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        int n3 = Integer.parseInt(reader.readLine());
        int n4 = Integer.parseInt(reader.readLine());
        int n5 = Integer.parseInt(reader.readLine());

        int temp;

        for (int i = 0; i < 4; i++) {
            if (n1 > n2) {
                temp = n1;
                n1 = n2;
                n2 = temp;
            }
            if (n2 > n3) {
                temp = n2;
                n2 = n3;
                n3 = temp;
            }
            if (n3 > n4) {
                temp = n3;
                n3 = n4;
                n4 = temp;
            }
            if (n4 > n5) {
                temp = n4;
                n4 = n5;
                n5 = temp;
            }
        }

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);

    }


}
