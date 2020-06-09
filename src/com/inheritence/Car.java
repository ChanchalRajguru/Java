package com.inheritence;

public class Car extends Machine {
    public void wipeWindShield(){
        System.out.println("Wiping wind shield.");
    }

    public void showInfo(){
        System.out.println("Car type: " + type);
    }
}
