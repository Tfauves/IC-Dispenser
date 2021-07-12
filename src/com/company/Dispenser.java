package com.company;

public class Dispenser {

    public Hopper hopper03;


    public Dispenser(){
        hopper03 = new Hopper();
    }

    public void serveIceCream(String flavorName, double serveAmt) {
        hopper03.dispense(flavorName, serveAmt);
        System.out.printf("you served %.1foz of delicious %s ice cream.\n", serveAmt, flavorName);
    }

}
