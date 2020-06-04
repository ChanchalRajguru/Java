package com.company;

class Frog{
    private String name;
    private int age;

    // this refers to instance variable, An instance variable is the one belonging to a class or an object.(this.age)
    //age is a local variable whose scope is within the given method setAge.
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setInfo(String name, int age){
        setName(name);
        setAge(age);
    }
}

public class InstanceVariables {
    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.setAge(3);
        frog.setName("Bettie");

        Frog frog2  = new Frog();
        frog2.setInfo("Beetu", 8);

        System.out.println("The name is " + frog2.getName() + " and age is " + frog2.getAge());
        System.out.println("The name is " + frog.getName() + " and age is " + frog.getAge());
    }
}
