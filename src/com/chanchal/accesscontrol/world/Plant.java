package com.chanchal.accesscontrol.world;

public class Plant {
    //Bad practice to make variables public
    public String name;

    /*
        ########## Acceptable Practice ##################
        if you want the variables to be public, then one option is to make them
        static and constant
    */
    public final static int ID = 8;

    //Private variables can be accessed only within the class
    private String type;

    //protected can be accessed in class, its child/sub classes and within the package
    protected String size;

    int height = 9;

    public Plant() {
        this.name = "Freddy";
        this.type = "plant";
    }
}
