import java.util.HashMap;

public class firstRepeatingElement {
    public static void main(String[] args) {
        int[] array = Array_Utility.arrayinput();
        int ans = firstRepeat(array);
        if (ans != -1) {
            System.out.println("First repeating element in your array is : " + ans);
        } else {
            System.out.println("No element is repeat in your array!!!");
        }
    }

    public static int firstRepeat(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (map.get(array[i]) > 1) {
                return array[i];
            }
        }
        return -1;
    }
}
