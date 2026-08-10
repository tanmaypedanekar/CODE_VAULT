import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = Array_Utility.arrayinput();

        System.out.println("Enter your target :");
        int target = input.nextInt();

        boolean new1 = numFound(array, target);
        System.out.println(new1);

        input.close();
    }

    public static boolean numFound(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {

            int mid = (start + end) / 2;
            if (array[mid] == target) {
                return true;
            } else if (array[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return false;
    }

}
