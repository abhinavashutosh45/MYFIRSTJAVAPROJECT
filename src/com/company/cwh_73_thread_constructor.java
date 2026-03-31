package com.company;

class MyThr extends Thread{
    public MyThr(String name) {
        super(name);
    }
    @Override
    public void run() {
        int i = 34;
        System.out.println("Thank You");
//        while(true){
//            System.out.println("I am a thread");
//        }
    }
}


class MyThr1 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is running inside the Runnable Task!");
    }
}

class MyThr2 implements Runnable{
    public MyThr2(String name) {super();}
    @Override
    public void run() {
        System.out.println("Thank You So Much");
    }
}


public class cwh_73_thread_constructor {
    static void main(String[] args) {
    /*    MyThr t1 = new MyThr("Harry Potter");
        MyThr t2 = new MyThr("Ram Candy");
        t1.start();
        t2.start();
        System.out.println("The id of the thread t1 is " + t1.getId());
        System.out.println("The name of the thread t1 is " + t1.getName());
        System.out.println("The id of the thread t2 is " + t2.getId());
        System.out.println("The name of the thread t2 is " + t2.getName());

     */

        // Thread (Runnable r) -- constructor
        MyThr1 myThr1 = new MyThr1();
        Thread thread1 = new Thread(myThr1);
        thread1.start();

       // Alternative: Using a Lambda (Modern Java)
       // If you don't want to create a separate class, you can pass the logic directly into the constructor using a Lambda expression:
        Thread thread = new Thread(() -> {
            System.out.println("Running via Lambda!");
        });
        thread.start();

        // Thread (Runnable r, String name) -- constructor
        MyThr2 myThr2 = new MyThr2("MyThr2");
        Thread thread2 = new Thread(myThr2);
        thread2.start();






    }
}
