package com.company;


public class cwh_35_practice_set_on_methods {
    static void multiplication(int n){
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d x %d = %d\n", n, i, n * i);
        }
    }

    static void pattern1(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
        System.out.print("\n");
        }
    }

    static void pattern1_rec(int n){
        if(n>0) {
            pattern1_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    // pattern1_rec(3)
    // pattern1_rec(2) + 3 times star and new line
    // pattern1_rec(1) + 2 times star and new line + 3 times star and new line
    // pattern1_rec(0) + 1 times star and new line + 2 times star and new line + 3 times star and new line

    static void pattern2(int n){
        for (int i = n; i > 0; i--){
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    static void pattern2_rec(int n){
        if(n>0) {
            for (int i = n; i > 0; i--){
                System.out.print("*");
            }
            System.out.print("\n");
            pattern2_rec(n - 1);
        }
    }


    // sum(n) = 1 + 2 + 3... + n
    // sum(n) = 1 + 2 + 3... + n-1 + n
    // sum(n) = sum(n-1) + n
    static int sumRecursive(int n){
        // Base Condition
        if (n == 1) {
            return 1;
        }
        else {
            return n + sumRecursive(n-1);
        }
    }

    static int sumIterative(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        else  {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }

    static float avg(float ...arr){
        float result = 0;
        for (float a : arr) {
            result += a;
        }
        return result/arr.length;
    }

    static void celsiustofahrenheit(float n){
        System.out.println((n*1.8f) + 32 + "°F");
    }

    static void main(String[] args) {
        // Problem-1
        // multiplication(8);

        // Problem-2
        // pattern1(4);

        // Problem-3
        // System.out.println(sumRecursive(11));

        // Problem-4
        // pattern2(4);

        // Problem-5
        // Fibonacci series=  0, 1, 1, 2, 3, 5, 8
        // System.out.println(fibonacci(6));

        // Problem-6
        // System.out.println(avg(5,6,8,3,24,66));

        // Problem-7
        // pattern2_rec(4);

        // Problem-8
        // pattern1_rec(4);

        // Problem-9
        // celsiustofahrenheit(23);

        // Problem-10
        // System.out.println(sumIterative(10));


    }
}
