package com.company;

import java.lang.reflect.Array;

public class cwh_32_method_overloading {
    static void foo(){
        System.out.println("Good Morning bro!");
    }
    static void foo(int a){
        System.out.println("Good Morning " + a + " bro!");
    }
    static void foo(int a, int b){
        System.out.println("Good Morning " + a + " bro!");
        System.out.println("Good Morning " + b + " bro!");
    }
    static void change(int a){
        a = 98;
    }
    static void change2(int [] arr){
        arr[0] = 98;
    }
    static void tellJoke(){
        System.out.println("I invented a new word!\n" +
                "Plagiarism!");
    }

    public static void main(String[] args) {
        //tellJoke();

        /*
        Case 1: Changing the integer
        int x = 45;
        change(x);
        System.out.println("The value of x after running change is : " + x);
        */

        /*Case 2: Changing the Array
        int [] marks = {52, 73, 77, 89, 98, 94};
        change2(marks);
        System.out.println("The value after running change is : " + marks[0]);
        */

        // Method Overloading
        foo();
        foo(3000);
        foo(3000,4000);
        //  Arguments are actual!
    }
}
