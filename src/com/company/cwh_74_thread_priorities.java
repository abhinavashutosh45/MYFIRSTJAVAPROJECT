package com.company;

class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        int i = 34;
        while(true) {
            System.out.println("Thank You " + this.getName());
        }

    }
}

public class cwh_74_thread_priorities {
    static void main(String[] args) {
        // Ready Queue : T1 T2 T3 T4 T5
        MyThread t1 = new MyThread("T1");
        MyThread t2 = new MyThread("T2");
        MyThread t3 = new MyThread("T3");
        MyThread t4 = new MyThread("T4");
        MyThread t5 = new MyThread("T5 (most Important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }
}
