package com.company;

class Person {
    String name;
    int age;

    //Methods of a class are called Subroutines
    void speak() {
        for (int i = 0; i < 9; i++) {
            System.out.println("Hello! my name is " + name + " and I am " + age + " years old.");
        }

    }
}

class Salary {
    String companyName;
    int exp;
    double salary;

    double increment() {
        double salOffer = exp * salary / 2;
        return salOffer;
    }
}

public class App {
    public static void main(String[] args) {
        //Person
        Person person1 = new Person();
        person1.name = "Joe Bloggs";
        person1.age = 37;
//        System.out.println("person1 = " + person1.name + "\tage = " + person1.age);
        person1.speak();


        Person person2 = new Person();
        person2.name = "Sarah Smith";
        person2.age = 25;
//        System.out.println("person2 = " + person2.name + "\tage = " + person2.age);
//        person2.speak();


        //        Salary
    /*    Salary salary1 = new Salary();
    salary1.companyName = "Ericsson";
    salary1.exp = 5;
    salary1.salary = 50743.88;
        System.out.println("salary1 = " + salary1.companyName +
            "\t,exp = " + salary1.exp + "\t,salary = " + salary1.salary);
    double salOffered = salary1.increment();
        System.out.println("Salary Offered by " + salary1.companyName + " is " + salOffered);
*/
    }
}
