package com.company;

class Machine {
    private String name;
    private int code;

    //constructor is a special method which runs every time the instance of the class is created.
    //constructor does not have a return type
    public Machine() {
        System.out.println("Constructor running!");
        name = "Archie";
    }
    public Machine(String name){
        System.out.println("\nSecond Constructor running!");
        this.name = name;
        System.out.println("name = " + name);
    }

    public Machine(String name, int code){
        System.out.println("\nThird Constructor running!");
        this.name = name;
        this.code = code;
        System.out.println("name = " + name + ". Code = " + code);
    }

}


public class Constructor {
    public static void main(String[] args) {
        Machine machine1 = new Machine();

        // also a way to invoke a constructor;
        new Machine();

        Machine machine2 = new Machine("Bertie");

        Machine machine3 = new Machine("Ernest",2);




    }
}
