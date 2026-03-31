package com.company;

interface Bicycle {
    void applyBrakes(int decrement);
    void applyGears(int increment);
}

class AvonCycle implements Bicycle {
    int speed = 7;

    @Override
    public void applyBrakes(int decrement) {
        speed -= decrement; // or speed  = speed - decrement;
        System.out.println("After applying brakes speed : " + speed + "Km/h");
    }

    @Override
    public void applyGears(int increment) {
        speed += increment; // or speed  = speed + increment;
        System.out.println("After applying gears speed :  " + speed + "Km/h");
    }

}

public class cwh_54_interfaces {
    static void main(String[] args) {
        Bicycle b = new AvonCycle();
        b.applyBrakes(5);
        b.applyGears(5);


    }
}
