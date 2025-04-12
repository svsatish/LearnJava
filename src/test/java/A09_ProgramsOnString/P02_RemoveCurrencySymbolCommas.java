package A09_ProgramsOnString;

import java.util.Scanner;

public class P02_RemoveCurrencySymbolCommas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a String with dollar and comma: ");
        String str = scanner.nextLine();
        scanner.close();

        removeFromString(str);
    }

    static void removeFromString(String str){
        String replaced = str.replace("$","").replace(",","");
        System.out.println(replaced);
    }
}
