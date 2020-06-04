package com.company;

class Thing {
    //This is an instance variable, there can be multiple copies of the instance variables
    public String name;
    public static int count = 0;
    public int id;

    //Static means the variable is static variable or a class variable
    //There is only one copy of the class variable
    public static String description;

    //Constants are declared using final keyword and is all caps.
    public final static int LUCKY_NUMBER = 7;

    public Thing() {
        id = count;
        count++;
    }

    public void showName() {
        System.out.println("Object id: " + id + ", " + description + ": " + name);
    }

    public static void showInfo() {
        System.out.println(description);

        //Static methods cannot access instance variables as they require an class object for initialization.
//        System.out.println(name);
    }
}

public class Static {
    public static void main(String[] args) {
        Thing.description = "I am a thing";
        Thing.showInfo();

        System.out.println("Before creating objects the count is: " + Thing.count);

        Thing thing1 = new Thing();
        thing1.name = "Bob";
        thing1.showName();

        Thing thing2 = new Thing();
        thing2.name = "Sue";
        thing2.showName();

        System.out.println("After creating objects the count is: " + Thing.count);


        System.out.println(Math.PI);
        System.out.println(Thing.LUCKY_NUMBER);
    }
}