package A09_ProgramsOnString;

import java.util.Scanner;

public class P04_PalindromeString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String str = scanner.nextLine();

        checkForPalindrome(str);
    }

    static void checkForPalindrome(String str){

        // reverse the string
        StringBuilder sb = new StringBuilder(str);
        String reverse = sb.reverse().toString();

        if(str.equals(reverse)) {
            System.out.println("Entered string is Palindrome");
        }else {
            System.out.println("Entered string is NOT Palindrome");
        }
    }
}
