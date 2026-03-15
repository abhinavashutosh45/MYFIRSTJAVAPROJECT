package com.company;

class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printMe(int x){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Animal{
    String eat, run,see;

    public String getEat() {
        return eat;
    }
    public void setEat(String eat) {
        this.eat = eat;
    }
    public String getRun() {
        return run;
    }
    public void setRun(String run) {
        this.run = run;
    }
    public String getSee() {
        return see;
    }
    public void setSee(String see) {
        this.see = see;
    }
}

class Dog extends Animal{
    String bark;

    public String getBark() {
        return bark;
    }
    public void setBark(String bark) {
        this.bark = bark;
    }
}
public class cwh_45_inheritance {
    static void main(String[] args) {
        // Creating an Object of base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        // Creating an Object of derived class
        Derived d = new Derived();
        d.setX(43);
        d.setY(54);
        System.out.println(d.getX());
        System.out.println(d.getY());

        // QUICK QUIZ
        // Creating an Object of Animal class
        Animal animal = new Animal();
        animal.setRun("Run");
        animal.setSee("See");
        animal.setEat("Eat");
        System.out.println(animal.getEat());
        System.out.println(animal.getRun());
        System.out.println(animal.getSee());

        // Creating an Object of Dog class
        Dog dog = new Dog();
        dog.setBark("Bark");
        dog.setEat("Eat");
        dog.setRun("Run");
        dog.setSee("See");
        System.out.println(dog.getBark());
        System.out.println(dog.getEat());
        System.out.println(dog.getRun());
        System.out.println(dog.getSee());

    }
}
