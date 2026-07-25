import java.util.Scanner;

public class passwordCheckingDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER YOUR PASSWORD:");
        int pass = input.nextInt();
        int ne = 0;
        do {
            System.out.println("Enter Your Password : ");
            ne = input.nextInt();

            if (pass != ne) {
                System.out.println("YOUR PASSWORD IS WRONG");
            }

        } while (pass != ne);
        System.out.println("YOUR PASSWORD IS CORRECT !!!!!!!!");
        input.close();
    }
}
