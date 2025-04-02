package A04_ControlStatements.Looping;

public class C01_WhileLoop {

    public static void main(String[] args) {

        /*
        initialize var
        while(condition){
        statements...
        increment/decrement
        }
         */

        int i=1;
        while(i<=10){
            System.out.print(i);
            if(i!=10){
                System.out.print(",");
            }
            i++;
        }
    }
}
