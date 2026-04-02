package com.company;

import java.util.Scanner;

public class cwh_81 {
    static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array Index : ");
        int arr_index = sc.nextInt();

        System.out.println("Enter the number you want to divide by : ");
        int number = sc.nextInt();
        try{
            System.out.println("The value at array index entered is: " + marks[arr_index]);
            System.out.println("The value at array-value/number is: " + marks[arr_index]/number);
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException occurred!");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurred!");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Some other exception occurred!") ;
            System.out.println(e);
        }
    }
}
