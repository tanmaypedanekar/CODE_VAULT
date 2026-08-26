import java.util.*;

public class freaquencyOfEachElement {
    public static void main(String[] args) {
        int[] array = Array_Utility.arrayinput();
        HashMap<Integer, Integer> ans = freaquency(array);
        for (int num : array) {
            System.out.println(ans.get(num));
        }
    }

    public static HashMap<Integer, Integer> freaquency(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }
        return map;
    }

}
