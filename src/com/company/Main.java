package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] words = new String[2][];
        System.out.println(words[0]);
        words[0] = new String[3];
        words[0][0] = "One";
        words[0][1] = "Two";
        words[0][2] = "three";
        System.out.println("words[0][0] = " + words[0][0]);
        System.out.println("words[0][1] = " + words[0][1]);
        System.out.println("words[0][2] = " + words[0][2]);
/*        int[][] grid = {
                {1, 2, 3, 4},
                {77, 88},
                {10000},
                {80, 60, 30, 10}
        };
//        System.out.println(grid[2][0]);
//        System.out.println(grid[3][1]);
//        System.out.println(grid[0][3]);
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println();
    }*/
/*
        String[][] texts = new String[2][3];
        texts[0][0] = "My Name";
        texts[0][1] = "is";
        texts[0][2] = "Chanchal";
*/
/*
        String[] names = new String[3];
        System.out.println(names[0]);
        names[0] = "one";
        System.out.println(names[0]);
*/
/*      String[] words = new String[3];

        words[0] = "Hello";
        words[1] = "to";
        words[2] = "you";

        System.out.println(words[2]);

        String[] cities = {"Pune", "Mumbai", "Nagpur","Delhi","Vietnam"};
        for(String city: cities){
            System.out.println(city);
        }*/
/*       int[] values = new int[3];
        System.out.println(values[0]);

        values[0] = 10;
        values[1] = 20;
        values[2] = 30;

        for(int i=0; i < values.length; i++){
            System.out.printf("The value is : %d\n", values[i]);
        }

        int[] numbers = {12,88,324,9,20};
        for(int i=0; i<numbers.length; i++){
            System.out.printf("the number is :%d\n", numbers[i]);
        }

        */
/*Scanner input = new Scanner(System.in);

        System.out.println("Please enter a command: ");
        String text = input.nextLine();

        switch (text){
            case "start":
                System.out.println("Machine started!");
                break;
            case "stop":
                System.out.println("Machine stopped");
                break;
            default:
                System.out.println("Command not recognized");
        }*/
/*
        Scanner scanner = new Scanner(System.in);
        int value =0;
        do {
            System.out.println("Enter a value: ");
            value = scanner.nextInt();
            System.out.println("You entered: " + value);
        }
        while(value!=5);
        System.out.println("Got 5!");
*/
/*int loop = 0;
        while(true){
            System.out.printf("Looping: %d\n", loop);
            loop++;
            if (loop==10){
                break;
            }
        }*/
    }
}