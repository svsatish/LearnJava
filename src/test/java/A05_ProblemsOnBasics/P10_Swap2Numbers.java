package A05_ProblemsOnBasics;

public class P10_Swap2Numbers {

    public static void main(String[] args) {

        int a=10, b=20;
        int temp;

        // Approach 1 - Using temp variable
        System.out.println("Before swap, values are: " + a + "," + b);
//        temp=b;
//        b=a; // done
//        a=temp;
//
//        System.out.println("After swap, values are: " + a + "," + b);

        // Approach 2 : Not using 3rd variable
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swap, values are: " + a + "," + b);
    }
}
