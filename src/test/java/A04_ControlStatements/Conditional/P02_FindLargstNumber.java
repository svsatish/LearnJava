package A04_ControlStatements.Conditional;

public class P02_FindLargstNumber {

    public static void main(String[] args) {

        int a=1, b=2, c=0;

        if(a>b && a>c){
            System.out.println("a is greater");
        } else if (b>a && b>c) {
            System.out.println("b is greater");
        } else {
            System.out.println("c is greater");
        }
    }
}
