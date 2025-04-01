package A04_ControlStatements.Conditional;

public class C04_SwitchStatement {

    public static void main(String[] args) {

        /*
        switch(variable){
        case 1:
        statements;
        break;
        case 2:
        case 3:
        statements;
        break;
        default:
        statements;
         */

        String month = "feb";
        switch(month){
            case "jan":
                System.out.println("This is January");
                break;
            case "feb":
                System.out.println("Thi is February");
                break;
            default:
                System.out.println("Not a valid month");
        }
    }
}
