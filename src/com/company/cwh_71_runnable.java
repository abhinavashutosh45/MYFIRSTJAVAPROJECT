package com.company;

class MyThreadRunnable1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 999 ; i++) {
            System.out.println("I am a thread 1 not a threat 1");
        }
    }
}
class MyThreadRunnable2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 999 ; i++) {
            System.out.println("I am a thread 2 not a threat 2");
        }
    }
}

public class cwh_71_runnable {
    static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2  = new Thread(bullet2);

        gun1.start();
        gun2.start();

        // -- Runs concurrent
        // -- If we extend thread class we get a loaded gun(bullet = run method) ---
        // ---whereas if we implement runnable interface you have to load the gun with bullet(runnable class object).
        //Hope you get it ☺️

    }
}
