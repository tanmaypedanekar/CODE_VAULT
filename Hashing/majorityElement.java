import java.util.HashMap;

class majorityElement {
    public static void main(String[] args) {

        int[] array = Array_Utility.arrayinput();
        majorArray(array);
    }

    public static void majorArray(int[] array) {
        int size = array.length;
        boolean isFound = false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }

        for (int i : map.keySet()) {
            if (map.get(i) > size / 2) {
                System.out.println(i);
                isFound = true;
            }
        }
        if (isFound == false) {
            System.out.println("No majority element");
        }
    }
}