package com.company;

import java.util.Scanner;

public class cwh_12_ps2 {
    static void main(String[] args) {
    //  Question1
        float a = 7/4.0f * 9/2.0f;
        System.out.println(a);

    //  Question2
        char grade = 'B';

    //  ENCRYPTING THE GRADE
        grade = (char) (grade + 8);
        System.out.println(grade);

    //  DECRYPTING THE GRADE
        grade = (char) (grade - 8);
        System.out.println(grade);

    //  QUESTION3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int z = sc.nextInt();
        System.out.println(z>8);

    //  QUESTION4
        float s = 0;
        float g = 0;
        float u = 0;
        float v = 0;
        float m = ( (v*v) - (u*u) )/ (2*g* v)  ;

    //  QUESTION5
        int x = 7;
        int f = ((7*49)/7) + (35/7);
        System.out.println(f);




    }
}
