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

        /*
        The Full Format Specifier Anatomy
        A complete specifier follows this pattern:
        % [argument_index$] [flags] [width] [.precision] conversion

        Flags: Modify the output style.
        -: Left-justifies the output (default is right).
        +: Prefixes positive numbers with a + sign.
        0: Pads numbers with leading zeros.
        ,: Adds a thousands grouping separator (e.g., 1,000)
        Width: The minimum number of characters the output should occupy. If the value is shorter, it adds spaces.
        Precision: Followed by a decimal point, it specifies how many digits to show after the decimal for floating-point numbers.

         */



/*        Formatting Decimals:
        System.out.printf("Value: %.2f%n", 12.3456); → Value: 12.35 (rounds to 2 decimal places).
        Creating Tables (Alignment):
        System.out.printf("%-10s %5d%n", "Apples", 5); → Apples 5 (String left-aligned in 10 spaces, integer right-aligned in 5 spaces).
        Zero Padding:
        System.out.printf("%03d%n", 7); → 007 (pads the number to 3 total digits).
        Grouping Large Numbers:
        System.out.printf("%,d%n", 1000000); → 1,000,000.

 */

    }
}
