package com.company;
import java.util.Scanner;

public class cwh_05_TAKINGINPUT {
    static void main(String[] args) {
        System.out.println("Taking Input from the User");
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number 1");
//        int a = sc.nextInt();
//        float a = sc.nextFloat();
//        System.out.println("Enter number 2");
//        int b = sc.nextInt();
//        float b = sc.nextFloat();
//        Double a = sc.nextDouble();

//        int sum = a + b;
//        float sum = a + b;
//        System.out.println("The sum of these numbers is");
//        System.out.println("sum");

//        boolean b1 = sc.hasNextInt();
//        System.out.printf(b1);
//        String str = sc.next();// -- It will print only first word.
        String str = sc.nextLine();// -- It will print whole line.
        System.out.println(str);

     /*   Every time you use nextInt() or nextDouble() before a nextLine(), you must add an extra sc.nextLine() in between to throw away the leftover \n.

                Think of it like finishing a meal — sc.nextLine() is just cleaning the plate before serving the next dish.
        Scanner sc = new Scanner(System.in);

// Buffer looks like this: 45\n3.1415\nWelcome to HackerRank's Java tutorials!\n

        int i = sc.nextInt();         // reads 45,     buffer: \n3.1415\nWelcome to HackerRank's Java tutorials!\n
        double d = sc.nextDouble();   // reads 3.1415, buffer: \nWelcome to HackerRank's Java tutorials!\n
        sc.nextLine();                // flushes \n,   buffer: Welcome to HackerRank's Java tutorials!\n
        String s = sc.nextLine();     // reads string, buffer: empty

// NOTE: Always add sc.nextLine() after nextInt() or nextDouble()
//       before using nextLine(), otherwise it reads empty string

// Input:
// 45
// 3.1415
// Welcome to HackerRank's Java tutorials!

// Output:
// String: Welcome to HackerRank's Java tutorials!
// Double: 3.1415
// Int: 45

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

      */


    }
}
