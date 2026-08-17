import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your string : ");
        String string = input.nextLine();

        int i = 0;
        int j = string.length() - 1;
        boolean isPalindrome = true;

        while (i < j) {
            if (string.charAt(i) != string.charAt(j)) {
                isPalindrome = false;
                break;
            }

            else if (string.charAt(i) == string.charAt(j)) {
                i++;
                j--;
            }
        }
        if (isPalindrome) {
            System.out.println("Your String is Palindrome...!!!");
        } else {
            System.out.println("Your String is not a palindrome...!!!");
        }
        input.close();

    }
}
