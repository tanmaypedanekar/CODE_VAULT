public class OddFirstInArray {
    public static void main(String[] args) {
        int[] array = Array_Utility.arrayinput();
        newArray(array);

    }

    public static void newArray(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                int temp = array[count];
                array[count] = array[i];
                array[i] = temp;
                count++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
