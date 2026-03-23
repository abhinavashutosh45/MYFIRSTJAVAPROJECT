package com.company;

interface Bicycle1 {
    int a = 45;
    void applyBrakes(int decrement);
    void speedUp(int increment);
}
interface Bicycle2 {
    int x = 45;
    void blowHornK3g();
    void blowHornmhn();
}
class RazorCycle implements Bicycle1, Bicycle2 {
    public int x = 55;
    @Override
    public void applyBrakes(int decrement) {
        System.out.println("Applying Brake");
    }
    @Override
    public void speedUp(int increment) {
        System.out.println("Applying SpeedUP");
    }
    @Override
    public void blowHornK3g() {
        System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
    }
    @Override
    public void blowHornmhn() {
        System.out.println("Main hoon naa po po po po");
    }
}

public class cwh_55_interfaces {
    static void main(String[] args) {
        RazorCycle cycleHarry = new RazorCycle();
        cycleHarry.applyBrakes(5);

        // YOU CAN CREATE PROPERTIES IN INTERFACES
        System.out.println(cycleHarry.a);
        System.out.println(cycleHarry.x);

        // YOU CANNOT MODIFY THE PROPERTIES IN INTERFACES AS THEY ARE FINAL
        // cycleHarry.a = 454;
        // System.out.println(cycleHarry.a);

        cycleHarry.blowHornmhn();
        cycleHarry.blowHornK3g();


    }
}
