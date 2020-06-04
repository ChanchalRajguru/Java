package com.company;

class Thing{
    //This is an instance variable, there can be multiple copies of the instance variables
    public String name;

    //Static means the variable is static variable or a class variable
    //There is only one copy of the class variable
    public static String description;

    public void showName(){
        System.out.println(description + "; " +name);
    }

    public static void showInfo(){
        System.out.println(description);

        //Static methods cannot access instance variables as they require an class object for initialization.
//        System.out.println(name);
    }
}

public class Static {
    public static void main(String[] args) {
        Thing.description = "I am a thing";
//        System.out.println("thing2.description = " + thing2.description);
        Thing.showInfo();

        Thing thing1 = new Thing();
        thing1.name = "Bob";
//        System.out.println("thing1.name = " + thing1.name);
        
        Thing thing2 = new Thing();
        thing2.name = "Sue";
//        System.out.println("thing2.name = " + thing2.name);
        thing2.showName();



    }
}
