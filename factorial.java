import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO FACTORIAL WORLD");
        System.out.println("\n ENTER YOUR NUMBER : ");
        int num = input.nextInt();
        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }
        System.out.println("FACTORIAL OF YOUR NUMBER IS :" + answer);
    }
}
