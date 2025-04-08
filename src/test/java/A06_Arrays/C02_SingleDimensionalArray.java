package A06_Arrays;

public class C02_SingleDimensionalArray {

    public static void main(String[] args) {

        int a[] = {1,2,3,4,5};

        // Print elements of array

        // Approach 1: Using normal for loop
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }

        // Approach 2: Enhanced for loop
        for(int i : a){
            System.out.print(i);
        }
    }
}
