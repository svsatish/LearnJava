package A09_ProgramsOnString;

public class P05_RemoveJunkCharacters {

    public static void main(String[] args) {

        String str ="$^$^^&!@^)(*()Java^&*^Stri^&ngs1234567*&(*&";

        // remove junk characters
        String result = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(result);

        // remove alphabets
        System.out.println(str.replaceAll("[a-zA-Z]",""));

        // remove numbers
        System.out.println(str.replaceAll("[0-9]",""));

        // only alphabets
        System.out.println(str.replaceAll("[^a-zA-Z]",""));

    }
}
