package com.company;

public class cwh_85_finally {
    public static int greet(){
        try{
            int a = 50;
            int b = 10;
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Cleaning up resources...This is the end of this function");
        }
        return 0;
    }
    static void main(String[] args) {
        int k = greet();
        System.out.println(k);

        int a = 7;
        int b = 9;
        while (true){
            try {
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally {  // finally will execute definitely in any condition
                System.out.println("I am finally for value of b = " + b);
            }
            b--;
        }

        try{
           // System.out.println(5/0);
            System.out.println(5/5);
        }
        finally{
            System.out.println("Yes This is Finally");
        }


      /*  The finally Block in Java
        finally is a block that ALWAYS runs — no matter what happens — exception or no exception. */
/*
        🔹 Real Life Analogy
        You go to a restaurant:

        try     → you order food (might go wrong)
        catch   → if food is wrong, you complain
        finally → you ALWAYS pay the bill before leaving
                (whether food was good or bad!)
 */
        /*
        🔹 Basic Syntax
        try {
            // risky code
        }
        catch (Exception e) {
            // handle error
        }
        finally {
            // this ALWAYS runs, no matter what
        }
         */
       // 🔹 3 Scenarios — finally runs in ALL of them
                /*
        Scenario 1 — No exception occurs

        try {
            System.out.println("try block");       // ✅ runs
        }
        catch (Exception e) {
            System.out.println("catch block");     // ❌ skipped
        }
        finally {
            System.out.println("finally block");   // ✅ ALWAYS runs
        }

        Output:
        try block
        finally block

                 */
        /* Scenario 2 — Exception occurs
        try {
            int a = 10/0;                          // ❌ exception here
            System.out.println("try block");       // ❌ skipped
        }
        catch (Exception e) {
            System.out.println("catch block");     // ✅ runs
        }
        finally {
            System.out.println("finally block");   // ✅ ALWAYS runs
        }
        Output:
        catch block
        finally block
         */
      /* Scenario 3 — No catch block at all
        try {
            System.out.println("try block");       // ✅ runs
        }
        finally {
            System.out.println("finally block");   // ✅ ALWAYS runs
        }
       -->> catch is optional — finally works without it!
       */
        /*
        try     → "let me attempt this"
        catch   → "if it fails, do this"
        finally → "no matter what, ALWAYS do this"

         */

        /*The only time finally doesn't run is if you call--
         --System.exit() — that kills the entire program immediately! */


    }
}
