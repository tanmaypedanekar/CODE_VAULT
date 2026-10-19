public class findMissingNumber {
    public static void main(String[] args) {
        int[] array = arrayUtility.arrayInput();
        boolean isFound = false;
        for (int j = 0; j <= array.length; j++) {
            isFound = false;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == j) {
                    isFound = true;
                    break;
                }

            }
            if (!isFound) {
                System.out.println("The Missing Number Is " + j);
                break;
            }
        }
    }
}
