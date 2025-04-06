package A05_ProblemsOnBasics;

import java.util.Scanner;

public class P05_PalindromeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Entered number is: " + num);

        palindromeCheck(num);
    }

    static void palindromeCheck(int num){

        int originalNum=num;
        int reverse=0;
        while (num!=0){
            reverse=reverse*10 + num%10;
            num/=10;
        }

        System.out.println("Reversed number is: " + reverse);

        if(reverse==originalNum)
            System.out.println("Entered number is Palindrome");
        else System.out.println("Entered number is NOT Palindrome");
    }
}
