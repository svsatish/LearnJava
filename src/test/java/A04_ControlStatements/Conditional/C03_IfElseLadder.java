package A04_ControlStatements.Conditional;

public class C03_IfElseLadder {

    public static void main(String[] args) {

        String month="Monday";

        if(month=="Monday"){
            System.out.println("Monday");
        } else if (month=="Tuesday") {
            System.out.println("Tuesday");
        } else if (month=="Wednesday") {
            System.out.println("Wednesday");
        }
        System.out.println("This will execute no matter what");
    }
}
