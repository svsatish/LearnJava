package A08_Strings;

public class C04_SCP_StringConstantPool {

    public static void main(String[] args) {

        /*

        SCP - String constant pool is memory space within Heap memory which will store String literals
        - They store unique values - optimize memory usage and performance
        - Immutable
        - Thread safe - No Synchronization
        -

        Cons:
        - Slower Garbage collection
         */

        String str; // str is stored in stack memory
        str = "Welcome"; // welcome is stored in scp

        String str2 = new String("In Heap"); // Stored in Heap memory

    }
}
