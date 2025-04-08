package A07_ProblemsOnArrays;

import java.util.Scanner;

public class P03_CountNoOfRepeatetionsOfNumberInArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = scanner.nextInt();

        int arr[] = {1,1,2,4,5,6,7,7,7,8,3};

        checkRepeatetions(num, arr);
    }

    static void checkRepeatetions(int num, int arr[]){

        int count =0;

        for(int x: arr){
            if(x==num){
                count++;
            }
        }

        System.out.println("The no of repeatetions of " + num + " is: " + count);
    }
}
