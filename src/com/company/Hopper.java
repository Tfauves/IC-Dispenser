package com.company;

public class Hopper {
    public int fillLvl;

    public Hopper(int fillLvl) {
        this.fillLvl = fillLvl;
    }


    public void fill(String flavorName, int bagVol) {
        fillLvl += bagVol;

    }

    public void dispense(String flavor, int amt) {

        fillLvl -= amt;
        System.out.println(fillLvl);
    }

}
