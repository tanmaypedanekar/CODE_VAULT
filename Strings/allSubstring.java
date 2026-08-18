import java.util.Scanner;

public class allSubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any string : ");
        String name = input.nextLine();
        for (int i = 0; i < name.length(); i++) {
            for (int j = i + 1; j <= name.length(); j++) {
                System.out.println(name.substring(i, j));
            }
        }
        input.close();
    }

}
