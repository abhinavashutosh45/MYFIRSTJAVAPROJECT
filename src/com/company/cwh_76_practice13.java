package com.company;

class Practice13 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Good Morning!");
        }
    }
}
class Practice13b extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(200);
            }catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println("Welcome!");
        }
    }
}

public class cwh_76_practice13 {
    static void main(String[] args) {
        // Problem -- 1/2/3/4/5
        Practice13 p1 = new Practice13();
        Practice13b p2 = new Practice13b();
        // p1.start();
        // p2.start();
        p1.setPriority(6);
        p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p1.getState());
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getState());
        // prints the state of the currently executing thread. In most typical scenarios, when this line is executed---
        // ---inside the main method (which runs on the "main" thread), the output will be RUNNABLE.

    }
}
