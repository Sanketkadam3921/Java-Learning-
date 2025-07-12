import java.util.*;

public class CollectionExample3 {


    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Zebra");
        set.add("Apple");
        set.add("Monkey");
        set.add("Banana");

        System.out.println("Unordered Set:");
        System.out.println(set);

        List<String> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);

        System.out.println("Sorted List");
        System.out.println(sortedList);
    }
}
