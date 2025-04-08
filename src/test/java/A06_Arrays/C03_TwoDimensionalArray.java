package A06_Arrays;

public class C03_TwoDimensionalArray {

    public static void main(String[] args) {

        // Approach 1 - Using new keyword
        // Declaration
        int a[][] = new int[3][2];

        // Initialization
        a[0][0]=1;
        a[0][1]=2;
        a[1][0]=3;
        a[1][1]=4;
        a[2][0]=5;
        a[2][1]=6;

        // Approach 2 - Direct assignment

        int b[][] = {{1,2,3}, {3,4,5}, {6,7,8}};

        // length of array
        System.out.println(a.length);
        System.out.println(a[0].length);
        System.out.println(b.length);
        System.out.println(b[0].length);

        // Print array elements using normal for loop
        for(int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println(" ");
        }

        // Print array elements using for-each loop
        for(int x[] : b){
            for(int y: x){
                System.out.print(y + " ");
            }
            System.out.println(" ");
        }

    }
}
