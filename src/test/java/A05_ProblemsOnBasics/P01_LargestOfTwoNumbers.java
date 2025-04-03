package A05_ProblemsOnBasics;

import java.util.Scanner;

public class P01_LargestOfTwoNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Please enter second number: ");
        int b = scanner.nextInt();

        findLargestUsingIfElse(a,b);
        findLargestUsingTernary(a,b);
    }

    static void findLargestUsingIfElse(int a, int b){
        if(a>b){
            System.out.println(a + " is largest");
        } else {
            System.out.println(b + " is largest");
        }
    }

    static void findLargestUsingTernary(int a, int b){
        int result = a>b ?a :b;
        System.out.println(result + " is largest number");
    }
}
