import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int first = input.nextInt();

        String answer = first %2==0  ? "even" : "odd";

        System.out.println("The given number is : " + answer);
        input.close();
    }
}
