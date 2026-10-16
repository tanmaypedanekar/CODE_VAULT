public class maxConsecutiveOne {
    public static void main(String[] args) {
        int[] array = arrayUtility.arrayInput();
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }

        System.out.println("Your Array Elements Is : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Maximum Consecutive one is : " + maxCount);

    }
}
