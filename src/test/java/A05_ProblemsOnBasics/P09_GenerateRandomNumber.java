package A05_ProblemsOnBasics;

import java.util.Random;

public class P09_GenerateRandomNumber {

    public static void main(String[] args) {

        // Approach 1:  Using Random class
        Random random = new Random();
        System.out.println(random.nextInt(100));

        // Approach 2: Using Math class
        int rand = (int)(Math.random()*100);
        System.out.println(rand);
    }
}
