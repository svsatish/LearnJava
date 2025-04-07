package A05_ProblemsOnBasics;

public class P11_NumberPatternPrinting {

    public static void main(String[] args) {

        int num=5;

        // Left triangle
        for(int i=1; i<=num; i++){ // outer loop - rows
            for(int j=0; j<i; j++){ // inner loop - columns
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}
