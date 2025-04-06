package A05_ProblemsOnBasics;

import java.util.Scanner;

public class P07_FibonacciSeries {

    public static void main(String[] args) {

        // fibonacci - f(n) = f(n-1) + f(n-2)
        // 0 1 1

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number for Fibonacci series: ");
        int num = scanner.nextInt();

        printFibonacciSeries(num);
    }

    static void printFibonacciSeries(int num){

        int n1=0, n2=1, n3=0;

        System.out.print(n1 + " ");
        System.out.print(n2+ " ");

        for(int i=3; i<=num; i++){

            n3 = n1+n2;
            System.out.print(n3+ " ");
            n1=n2;
            n2=n3;
        }
    }
}
