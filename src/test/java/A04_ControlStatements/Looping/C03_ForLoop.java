package A04_ControlStatements.Looping;

public class C03_ForLoop {

    public static void main(String[] args) {

        /*
        for(initialization; condition; increment/decrement){
        statements...;
        }
         */

        // print odd and even numbers within 1 to 10

        for(int i=1; i<=10; i++){
            if(i%2==0){
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
    }
}
