import java.util.Scanner;

public class forEachLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your array length:");
        int num = input.nextInt();
        String[] array = new String[num];

        // here is a normal for loop for gate the array as a input.

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter your " + (i + 1) + " name :");
            array[i] = input.next();
        }

        // use of foreach loop start here . array[i] automatically asign to name[i] and
        // print it.

        System.out.println("---------------------------------");
        for (String name : array) {
            System.out.println("YOUR NAMES ARE: " + name);
        }
        System.out.println("------------------------------------");
        input.close();
    }

}
