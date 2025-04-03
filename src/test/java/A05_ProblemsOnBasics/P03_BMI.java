package A05_ProblemsOnBasics;

import java.util.Scanner;

public class P03_BMI {

    public static void main(String[] args) {

        /*
        <20 - underweight
        20-25 - normal weight
        25-30 - over weight
        >30 - obese
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your BMI: ");
        int bmi = scanner.nextInt();

        if(bmi<20){
            System.out.println("You are under weight");
        } else if (bmi>=20 && bmi<=25) {
            System.out.println("you are normal weight");
        } else if (bmi>25 && bmi<=30) {
            System.out.println("You are over weight");
        } else {
            System.out.println("You are obese");
        }
    }
}
