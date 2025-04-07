package A05_ProblemsOnBasics;

public class P12_StarPatternPrinting {

    public static void main(String[] args) {

        int num=5;
        for(int i=1; i<=num; i++){ // rows - outer loop
            for(int j=0; j<i; j++) { // columns - inner loop
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for(int i=num; i>0; i--){ // rows - outer loop
            for(int j=i; j>1; j--) { // columns - inner loop
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
