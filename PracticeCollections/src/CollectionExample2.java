import java.util.*;

public class CollectionExample2 {
    static void printCollection(Collection<String> collection){
        for ( String item : collection){
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Banana", "Apple", "Mango"));
        Set<String> set = new HashSet<>(Set.of("Banana", "Apple", "Mango"));

        System.out.println("List output ordered");
        printCollection(list);

        System.out.println("\n Set output unordered");
        printCollection(set);
    }
}
