import java.util.Scanner;

public class mostFrequentChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your string : ");
        String string = input.nextLine();

        int count = 0;
        int maxCount = 0;
        char high = ' ';
        for (int i = 0; i < string.length(); i++) {
            count = 0;
            for (int j = 0; j < string.length(); j++) {
                if (string.charAt(i) == string.charAt(j)) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                high = string.charAt(i);
            }
        }
        if (maxCount == 1) {
            System.out.println("There is no any frequent character in your string");
        } else {
            System.out.println("Most frequent character in your string is: " + high);
        }
        input.close();

    }
}
