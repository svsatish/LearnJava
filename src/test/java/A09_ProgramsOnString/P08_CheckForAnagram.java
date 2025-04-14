package A09_ProgramsOnString;

import java.util.Arrays;
import java.util.Scanner;

public class P08_CheckForAnagram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Please enter the first string: ");
        String str2 = scanner.nextLine();

        checkForAnagram(str1, str2);
    }

    static void checkForAnagram(String str1, String str2){

        // Anagram = Length & Characters are same but order may be different

        if(str1.length()==str2.length()){
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.equals(arr1,arr2)){
                System.out.println("The strings are Anagram");
            }
            else {
                System.out.println("The strings are NOT Anagram");
            }
        } else {
            System.out.println("The strings are NOT Anagram");
        }
    }
}
