package com.company;

public class cwh_18_elseif {
    static void main(String[] args) {
       String var = "Shubham";
        switch (var){
            case "Shubham":
                System.out.println("You are going to become an Adult!");
                break;
            case "Saurabh":
                System.out.println("You are going to join a job!");
                break;
            case "Vishaka":
                System.out.println("You are going to get retired!");
                break;
            default:
                System.out.println("Enjoy your life");
        }
        System.out.println("Thanks for using my Java Code!");

//      ENHANCED SWITCH
        switch (var) {
            case "Shubham" -> {
                System.out.println("You are going to become an Adult!");
                System.out.println("You are going to become an Adult!");
                System.out.println("You are going to become an Adult!");
            }
            case "Saurabh" -> System.out.println("You are going to join a job!");
            case "Vishaka" -> System.out.println("You are going to get retired!");
            default -> System.out.println("Enjoy Your life!");
        }
        System.out.println("Thanks for using my Java Code!");
        /*
        int age = 56;
        System.out.println("Enter Your Age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age>56){
            System.out.println("You are experienced!");
        }
        else if (age>46) {
            System.out.println("You are semi-experienced!");
        }
        else if (age>36) {
            System.out.println("You are semi-semi-experienced!");
        }
        else{
            System.out.println("You are not experienced!");
        }
        if(age>2){
            System.out.println("You are not a baby!");
        }

         */
    }
}
