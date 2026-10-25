public class selectionSort {
    public static void main(String[] args) {
        int[] array = arrayUtility.arrayInput();

        for (int i = 0; i < array.length; i++) {
            int smallestIndex = i;
            for (int j = i; j < array.length - 1; j++) {
                if (array[j] < array[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[smallestIndex];
            array[smallestIndex] = temp;
        }
        System.out.println("Here is your sorted array using SELECTION SORT : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
