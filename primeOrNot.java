import java.util.Scanner;

public class primeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = input.nextInt();
        boolean isPrime = primeMethod(num);
        if (isPrime)
            System.out.println("YOUR NUMBER IS PRIME");
        else
            System.out.println("YOUR NUMBER IS NOT PRIME");
        input.close();
    }

    public static boolean primeMethod(int num) {
        if(num<2){
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
