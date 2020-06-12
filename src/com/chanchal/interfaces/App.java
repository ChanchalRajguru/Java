package com.chanchal.interfaces;

public class App {
    public static void main(String[] args) {
        Machine machine = new Machine();
        machine.start();

        Person person = new Person("Bob");
        person.greet();

        Info info = new Machine();
        info.showInfo();

        Info info2  = person;
        person.showInfo();
        person.greet();


        //App class method
        System.out.println("\nApp class method  :");
        outputInfo(machine);
        outputInfo(info2);
    }

    private static void outputInfo(Info info){
        info.showInfo();
    }


}
