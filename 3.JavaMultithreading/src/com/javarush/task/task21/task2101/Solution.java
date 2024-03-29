package com.javarush.task.task21.task2101;

import java.math.BigInteger;
import java.util.Arrays;

/*
Определяем адрес сети
*/
public class Solution {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {
        byte[] netAddress = new byte[4];
        netAddress[0] = (byte) (ip[0] & mask[0]);
        netAddress[1] = (byte) (ip[1] & mask[1]);
        netAddress[2] = (byte) (ip[2] & mask[2]);
        netAddress[3] = (byte) (ip[3] & mask[3]);
        return netAddress;

    }

    public static void print(byte[] bytes) {
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(String.format("%8s", Integer.toBinaryString(bytes[i] < 0 ? bytes[i] + 256 : bytes[i])).replace(" ", "0")+" ");
        }
    }


}
