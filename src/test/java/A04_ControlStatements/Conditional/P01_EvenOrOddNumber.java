package A04_ControlStatements.Conditional;

import java.util.Scanner;

public class P01_EvenOrOddNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: " );
        int num = scanner.nextInt();

        if(num%2 ==0){
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
