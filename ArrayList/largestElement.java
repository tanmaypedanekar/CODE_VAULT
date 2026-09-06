import java.util.*;

public class largestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter your size : ");
        int size = input.nextInt();
        for (int j = 0; j < size; j++) {
            System.out.println("Please Enter Your " + (j + 1) + " Element :");
            int num = input.nextInt();
            list.add(num);  
        }

        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println("Max number in your ArrayLiat is " + max);
        input.close();
    }
}
