package com.company;

import java.util.Scanner;

public class cwh_06_11_CBSEBoardPercentageCalculator {
    static void main(String[] args) {
        System.out.println("Enter students marks : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of Mathematics");
        float a = sc.nextFloat();
        System.out.println("Enter marks of Physics");
        float b = sc.nextFloat();
        System.out.println("Enter marks of Chemistry");
        float c = sc.nextFloat();
        System.out.println("Enter marks of English");
        float d = sc.nextFloat();
        System.out.println("Enter marks of Hindi");
        float e = sc.nextFloat();
        float  Totalpercentage = (a+b+c+d+e)/5;
        System.out.println("Total percentage of Student : " + Totalpercentage);

    }
}
