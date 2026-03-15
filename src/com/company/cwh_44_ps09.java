package com.company;

class Cylinder{
    private int radius;
    private int height;

    // Using Constructor for Problem 3
    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea(){
        return (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
    }

    public double Volume(){
        return Math.PI * radius * radius * height;
    }
}

class MyRectangle {
    private int length;
    private int breadth;

    public MyRectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public MyRectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

       public int getBreadth() {
        return breadth;
    }
}

class Sphere{
    private int Radius;

    //Using Constructor also


    public Sphere(int radius) {
        Radius = radius;
    }

    public int getRadius() {
        return Radius;
    }

    public void setRadius(int Radius) {
        this.Radius = Radius;
    }

    public double surfaceArea(){
        return 4 * Math.PI * Radius * Radius;
    }

    public double Volume(){
        return ((double) 4 /3) * Math.PI * Radius * Radius * Radius;
    }


}


public class cwh_44_ps09 {
    static void main(String[] args) {
        /*
        // Problem-1
        Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(12);
        System.out.println("Height" + myCylinder.getHeight());
        myCylinder.setRadius(9);
        System.out.println("Radius" + myCylinder.getRadius());

         */

        /*
        // Problem-2
        Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(12);
        System.out.println("Height: " + myCylinder.getHeight());
        myCylinder.setRadius(9);
        System.out.println("Radius: " + myCylinder.getRadius());
        System.out.println("Surface Area: " + myCylinder.surfaceArea());
        System.out.println("Volume: " + myCylinder.Volume());

         */

        /*
        // Problem-3
        Cylinder myCylinder = new Cylinder(9,12);
        System.out.println("Radius: " + myCylinder.getRadius());
        System.out.println("Height: " + myCylinder.getHeight());

         */

        // Problem-4
        /*
        MyRectangle myRectangle = new MyRectangle();
        //MyRectangle myRectangle = new MyRectangle(5,8);
        System.out.println("Length: " + myRectangle.getLength());
        System.out.println("Breadth: " + myRectangle.getBreadth());

         */

        // Problem-5
        /*
        Sphere mySphere = new Sphere();
        mySphere.setRadius(5);
        System.out.println("Radius: " + mySphere.getRadius());
        System.out.println(mySphere.surfaceArea());
        System.out.println(mySphere.Volume());

         */
        Sphere mySphere = new Sphere(6);
        System.out.println("Radius: " + mySphere.getRadius());
        System.out.println(mySphere.surfaceArea());
        System.out.println(mySphere.Volume());

    }
}
