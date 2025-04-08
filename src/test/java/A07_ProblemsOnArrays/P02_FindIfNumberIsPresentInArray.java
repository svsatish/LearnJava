package A07_ProblemsOnArrays;

import java.util.Scanner;

public class P02_FindIfNumberIsPresentInArray {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 7, 11, 45, 67, 89};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = scanner.nextInt();

        checkForElementInArray(num, arr);
    }

    static void checkForElementInArray(int num, int[] arr){

        boolean present= false;

        for(int x: arr){
            if(x==num){
                present = true;
                break;
            }
        }

        if(present){
            System.out.println(num + " is present in array");
        } else
            System.out.println(num + " is not present in array");
    }
}
