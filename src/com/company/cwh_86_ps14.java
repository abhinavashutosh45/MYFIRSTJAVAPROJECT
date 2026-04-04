package com.company;

import java.util.Scanner;

class CustomException extends Exception {
    @Override
    public String getMessage() {
        return "Max retries reached! Program terminated.";
    }
}

// getMarks() moved INSIDE the class ✅
public class cwh_86_ps14 {

    static void getMarks() throws CustomException {
        boolean flag = true;
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;

        while (flag && i < 5) {
            try {
                System.out.println("Enter the value of index : ");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                return;
            } catch (Exception e) {
                System.out.println("Invalid Index");
                i++;
            }
        }

        if (i >= 5) {
            throw new CustomException();
        }
    }

    static void main(String[] args) {
        // Problem 1
        // Syntax Error - int a = 7
       /* int age = 78;
        int year_born = 2000-78; // Logical error
        System.out.println(6/0);
        */

        // Problem 2
        /*
        try {
            int a = 666/0 ;
        }
        catch(IllegalArgumentException e){
            System.out.println("HeHe");
        }
        catch(ArithmeticException e){
            System.out.println("Haha");
        }

         */

        // Problem 3

//        boolean flag = true;
//        int [] marks = new int[3];
//        marks[0] = 7;
//        marks[1] = 56;
//        marks[2] = 6;
//        Scanner sc = new Scanner(System.in);
//        int index;
//        int i = 0;
//        while (flag && i < 5) {
//            try {
//                System.out.println("Enter the value of index : ");
//                index = sc.nextInt();
//                System.out.println("The value of marks[index] is " + marks[index]);
//                break;
//            } catch (Exception e) {
//                System.out.println("Invalid Index");
//                i++;
//            }
//        }
//       /* if (i>=5){                    ---
//            System.out.println("Error");   ---> For Question 3
//        } */                            ---
//        For Question 4
//        if (i >= 5) {
//            try {
//                throw new customException();  // only change here
//            } catch (customException ex) {
//                System.out.println(ex.getMessage());
//            }
//        }
//
      // Problem 5
        try {
            getMarks();
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }


    }
}
