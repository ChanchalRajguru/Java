package com.upcasting_and_downcasting;

class Machine{
    public void start(){
        System.out.println("Machine started");
    }
    public void stop(){
        System.out.println("Machine stopped.");
    }
}

class Camera extends Machine{
    public void start(){
        System.out.println("Camera started.");
    }

    public void snap(){
        System.out.println("Photo taken.");
    }
}


public class App {
    public static void main(String[] args) {
        Machine machine1 =  new Machine();
        Camera camera1 =  new Camera();

        machine1.start();

        camera1.start();
        camera1.snap();

        //Upcasting
        Machine machine2 = camera1;
        System.out.println("\nUpcasting output below:");
        machine2.start();
        machine2.stop();

        //--wont work
        //machine2.snap();

        //Downcasting
        Machine machine3 = new Camera();
        Camera camera2 = (Camera)machine3;
        System.out.println("\nDowncasting output below:");
        camera2.start();
        camera2.snap();
        camera2.stop();

        //Wont work - throws runtime error
        /*Doesn't work as objects cannot be changed from one object to another, they remain what they are.*/
        Machine machine4 = new Machine();
        Camera camera3 = (Camera)machine4;
        camera3.start();
        camera3.snap();

    }
}
