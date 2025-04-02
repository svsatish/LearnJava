package A04_ControlStatements.Jump;

public class C01_BreakAndContinue {

    public static void main(String[] args) {

        /*
        Used in combination of loops and conditions

        break - will break the iteration and come out of loop
        continue - will skip current iteration and move to next iteration
         */

        for(int i=1; i<=10; i++){
            if(i==6)
                break;
            System.out.println(i);
        }

        for(int i=1; i<=10; i++){
            if(i==6)
                continue;
            System.out.println(i);
        }
    }
}
