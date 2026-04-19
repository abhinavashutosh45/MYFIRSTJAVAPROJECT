package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

class MyDeprecated{
    @Deprecated
    void meth1(){
        System.out.println("I am method 1");
    }
}
interface MyInt{
    void display();
}

public class cwh_112_ps {
    @SuppressWarnings("deprecation")
    static void main(String[] args) {
//        MyDeprecated obj = new MyDeprecated();
//        obj.meth1();

//        MyInt myInt = new MyInt() {
//            @Override
//            public void display() {
//                System.out.println("I am display");
//            }
//        };
        // or by lambda
//        MyInt i = () -> {
//            System.out.println("I am display");
//        };

        int m =5;
        String table = "";
        for (int j = 0; j < 10; j++) {
            table += m + "X"+(j+1) + "=" + m*(j+1);
            table += "\n";
        }
        try {
            FileWriter fileWriter = new FileWriter("MultiplicationTable.txt");
            fileWriter.write(table); 
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
