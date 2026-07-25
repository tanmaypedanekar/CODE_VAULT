import java.util.Scanner;

public class factorialUsingRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER : ");
        long num = input.nextLong();
        // method calling.
        long answer = factorial(num);
        System.out.println("FACTORIAL OF YOUR NUMBER IS : " + answer);
        input.close();
    }

    // method for calculating factorial.
    public static long factorial(long num) {
        if (num == 1) {
            return 1;
        }

        return num * factorial(num - 1);
    }
}
