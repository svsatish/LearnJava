package A05_ProblemsOnBasics;

import java.util.Scanner;

public class P02_CheckVoteEligibilityBasedOnAge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the age: ");
        int age = scanner.nextInt();

        if(age>18){
            System.out.println("Person is eligible to vote");
        } else {
            System.out.println("Person is not eligible to vote");
        }

    }
}
