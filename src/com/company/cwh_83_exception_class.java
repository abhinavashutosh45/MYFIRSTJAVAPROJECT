package com.company;

import java.util.Scanner;

class MyException  extends Exception{
    @Override
    public String toString(){
        return "I am toString()";
    }
    @Override
    public String getMessage(){
        return "I am getMessage()";
    }
}
class MaxAgeException extends Exception{
    @Override
    public String toString(){
        return "Age cannot be greater than 125";
    }
    @Override
    public String getMessage(){
        return "Make sure that the value of age entered is correct";
    }
}

public class cwh_83_exception_class {
    static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a =sc.nextInt();
        if(a<9){
            try{
                throw new MyException();
                //throw new ArithmeticException("This is an Arithmetic Exception");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }

     /* ⚠️ Important Rule
        Any code written after throw inside the same block is dead code — it will never run:
        throw new MyException();
        System.out.println("Hello");  // ❌ This NEVER executes — unreachable code
      */
        //In short — throw is simply you saying "I've decided something is wrong here, stop everything and go to catch!"

     /*   🔹 Without throw — Java detects the error itself
        int a = 10 / 0;  // Java automatically throws ArithmeticException
        Here Java sees the division by zero and throws the exception on its own.
      */
        /*
        🔹 With throw — YOU decide when something is wrong
        if (age > 125) {
            throw new MaxAgeException();  // YOU are pulling the alarm
        }
        Java has no idea that age > 125 is wrong. Only YOUR business logic knows that. So you throw it manually.

         */

        /*

        🔹 The Syntax
        throw new SomeException();
//     ^^^
//     creates a new exception object and fires it immediately

        throw → the keyword that fires the exception
        new MyException() → creates the exception object to be thrown
        As soon as throw executes, code STOPS and jumps to the nearest catch block

     
         */

    }
}
