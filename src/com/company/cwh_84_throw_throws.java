package com.company;

class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}

public class cwh_84_throw_throws {
    public static double area(double radius) throws NegativeRadiusException {
        if (radius < 0) {
            throw new NegativeRadiusException();
        }
        return Math.PI * radius * radius;
    }


    public static int divide(int a, int b) throws ArithmeticException {
        // Made By Harry
        int result = a/b;
        return result;
    }
    static void main(String[] args) {
        // Shivam --> uses divide function created by Harry
        try {
          /*  int c = divide(6,0);
            System.out.println(c); */
            double ar = area(5);
            System.out.println(ar);
        }
        catch (Exception e) {
           // throw new RuntimeException(e);
            System.out.println("Exception");
        }

    /*  throw    Inside a method         "I am firing this exception RIGHT NOW"
        throws   In method signature     "I am WARNING you — this method MIGHT throw an exception"

            🔹 Real Life Analogy
        Imagine Harry is a chef and Shivam is a customer.
        Harry (chef) writes on the menu:
        "This dish MAY contain nuts" → this is throws  (just a WARNING)

        While cooking, Harry actually adds nuts → this is throw  (actual action)

        Shivam reads the warning and keeps an antidote ready → this is try-catch
        
     */
    }
}
