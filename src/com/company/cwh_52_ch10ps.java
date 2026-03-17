package com.company;

class Circle1{
    public int radius;
    Circle1(){
        System.out.println("I am non param of circle");
    }
    Circle1(int radius) {
        System.out.println("I am circle parameterized constructor with radius : " + radius);
        this.radius = radius;
    }

    public double area(){
        return Math.PI*radius*radius;
    }
}

class Cylinder1 extends Circle1{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am cylinder1 parameterized constructor with height : " + h);
        this.height = h;
    }
    @Override
    public double area() {
        return (2*Math.PI*radius*height) + (2*Math.PI*radius*radius);
    }

    public double volume(){
        return Math.PI*radius*radius*height;
    }
}

class Rectangle1{
    public int length;
    public int width;

    Rectangle1(int length, int width) {
        System.out.println("I am rectangle parameterized constructor");
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double area(){
        return length*width;
    }
    public double perimeter(){
        return 2*(length+width);
    }
}

class Cuboid extends Rectangle1{
    public int height;

    Cuboid(int length, int width, int height) {
        super(length, width);
        System.out.println("I am cuboid parameterized constructor");
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double TotalSurfaceArea(){
        return 2*((length*width) + (length*height) + (width*height));
    }
    public double Volume(){
        return length*width*height;
    }
    public double LateralSurfaceArea(){
        return 2*height*(length+width);
    }
    public double Perimeter(){
        return 4 * (length + width + height);
    }
}

public class cwh_52_ch10ps {
    static void main(String[] args) {
        // Problem 1 and Problem 3
        //Circle1 objc = new Circle1(12);
        //System.out.println("Area of Circle " + objc.area());
        //Cylinder1 obj = new Cylinder1(12 ,5);
        //System.out.println("Area of Cylinder : " + obj.area);
        //System.out.println("Volume of Cylinder : " + obj.volume());

        // Problem 2 and Problem 4
        //Rectangle1 rectangle1 = new Rectangle1(4,5);
        //System.out.println("Area of Rectangle : " + rectangle1.area());
        //System.out.println("Length of Rectangle : " + rectangle1.getLength());
        //System.out.println("Width of Rectangle : " + rectangle1.getWidth());
        //Cuboid cuboid = new Cuboid(3,4,5);
        //System.out.println("Length of Cuboid : " + cuboid.getLength());
        //System.out.println("Width of Cuboid : " + cuboid.getWidth());
        //System.out.println("Height of Cuboid : " + cuboid.getHeight());
        //System.out.println("LateralSurfaceArea of Cuboid : " + cuboid.LateralSurfaceArea());
        //System.out.println("TotalSurfaceArea of Cuboid : " + cuboid.TotalSurfaceArea());
        //System.out.println("Perimeter of Cuboid : " + cuboid.perimeter());
        //System.out.println("Volume of Cuboid : " + cuboid.Volume());

        // Problem 5
        //Firstly Base Constructor will execute then followed by Derived1 and then Derived2

    }
}
