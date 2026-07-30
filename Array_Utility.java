import java.util.Scanner;
public class Array_Utility {
    public static void main(String[] args) {
        arrayinput();
        //arrayPrint(array);
    }

    public static int[] arrayinput(){
        Scanner input =new Scanner(System.in);   // input never close beacause it use in another program.
        System.out.println("Enter your array size : ");
        int size = input.nextInt();

        int [] array = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter your "+ (i+1)+" element :");
            int num=input.nextInt();
            array[i]=num;
        }
        return array;
    }

    public static void arrayPrint(int [] array){
        System.out.println("Your required answer is : ");
       for(int i=0;i<array.length;i++){
        System.out.print(array[i]+" ");
       }
    }
}
