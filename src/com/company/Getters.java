package com.company;

class Student{
    String name;
    String lastName;
    int age;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}

public class Getters {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "John";
        student1.age = 10;
        student1.lastName = "Bloggs";

        System.out.println("Student name = " + student1.getName() +
                "\tage = " + student1.getAge() +
                "\tlast name = " + student1.getLastName());
    }
}
