package com.Casting;

public class App {
    public static void main(String[] args) {
        System.out.println(Byte.MAX_VALUE); //127
        System.out.println(Byte.MIN_VALUE); // -128

        int intValue = 888;
        long longValue = 234555;
        double doubleValue = 32.4;
        float floatValue = 8885.8f;
        byte byteValue = (byte) 300;

        intValue = (int) longValue;
        System.out.println("intValue = " + intValue);

        doubleValue = intValue;
        System.out.println("doubleValue = " + doubleValue);

        intValue = (int) floatValue;
        System.out.println("intValue = " + intValue);

        System.out.println("byteValue = " + byteValue);
    }
}
