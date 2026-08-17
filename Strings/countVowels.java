import java.util.Scanner;

public class countVowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your string : ");
        String string = input.nextLine();
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Vowels in your string is : " + count);
        input.close();

    }
}
