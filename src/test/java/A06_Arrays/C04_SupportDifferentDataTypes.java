package A06_Arrays;

public class C04_SupportDifferentDataTypes {

    public static void main(String[] args) {

        Object a[] = {"string", 1, 'c', true};

        for(Object o : a){
            System.out.print(o + " ");
        }
    }
}
