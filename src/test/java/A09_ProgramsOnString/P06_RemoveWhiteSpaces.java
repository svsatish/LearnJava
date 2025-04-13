package A09_ProgramsOnString;

public class P06_RemoveWhiteSpaces {

    public static void main(String[] args) {

        String str = "   J avaStr   ings  ";

        // trim will only trim white space before and at the end
        System.out.println(str.trim());

        // replaceAll suing regex
        System.out.println(str.replaceAll("\\s",""));

    }
}
