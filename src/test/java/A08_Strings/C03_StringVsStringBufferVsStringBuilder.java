package A08_Strings;

public class C03_StringVsStringBufferVsStringBuilder {

    public static void main(String[] args) {

        // String is immutable - value cannot be changed in memory - more secured
        // less efficient compared to StringBuilder & StringBuffer

        String str = "Welcome";
        str = "Welcome2";
        str = "Welcome3";
        String str2 = str.concat(" to Java");
        System.out.println(str); // Welcome
        System.out.println(str2);

        // StringBuffer & StringBuilder are mutable - value can be changed in memory
        // StringBuffer is synchronized
        StringBuffer sb = new StringBuffer(str);
        sb.append(" StringBuffer");
        System.out.println(sb);

        // StringBuilder is NOT synchronized
        // StringBuilder is faster
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(" StringBuilder");
        System.out.println(sb2);
    }
}
