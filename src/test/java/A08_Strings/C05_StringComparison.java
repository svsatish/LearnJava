package A08_Strings;

public class C05_StringComparison {

    public static void main(String[] args) {

        /*
        == compares the object reference
        equals compares the content/values
         */

        String str1 = "Welcome";
        String str2 = new String("Welcome");
        String str3 = str1;
        String str4 = str2;

        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));

        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));


    }
}
