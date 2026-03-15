package com.company;
import java.util.Random;
import java.util.Scanner;

public class cwh_20_41_ROCK_PAPER_SCISSOR {
    static void main(String[] args) {
        // 0 FOR ROCK
        // 1 FOR SCISSOR
        // 2 FOR PAPER

        System.out.println("Enter 0 for ROCK,1 for PAPER,2 for SCISSOR!");
        Scanner sc = new Scanner(System.in);
        int user_Input = sc.nextInt();

        Random random = new Random();
        int computer_Input = random.nextInt(3);

        if(user_Input==computer_Input){
            System.out.println("DRAW!");
        } else if (user_Input==0 && computer_Input==2 || user_Input==1 && computer_Input==0 ||user_Input==2 && computer_Input==1) {
            System.out.println("You WIN!");
        }else {System.out.println("Computer WIN!");
        }
        System.out.println("Computer Input :" + computer_Input);
        if (computer_Input==0){
            System.out.println("Computer choice: ROCK");
        }
        else if (computer_Input==1){
            System.out.println("Computer choice: PAPER");
        }
        else if (computer_Input==2){
            System.out.println("Computer choice: SCISSOR");
        }
    }

}
