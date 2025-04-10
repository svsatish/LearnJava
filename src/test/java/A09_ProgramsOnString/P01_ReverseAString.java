package A09_ProgramsOnString;

import java.util.Scanner;

public class P01_ReverseAString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a String: ");
        String str = scanner.next();

        reverseUsingNormalLoop(str);
        System.out.println();
        reverseUsingAtChar(str);
        reverseUsingStringBuilder(str);
        System.out.println();
        reverseUsingStringBuffer(str);
    }

    static void reverseUsingNormalLoop(String str){

        char[] chr = str.toCharArray();
        for(int i=chr.length-1; i>=0; i--){
            System.out.print(chr[i]);
        }
    }

    static void reverseUsingAtChar(String str){
        String rev = "";
        for(int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }

    static void reverseUsingStringBuilder(String str){
        StringBuilder sb = new StringBuilder(str);
        System.out.print(sb.reverse());
    }

    static void reverseUsingStringBuffer(String str){
        StringBuffer sb = new StringBuffer(str);
        System.out.print(sb.reverse());
    }
}
