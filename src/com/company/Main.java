package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dispenser softServe3000 = new Dispenser();
        Hopper hopper03 = new Hopper(3);
        Ice_Cream softServe = new Ice_Cream("tootti fruiti", 3);

        hopper03.fill(softServe.flavorName,softServe.bagVol);


        softServe3000.serveIceCream(softServe.flavorName,2);

    }
}
