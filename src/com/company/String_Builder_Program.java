package com.company;

public class String_Builder_Program {
    public static void main(String[] args) {
        /*Inefficient way ; as the string info is recreated every time the info+= is declared*/
        String info = "";
        info += "I am Bob.";
        info += " I am a Builder";
        System.out.println(info);

        /*Efficient as the string is getting appended without getting recreated*/
        StringBuilder sb = new StringBuilder(""); // Initialized to empty string
        sb.append("I am Sue.");
        sb.append(" ");
        sb.append("I am a lion tamer.");
        System.out.println("StringBuilder = " + sb.toString());

        //Another shortcut of doing it
        StringBuilder myInfo = new StringBuilder("");
        myInfo.append("My name is Roger")
                .append(" ")
                .append("I am a SkyDriver.");
        System.out.println("myInfo = " + myInfo.toString());

        //String Buffer is a Thread safe version of String Builder


    }
}
