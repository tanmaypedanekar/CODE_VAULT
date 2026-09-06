import java.util.*;

public class removeDuplicate {
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
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!list1.contains(list.get(i))) {
                list1.add(list.get(i));
            } else {
                continue;
            }
        }
        System.out.println(list1);

        input.close();
    }
}
