package A06_Arrays;

public class C01_Intro {

    public static void main(String[] args) {

        /*
        Arrays - store multiple values of same datatype
        - It is part of collections
        - It has fixed size

        Types:
        - Single dimensional arrays
        - Two dimensional arrays
         */

        // Declaration
        int a[] = new int[5];

        // assignment
        a[0] = 8;
        a[1] = 2;
        a[3] = 4;
        a[4] = 6;

        // Approach 2: Declaration and assignment
        int b[] = {2,3,4,5,6};

        // Length of the array
        int len = a.length;
        System.out.println("Length of first array is: " + len);
    }
}
