import java.util.Scanner;

public class reapitednumberTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = input.nextInt();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num+" ");
            }
            System.out.println();
            num++;
        }
        input.close();
    }
}
