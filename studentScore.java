import java.util.Scanner;

public class studentScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student marks : ");
        int mark = input.nextInt();
        String answer = mark < 0 || mark > 100 ? "invalid mark"
                : mark < 30 ? "fail" : mark < 60 ? "good" : mark < 90 ? "excellent" : "outstanding";
        System.out.println(answer);
        input.close();
    }
}
