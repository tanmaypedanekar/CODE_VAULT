import java.util.*;
public class fruitsAndCapacity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap <String,Integer> Fruits = new HashMap<>();
        Fruits.put("Apple", 10);
        Fruits.put("banana", 20);
        Fruits.put("Orange", 30);
        Fruits.put("Grapes", 40);
       
        System.out.println(Fruits);

        System.out.println(Fruits.get("Apple"));
        input.close();
    }
    
}
