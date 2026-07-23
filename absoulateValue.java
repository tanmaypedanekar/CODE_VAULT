import java.util.Scanner;

public class absoulateValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to absoulate value world!!!!!!!!!");
        System.out.print("Enter your number : ");
        int num = input.nextInt();

        // use of ternary operator:

        int result = num >= 0 ? num : -num;

        System.out.print("Absoulate value of your number is : " + result);
        input.close();
    }
}
