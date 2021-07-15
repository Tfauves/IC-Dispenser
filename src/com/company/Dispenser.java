package com.company;

public class Dispenser {

    public Hopper hopper;


    public Dispenser(Hopper hopper){
        this.hopper = hopper;

    }

    public void serveIceCream(String flavorName, double serveAmt) {
        System.out.printf("you served %.1foz of delicious %s ice cream.\n", serveAmt, flavorName);
        hopper.dispense(flavorName, serveAmt);
    }

}
