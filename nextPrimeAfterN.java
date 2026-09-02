import java.util.*;

public class nextPrimeAfterN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = input.nextInt();

        boolean prime = true;
        for (int i = num + 1; i < 1000; i++) {
            prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println("The next prime number is : " + i);
                break;
            }
        }
        input.close();
    }

}
