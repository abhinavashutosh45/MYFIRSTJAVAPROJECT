package com.company;

abstract class Parent2{
    public Parent2(){
        System.out.println("Main Parent2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child2 extends Parent2{
    @Override
    public void greet() {
        System.out.println("Good morning");
    }
    @Override
    public void greet2() {
        System.out.println("Good afternoon");
    }
}

abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}

public class cwh_53_abstract {
    static void main(String[] args) {
        // Parent2 parent2 = new Parent2();  --error
     /*   Child2 child2 = new Child2();// -- allowed
        child2.greet();
        child2.greet2();
        child2.sayHello();

      */
        // Child3 child3 = new Child3(); --error
        Parent2 parent2 = new Child2(); // -- allowed
        parent2.greet();
        parent2.greet2();
        parent2.sayHello();

//        Parent2 parent3 = new Child3(); -- error


    }
}
