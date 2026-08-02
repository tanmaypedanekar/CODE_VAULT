public class productOffArrayExceptSelf {
    public static void main(String[] args) {
        int[] array = Array_Utility.arrayinput();
        newArray(array);
    }

    public static void newArray(int[] array) {
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int mul = 1;
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    mul *= array[j];
                }
            }
            temp[i] = mul;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
