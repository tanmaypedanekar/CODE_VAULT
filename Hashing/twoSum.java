import java.util.*;

public class twoSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = Array_Utility.arrayinput();
        System.out.println("Enter your target : ");
        int target = input.nextInt();
        twoSumMethod(array, target);
        input.close();
    }

    public static void twoSumMethod(int[] array, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            int req = target - current;
            if (map.containsKey(req)) {
                System.out.println(current + " " + req);
            }
            map.put(current, i);
        }
    }
}
