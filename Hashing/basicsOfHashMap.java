import java.util.*;

public class basicsOfHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> CountryInfo = new HashMap<>();
        // Add keys and values
        CountryInfo.put("India", 1);
        CountryInfo.put("China", 2);
        CountryInfo.put("America", 3);
        CountryInfo.put("Japan", 4);
        CountryInfo.put("Rassia", 5);

        System.out.println(CountryInfo);
        System.out.println();

        // get values
        System.out.println(CountryInfo.get("China"));
        System.out.println(CountryInfo.get("Japan"));
        System.out.println(CountryInfo.get("India"));
        System.out.println();

        // contains
        System.out.println(CountryInfo.containsKey("Japan")); // present
        System.out.println(CountryInfo.containsKey("Namabia")); // abscent
        System.out.println();

        // remove values
        CountryInfo.remove("Japan");
        System.out.println(CountryInfo);
        System.out.println();

        // size
        System.out.println("Size of your HashMap is : " + CountryInfo.size());
        System.out.println();

        // isempty
        System.out.println(CountryInfo.isEmpty());
        System.out.println();

    }
}
