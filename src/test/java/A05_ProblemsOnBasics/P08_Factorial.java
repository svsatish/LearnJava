package A05_ProblemsOnBasics;

import java.util.Scanner;

public class P08_Factorial {

    public static void main(String[] args) {

        // Factorial = f(n) = f(n) * f(n-1) * f(n-2) *...f(1)

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = scanner.nextInt();

        printFactorial(num);
    }

    static void printFactorial(int num){

        // num=5

        int fact=1;
        for(int i=1; i<=num; i++){ // 5,4
            fact = fact * num; // 5,20
            num--;
        }
        System.out.println("Factorial is: " + fact);
    }
}
