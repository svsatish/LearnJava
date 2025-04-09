package A08_Strings;

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
    }
}
