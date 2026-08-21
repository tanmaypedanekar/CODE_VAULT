
import java.util.*;

public class firstHashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(10); // Duplicate value:

        System.out.println("Size of your hashset is : " + set.size());

        System.out.println(set); // print all set except duplicate:

        set.remove(40);
        

        boolean isPresent = set.contains(20);
        System.out.println(isPresent);

        System.out.println(set);

        // imp part to iterat the whole set is :
        Iterator <Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
