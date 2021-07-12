package com.company;

public class Dispenser {

    public Hopper hopper03;


    public Dispenser(){
        hopper03 = new Hopper(3);
    }

    public void serveIceCream(String flavorName, int serveAmt) {
        hopper03.dispense(flavorName, serveAmt);
        System.out.printf("you served %doz of delicious %s ice cream.", serveAmt, flavorName);
    }

}
