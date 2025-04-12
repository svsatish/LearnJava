package A09_ProgramsOnString;

import java.util.Scanner;

public class P03_ReverseWordsInAString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your first and last name: ");
        String str = scanner.nextLine();

        reverseWordsInAString(str);
    }

    static void reverseWordsInAString(String str){

        String words[] = str.split(" ");

        for(int i= words.length-1; i>=0; i--){
            System.out.print(words[i] + " ");
        }
    }
}
