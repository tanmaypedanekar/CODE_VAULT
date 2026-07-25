
public class printOnlyPrimeNum {
    public static void main(String[] args) {
        int[] array = Array_Utility.arrayInput();
        printPrimeOnly(array);
    }

    public static void printPrimeOnly(int[] array) {

        for (int i = 0; i < array.length; i++) {
            boolean isPrime = true;
            if (array[i] < 2) {
                isPrime = false;
            }
            for (int j = 2; j < array[i]; j++) {
                if (array[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.println(array[i] + " number is prime !!");
            else
                System.out.println(array[i] + " number is not prime !!");
        }
    }
}
