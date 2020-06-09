package com.inheritence;

public class App {
    public static void main(String[] args) {
        //left-side of equals: creating an object of class
        //right-side of equals: allocating memory for the machine  object
        Machine machine = new Machine();

//        machine.start();
//        machine.stop();

        Car car = new Car();
        car.start();
        car.stop();
        car.wipeWindShield();

        car.showInfo();

    }
}