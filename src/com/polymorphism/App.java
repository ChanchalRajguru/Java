package com.polymorphism;

public class App {
    public static void main(String[] args) {
        Plant plant1 = new Plant();
        Tree tree = new Tree();

        /*Because Tree is a Subclass of Plant so according to polymorphism,
        where-ever we use plant we can use tree*/
        Plant plant2 = tree; //plant1;
        //This is pointing at the method defined in tree.

        plant2.grow();

        //1. Wont work - because it is the type of the variable that decides which methods to call.
        //2. plant2 can only call the grow method as it is of type Plant and type tree
//        plant2.shedLeaves();


      tree.shedLeaves();

        /* Important:Whereever the the parent class is expected (plant)
        its child class can be used (tree) */
        doGrow(tree);
    }

    public static void doGrow(Plant plant){
         plant.grow();
    }

}
