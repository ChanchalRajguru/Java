package com.chanchal.accesscontrol;

import com.chanchal.accesscontrol.world.Plant;

public class App {

    public static void main(String[] args) {
        Plant plant = new Plant();
        System.out.println(plant.name);

        System.out.println(plant.ID);

        /*Wont Work - as height has package level visibility*/
        //System.out.println(plant.height);

    }
}
