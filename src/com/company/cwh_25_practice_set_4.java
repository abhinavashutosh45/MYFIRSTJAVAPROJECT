package com.company;

public class cwh_25_practice_set_4 {
    static void main(String[] args) {
        // Practice Problem 1
 /*     int n = 4;
        for (int i = n; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
         */
        // Practice Problem 2
/*
          (By using while loop)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of natural numbers:");
        int n = sc.nextInt();
        int sum = 0;
        int i = 0;
        while(i<n){
            sum += 2*i;  // or sum = sum + (2*i)
            i++;
        }
        System.out.println("Sum of even numbers is: "+sum);
        // First 4 even numbers are - 0 2 4 6


 */
 /*       (By using for loop)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of natural numbers:");
        int sum = 0;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sum = sum + 2*i;
        }
        System.out.println("Sum of even numbers is: "+sum);
        // First 4 even numbers are - 0 2 4 6

  */
        // Practice Problem 3
  /*    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of MULTIPLICATION TABLE");
        int n = sc.nextInt();
     // for (int i = 0; i < 10; i++) -->Goes from i=0 to i=9
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }

   */
        // Practice Problem 4
     /* Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of MULTIPLICATION TABLE : ");
        int n = sc.nextInt();
        for (int i = 10; i >= 1; i--) {
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }

      */
        // Practice Problem 5
        // What is factorial n = n * n-1 * n-2 .....1
        // 5! = 5*4*3*2*1 = 120
     /* Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number which you want to enter for factorial : ");
        int n = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n ; i++) {
            factorial*=i;
        }
        System.out.println(factorial);

      */

        // Practice Problem 6
     /* Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number which you want to enter for factorial : ");
        int n = sc.nextInt();
        int factorial = 1;
        int i = 1;
        while (i<=n){
            factorial = factorial * i;  // or factorial *= i
            i++;
        }
        System.out.println(factorial);

      */
        // Practice Problem 7
     /*   int rows = 4;
        int i = rows;
        while (i > 0) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.print("\n");
            i--;
        }

      */
        // Practice Problem 9
        int n = 8;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += n*i;
        }
        System.out.println(sum);
    }
}
