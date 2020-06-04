package com.company;

class Robot {
    public void speak(String message) {
        System.out.println(message);
    }
    public void jump(int height){
        System.out.println("jump height = " + height);
    }

    public void move(String direction, double distance){
        System.out.println("Moving " + distance + " meters in direction " + direction);
    }
}

public class Robo {
    public static void main(String[] args) {
        Robot sam = new Robot();
        String greetings  ="Namaste! I can speak Hindi";
        sam.speak(greetings);
        sam.jump(7);
        sam.move("East",300);
    }
}
