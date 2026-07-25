import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int num1 = input.nextInt();
        System.out.println("Enter your second number : ");
        int num2 = input.nextInt();
        System.out.println();
        System.out.println("1 for additon");
        System.out.println("2 for substraction");
        System.out.println("3 for multiplication");
        System.out.println("4 for dividation");
        System.out.println();
        System.out.println("Enter your number :");
        int num = input.nextInt();
        switch (num) {
            case 1:
                System.out.println(num1 + num2);
                break;

            case 2:
                System.out.println(num1 - num2);
                break;

            case 3:
                System.out.println(num1 * num2);
                break;

            case 4:
                System.out.println(num1 / num2);
                break;

            default:
                System.out.println("INVALID CHOICE");
                break;
        }
        input.close();
    }
}
