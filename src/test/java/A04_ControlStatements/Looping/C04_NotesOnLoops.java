package A04_ControlStatements.Looping;

public class C04_NotesOnLoops {

    public static void main(String[] args) {

        /*
        For loop - When condition is known and less lines of code
        While loop - When condition is uncertain
        DoWhile - When you have to execute at least once
         */

        int i=1;
        while (true){
            System.out.println("while loop");
            if(i==7)
                break;
            i++;
        }
    }
}
