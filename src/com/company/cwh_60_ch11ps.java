package com.company;

abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    @Override
    void write() {
        System.out.println("write");
    }
    @Override
    void refill() {
        System.out.println("refill");
    }
    void changeNib(){
        System.out.println("Changing the Nib");
    }
}

class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting... ");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Speaking...");
    }
    @Override
    public void eat() {
        System.out.println("Eating");
    }
    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}

abstract class TelePhone{
    abstract public void ring();
    abstract public void lift();
    abstract public void disconnect();
}
class SmartTelephone extends TelePhone{
    public void music(){
        System.out.println("Music");
    }
    @Override
    public void ring() {
        System.out.println("Ringing...");
    }
    @Override
    public void lift() {
        System.out.println("Lifting...");
    }
    @Override
    public void disconnect() {
        System.out.println("Disconnecting...");
    }
}

interface TVRemote{
    void powerButton();
    void VolumeUP();
    void VolumeDOWN();
}
interface SmartTVRemote extends TVRemote {
    void ChannelUP();
    void ChannelDOWN();
}

class TV implements SmartTVRemote {
    @Override
    public void powerButton() {
        System.out.println("Power Button");
    }
    @Override
    public void VolumeUP() {
        System.out.println("Volume UP");
    }
    @Override
    public void VolumeDOWN() {
        System.out.println("Volume DOWN");
    }
    @Override
    public void ChannelDOWN() {
        System.out.println("Channel DOWN");
    }
    @Override
    public void ChannelUP() {
        System.out.println("Channel UP");
    }
}

public class cwh_60_ch11ps {
    static void main(String[] args) {
        // Problem 1 & 2
        /*
        FountainPen pen = new FountainPen();
        pen.changeNib();
        pen.refill();
        pen.write();

         */

        // Problem 3
        Human human = new Human();
        human.eat();
        human.sleep();
        human.jump();
        human.bite();

        // Problem 4
        TelePhone telephone = new SmartTelephone();
        telephone.ring();
        telephone.lift();
        telephone.disconnect();
        //telephone.music(); --> not allowed


        // Problem 5
        Monkey m1 = new Human();
        m1.bite();
        m1.jump();
        //m1.speak(); --> Cannot use speak method because the reference is monkey which does not have speak method
        //m1.eat(); --> Not allowed

        BasicAnimal lovish = new Human();
        // lovish.speak(); --> error
        lovish.eat();
        lovish.sleep();

        // Problem 6 & 7
        TV tv = new TV();
        tv.ChannelUP();
        tv.ChannelDOWN();
        tv.VolumeUP();
        tv.VolumeDOWN();
        tv.powerButton();


    }
}
