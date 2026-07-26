import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num3 = Integer.MAX_VALUE;
        System.out.println(num3);
       
        System.out.println("Enter a number that you want to check : ");
        int num = input.nextInt();
        int temp = num;
        int ans = 0, ld = 0;
        while (num > 0) {

            ld = num % 10;
            ans = ans * 10 + (ld);
            num = num / 10;
        }
        if (ans == temp) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
      input.close();
    }

}
