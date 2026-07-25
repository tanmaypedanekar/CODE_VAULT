import java.util.Scanner;
import java.util.Random; // import Random library for computer guess the random number.

public class numberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random(); // Creating the random object.
        int answer = rand.nextInt(26); // Computer picks a number (0–25) and saves it to answer
        int guess;

        do {
            System.out.println("ENTER A NUMBER FROM 0 TO 25");
            guess = input.nextInt();

            if (guess > answer) {
                System.out.println("Enter small number!!!");
                System.out.println("TRY AGAIN BUDDY !!!!");
            } else if (guess < answer) {
                System.out.println("Enter big number!!!");
                System.out.println("TRY AGAIN BUDDY !!!!");
            }

        } while (guess != answer);
        System.out.println("CONGRATULATIONS YOU GOT IT  !!!!!!!");
        input.close();
    }
}
