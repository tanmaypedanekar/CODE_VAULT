
public class mejorityElement {
    public static void main(String[] args) {
        int[] array = Array_Utility.arrayinput();
        int ans = mejority(array);
        System.out.println(ans);
    }

    public static int mejority(int[] array) {
        int number = -1;
        int count = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                number = array[i];
            }
        }
        if (max > array.length / 2) {// A majority element is an element that appears
                                     // more than half of the size of the array.
            return number;
        } else {
            System.out.println("There is no any mejority element !!!");
            return -1;
        }
    }
}
