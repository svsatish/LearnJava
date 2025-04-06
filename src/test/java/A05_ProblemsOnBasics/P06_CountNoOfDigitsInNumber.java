package A05_ProblemsOnBasics;

import java.util.Scanner;

public class P06_CountNoOfDigitsInNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        countNoOfDigits(num);
    }

    static void countNoOfDigits(int num){
        int count=0;

        while(num!=0){
            num/=10;
            count++;
        }

        System.out.println("No of digit are: " + count);
    }
}
