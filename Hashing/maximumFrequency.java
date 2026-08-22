import java.util.*;

public class maximumFrequency {
    public static void main(String[] args) {
        int[] array = Array_Utility.arrayinput();
        int ans = maxFrequency(array);
        System.out.println("Maximum Frequency of an element is : " + ans);
    }

    public static int maxFrequency(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }
        int max = 0;
        int frequency = -1;
        for (int num : map.keySet()) {
            if (map.get(num) > frequency) {
                frequency = map.get(num);
                max = num;
            }
        }
        return max;

    }
}
