package com.company;

class Laptop{
    private String name;
    private int year;

//    Note: Don't call a constructor inside itself it will go into an infinite loop;
    public Laptop(){
        this("HP");
        System.out.println("first constructor running!");
    }

    public Laptop(String name){
        this("Mac",2020);
        System.out.println("second constructor running!");
        this.name = name;
    }

    public Laptop(String name, int year){
        System.out.println("third constructor running!");
        this.name = name;
        this.year = year;
    }
}
//Calling Constructors within Constructors.
public class Constructors2 {
    public static void main(String[] args) {
        new Laptop();
    }
}
