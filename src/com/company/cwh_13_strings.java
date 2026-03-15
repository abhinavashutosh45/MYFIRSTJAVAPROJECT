package com.company;

import java.util.Scanner;

public class cwh_13_strings {
    static void main(String[] args) {
    //  String  name = new String("Harry");
    //  String name = "Harry";
    //  System.out.print("The name is : ");
    //  System.out.println(name);

        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and value of b is %f", a , b);
        System.out.format("The value of a is %d and value of b is %f", a , b);
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        System.out.println(st);

    }
}
