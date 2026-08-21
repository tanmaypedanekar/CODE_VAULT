import java.util.*;

public class mejorityElement3 {
    public static void main(String[] args) {
        int[] array = Array_Utility.arrayinput();
        HashSet<Integer> set = majorityArray(array);
        System.out.println("Majority element in your array is : ");
        System.out.println(set);
    }

    public static HashSet<Integer> majorityArray(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > 2) {
                set.add(array[i]);

            }
        }
        return set;
    }
}
