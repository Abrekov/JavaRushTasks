package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    public static void main(String[] args) {

    }

    private int field1;
    private double field2;
    private byte field3;
    private short field4;

    public Solution(int field1, double field2, byte field3, short field4) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
        this.field4 = field4;
    }

    private Solution(int field1, double field2, byte field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    protected Solution(int field1, double field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    Solution(int field1) {
        this.field1 = field1;
    }
}

