package com.company;
import java.util.Scanner;

public class cwh_23_for_loop {
    static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }

//        2i = Even Numbers = 0,2,4,6,8
//        2i+1 = Odd Numbers = 1,3,5,7,9
//        int n = 5;
//        for (int i = 0; i < n; i++) {
//            System.out.println(2*i+1);
//        }

//        for (int i = 5; i > 0; i--) {
//            System.out.println(i);
//        }
//
//        for (int i = 5; i != 0; i--) {
//            System.out.println(i);
//        }

        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = scanner.nextInt();
        System.out.println("The first " + n + " natural numbers are:");
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }




    }
}
