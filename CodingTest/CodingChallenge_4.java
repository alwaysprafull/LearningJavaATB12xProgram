package CodingTest;

public class CodingChallenge_4 {

    public static void main(String[] args) {
        int value = 5;
        System.out.println("Original: " + value);


        System.out.println("Pre-increment: " + (++value));


        System.out.println("Post-increment: " + (value++) + " (returned " + value + ")");

        System.out.println("Pre-decrement: " + (--value));

        System.out.println("Post-decrement: " + (value--) + " (returned " + value + ")");
    }
}

