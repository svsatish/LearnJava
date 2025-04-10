package A08_Strings;

import java.util.Arrays;

public class C02_InBuiltMethods {

    public static void main(String[] args) {

        // Length
        String str = "Learn Java";
        int len = str.length();
        System.out.println(len);

        int str2 = "To the core".length();
        System.out.println(str2);

        // Concat
        System.out.println("Using + : " + str+str2);
        System.out.println("Using Concat: " + str.concat(str));

        // trim
        String trim = "    How am I doing?  ";
        System.out.println(trim.length());
        System.out.println(trim.trim().length());

        // charAt
        char c = trim.trim().charAt(1);
        System.out.println(c);

        char[] arr = trim.toCharArray();
        for(char x: arr){
            System.out.print(x);
        }
        System.out.println();

        // contains - will return a boolean
        System.out.println(trim.contains("i"));

        // equals - return boolean
        System.out.println(trim.equals(str));

        // equalsIgnoreCase
        System.out.println(trim.trim().equalsIgnoreCase("HOW AM I DOING?"));

        // Content Equals
        System.out.println(str.contentEquals("Learn Java"));

        // replace
        System.out.println(str.replace("Java", "Python"));

        // Substring
        System.out.println(str.substring(0));
        System.out.println(str.substring(0,5));

        // ToUpperCase
        System.out.println(str.toUpperCase());

        // ToLowerCase
        System.out.println(str.toLowerCase());

        // Split
        System.out.println(Arrays.toString(str.split(" ")));
    }
}
