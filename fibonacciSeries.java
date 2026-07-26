import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO FIBONACCI WORLD");
        System.out.println();
        System.out.println("Enter your number : ");
        int num = input.nextInt();

        int firstNum = 0, secondNum = 1, thirdNum;
        for (int i = 0; i < num; i++) {
            System.out.print(firstNum + " ");
            thirdNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = thirdNum;
        }
        input.close();
    }
}
