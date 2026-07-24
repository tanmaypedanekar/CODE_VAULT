import java.util.Scanner;

public class useOfContinue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("LETS LEARN HOW TO USE CONTINUE STATEMENT!!!!!");
        System.out.println();
        System.out.println("WE USE CONTINUE STATEMENT FOR SKIP A PARTICULAR NUMBER LIKE THIS.");
        System.out.println();
        System.out.println("Enter Your Number : ");
        int num = input.nextInt();

        System.out.println("THAT MEANS YOU DONT WANT TO PRINT " + num);
        System.out.println();
        System.out.println("CAN I START THE PRINTING THE ELEMENT TILL 100 ?");

        String start = input.next();

        if (start.equalsIgnoreCase("yes")) {
            for (int i = 1; i <= 100; i++) {
                if (i == num) {
                    continue;
                } else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("YOU DONT WANT TO PRINT THE ELEMENTS!!!!!!!!!!");
        }
        input.close();
    }

}
