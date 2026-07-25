import java.util.Scanner;

public class sumCalculatingRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = input.nextInt();
        int answer = sumCalculating(num);
        System.out.println("THE SUM TILL " + num + " numbers are : " + answer);
        input.close();

    }

    public static int sumCalculating(int num) {
        if (num == 1) {
            return 1;
        }
        return num + sumCalculating(num - 1);
    }

}
