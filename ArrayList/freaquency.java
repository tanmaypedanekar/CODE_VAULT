import java.util.*;

public class freaquency {
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
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    count++;
                }
            }
            if (!list1.contains(list.get(i))) {
                list1.add(list.get(i));
                System.out.println(list.get(i) + " " + count);
            }
        }
        input.close();
    }
}
