import java.util.Scanner;
public class equalToString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "Tanmay";
        System.out.println("Enter your name : ");
        String name2= input.next();

        // if(name==name2)>>>>>>>>>>> dont write like this it compare referances instead of the string.

        // if(name.equalsIgnoreCase) >>>>>> if you want to ignore casing then write like this.
        
        if(name.equals(name2))//>>>>>>>> this Is The Correct Way To Compare Two String.
        {
            System.out.println("Congratulation !!! You Entered Correct Name.");
        }
        else{
            System.out.println("Sorry!!!You Entered Wrong Name.");
        }
        input.close();
    }
}
