package com.company;

class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Mukul...");
    }
}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Rectangle{
    int length,breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}

class Circle{
    double r;  // r--radius
    public double area(){
        return Math.PI*r*r;
    }
    public double perimeter(){
        return 2*Math.PI*r;
    }
}

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }

}

public class cwh_39_ch8ps {
    static void main(String[] args) {
        // Problem-1
    /*  Employee harry = new Employee();
        harry.setName("CodeWithHarry");
        harry.salary = 233;
        System.out.println(harry.getSalary());
        System.out.println(harry.getName());
     */

        // Problem-2
    /*  CellPhone apple = new CellPhone();
        apple.callFriend();
        apple.vibrate();
        apple.ring();
     */

        // Problem-3
    /*  Square sq = new Square();
        sq.side = 4;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

     */

        // Problem-4
    /*    Rectangle rectangle = new Rectangle();
        rectangle.length = 2;
        rectangle.breadth = 3;
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());

     */

        // Problem-5
     /*   Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();

      */
        // Problem-6
        Circle circle  = new Circle();
        circle.r = 4;
        System.out.println("Area :" + circle.area());
        System.out.println("Perimeter :" + circle.perimeter());
    }
}
