package com.inheritence;

public class Machine {
    //protected means can be accessed anywhere in the package and child classes.
    protected String type = "Machine type 1";

    public void start(){
        System.out.println("Machine Started!");
    }

    public void stop(){
        System.out.println("Machine stopped!");
    }
}
