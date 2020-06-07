package com.company;

public class StringFormatter {
    public static void main(String[] args) {
        System.out.printf("The total amount is %d.", 5);

        //the value has 10 characters spacing, on the left
        System.out.printf("\nThe total amount is %10d.", 5);

        //the value has 10 characters spacing, on the right
        System.out.printf("\nThe total amount is %-10d.", 5);

        for(int i =0; i<14; i++){
            System.out.printf("\n%2d: Here is some text", i);
        }
        for(int i =0; i<14; i++){
            System.out.printf("\n%-2d: Another text", i);
        }
        System.out.println("The ");

    }
}
