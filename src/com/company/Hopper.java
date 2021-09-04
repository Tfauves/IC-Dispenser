package com.company;

    public class Hopper {
    public double fillLvl;

    public Hopper(double fillLvl) {
        this.fillLvl = fillLvl;
    }

    public void fill(String flavorName, double bagVolGal) {
        double toOunces = 128;
        double bagGalToOunces = bagVolGal * toOunces;
        fillLvl += bagGalToOunces;
//        System.out.println(fillLvl);

    }

    public void fill(Ice_Cream ice_cream ) {
        double toOunces = 128;
        double bagGalToOunces = ice_cream.bagVol * toOunces;
        fillLvl += bagGalToOunces;
//        System.out.println(fillLvl);

    }



//    public void fill(String flavorName, int bagVol) {
//        fillLvl += bagVol;
//
//    }

    public void dispense(String flavor, double amt) {

        fillLvl = fillLvl - amt;
        System.out.println("Current amount left to serve: \n" + fillLvl);
    }

}
