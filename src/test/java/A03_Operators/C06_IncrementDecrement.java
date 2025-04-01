package A03_Operators;

public class C06_IncrementDecrement {

    public static void main(String[] args) {

        int a=10, result;

        // post increment
        result = a++;
        System.out.println(result);
        System.out.println(a);

        // pre increment
        result = ++a;
        System.out.println(result);
        System.out.println(a);

        // post decrement
        result = a--;
        System.out.println(result);
        System.out.println(a);

        // pre decrement
        result = --a;
        System.out.println(result);
        System.out.println(a);
    }
}
