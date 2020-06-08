package com.company;

class Animal{
    private int id;
    private String name;

    public Animal(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        //This specifies how a string should look.
        return String.format("%-4d: %s ", id, name);
    }
}


public class toStringMethod {
    public static void main(String[] args) {
        Animal animal = new Animal(1,"Bob");
        System.out.println(animal);

        Animal animal1 =new Animal(2,"Seun");
        System.out.println(animal1);

    }
}
