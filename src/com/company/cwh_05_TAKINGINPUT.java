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

       // In Java, sc.hasNext() and sc.next() are methods of the Scanner class used to read input data token by token.
  /*    1. sc.hasNext()
        This method is a "checker." It looks ahead to see if there is any more data to read without actually consuming it.
                Returns: A boolean (true if there is another token, false otherwise).
        Behavior: It does not advance the scanner past any input. It simply checks the availability of the next "token" (a sequence of characters separated by whitespace like spaces, tabs, or newlines).
        Usage: Commonly used in while loops to prevent errors when the end of the input is reached.
        2. sc.next()
        This method is an "extractor." It actually grabs the next piece of data from the input stream.
        Returns: A String containing the next complete token.
                Behavior: It reads characters until it hits a delimiter (usually a space) and then advances the scanner past that token.
        Exception: If you call next() when no more data is available, it throws a NoSuchElementException.

   */

//        Example Usage
//        In this example, sc.hasNext() ensures the loop continues as long as words exist,
//        and sc.next() pulls them out one by one ("Hello", then "World", then "Java").
        /*
        import java.util.Scanner;

        public class Example {
            public static void main(String[] args) {
                Scanner sc = new Scanner("Hello World Java");

                // Use hasNext() to check if data is available
                while (sc.hasNext()) {
                    // Use next() to retrieve and print the word
                    String word = sc.next();
                    System.out.println(word);
                }
                sc.close();
            }
        }

         */




      /*  Simple Rule

        Every time you use nextInt() or nextDouble() before a nextLine(), you must add an extra sc.nextLine() in between to throw away the leftover \n.

        Think of it like finishing a meal — sc.nextLine() is just cleaning the plate before serving the next dish.

       */
        /*
        Scanner sc = new Scanner(System.in);

//      Buffer looks like this: 45\n3.1415\nWelcome to HackerRank's Java tutorials!\n

        int i = sc.nextInt();         // reads 45,     buffer: \n3.1415\nWelcome to HackerRank's Java tutorials!\n
        double d = sc.nextDouble();   // reads 3.1415, buffer: \nWelcome to HackerRank's Java tutorials!\n
        sc.nextLine();                // flushes \n,   buffer: Welcome to HackerRank's Java tutorials!\n
        String s = sc.nextLine();     // reads string, buffer: empty

//      NOTE: Always add sc.nextLine() after nextInt() or nextDouble()
//      before using nextLine(), otherwise it reads empty string

//      Input:
//      45
//      3.1415
//      Welcome to HackerRank's Java tutorials!

//            Output:
//      String: Welcome to HackerRank's Java tutorials!
//      Double: 3.1415
//      Int: 45

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

         */
    }
}
