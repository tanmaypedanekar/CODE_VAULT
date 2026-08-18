import java.util.Arrays;
import java.util.Scanner;

public class anagramString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any string : ");
        String name = input.nextLine();
        System.out.println("Enter any string : ");
        String name2 = input.nextLine();

        if (name.length() != name2.length()) {
            System.out.println("Given string is not a anagram!!!");
        }
        char[] array = name.toCharArray();
        char[] array2 = name2.toCharArray();

        Arrays.sort(array);
        Arrays.sort(array2);

        if (Arrays.equals(array, array2))
            System.out.println("Given string is a anagram!!!");
        else
            System.out.println("Given string is not a anagram!!!");
        input.close();
    }

}
