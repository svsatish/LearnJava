package A06_Arrays;

import java.util.Arrays;

public class C05_InBuiltMethods {

    public static void main(String[] args) {

        int[] a = {5,4,6,7,2,3};

        System.out.println("Length of array is: " + a.length);
        Arrays.sort(a);
        System.out.println(a.toString());
        int[] b = a.clone();
        System.out.println(b.length);


    }
}
