public class allZeroToFirst {
    public static void main(String[] args) {
        int[] array = arrayUtility.arrayInput();
        int z = 0;

        for (int j = 0; j < array.length; j++) {
            if (array[j] == 0) {
                int temp = array[j];
                array[j] = array[z];
                array[z] = temp;
                z++;
            }
        }
        System.out.println("The required array is : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
