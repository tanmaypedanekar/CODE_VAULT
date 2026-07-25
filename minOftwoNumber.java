import java.util.Scanner;

public class minOftwoNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int first = input.nextInt();
        System.out.println("Enter second number : ");
        int second = input.nextInt();

        int answer = first < second ? first : second;

        System.out.println("The min of two number is : " + answer);
        input.close();
    }
}
