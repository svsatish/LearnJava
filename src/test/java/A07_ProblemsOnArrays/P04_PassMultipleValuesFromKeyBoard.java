package A07_ProblemsOnArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P04_PassMultipleValuesFromKeyBoard {

    public static void main(String[] args) {

        int[] a = new int[5];

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<a.length; i++){
            System.out.print("Please enter a number: ");
            a[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(a));
    }
}
