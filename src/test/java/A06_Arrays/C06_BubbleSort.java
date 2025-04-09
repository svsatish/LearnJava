package A06_Arrays;

import java.util.Arrays;

public class C06_BubbleSort {

    public static void main(String[] args) {

        //Bubble sort - arrange array in ascending or descending order by swapping elements

        int[] arr = {23, 12, 1, 67, 3};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        int temp;

        for(int i=0; i<arr.length; i++){ // outer loop -
            for(int j=i+1; j<arr.length; j++){ // inner loop -
                if(arr[i]>arr[j]){ // check if current element greater than next and swap
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}
