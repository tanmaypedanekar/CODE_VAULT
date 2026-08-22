import java.util.*;

class firstNonRepeatingElement {
    public static void main(String[] args) {
        int[] array = Array_Utility.arrayinput();
        int ans = nonRepeating(array);
        System.out.println(ans);
    }

    public static int nonRepeating(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (map.get(array[i]) == 1) {
                return array[i];
            }
        }
        return -1;
    }
}