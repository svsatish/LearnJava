package A05_ProblemsOnBasics;

import java.util.Scanner;

public class P04_ReverseANumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = scanner.nextInt();

        reverseANumber(num);
    }

    static void reverseANumber(int num){
        // Approach 1 : Using String Builder
//        String str = String.valueOf(num);
//        StringBuilder stringBuilder = new StringBuilder(str);
//        System.out.println(stringBuilder.reverse());

        // Approach 2: Using loops
//        int reverse = 0;
//        for(; num!=0;){
//        reverse = num%10;
//        System.out.print(reverse);
//        num/=10;

        // Approach 3: Using recursion
        if(num==0) return;
        System.out.print(num%10);
        reverseANumber(num/10);
        }

    }
