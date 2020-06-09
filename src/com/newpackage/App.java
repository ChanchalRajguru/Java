package com.newpackage;
//One way to import
//import com.ocean.Fish;
//import com.ocean.plants.Seaweed;

//Imports all classes from the 'ocean' package.
import com.ocean.*;

//Import a package(plants) from within a package(ocean).
import com.ocean.plants.Seaweed;

public class App {
    Fish fish = new Fish();
    Seaweed seaweed = new Seaweed();
}
