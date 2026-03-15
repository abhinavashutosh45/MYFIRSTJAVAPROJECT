package com.company;

class MyEmployee {
    private int id;
    private String name;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
}

class MyCircle{
    private double radius;

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
}

public class cwh_40_ch9 {
    static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
        // harry.id = 45; --> Theows an error due to private access modifier
        // harry.name = "CodeWithHarry"; --> Theows an error due to private access modifier
        harry.setName("CodeWithHarry");
        System.out.println(harry.getName());

        MyCircle myCircle = new MyCircle();
        myCircle.setRadius(5);
        System.out.println(myCircle.area());
        System.out.println(myCircle.perimeter());


    }
}
