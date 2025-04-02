package A04_ControlStatements.Looping;

public class C02_DoWhileLoop {

    public static void main(String[] args) {

        /*
        initialize
        do{
        statements...;
        increment/decrement;
        }
        while(condition);
         */

        // Print 10 to 1

        int i=10;
        do{
            System.out.print(i);
            if(i!=1){
                System.out.print(",");
            }
            i--;
        }while (i>0);
    }
}
