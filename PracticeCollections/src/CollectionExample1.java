import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample1 {

    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Sanket");
        names.add("Vishnu");
        names.add("Rishi");
        names.add("Arnav");
        names.add("Isha");

        //lets print the collection
        System.out.println("All names " + names);
        //check if name exists
        System.out.println("Contains vishnu ?" + names.contains("Vishnu"));

        // remove names starting with A using lambda
        names.removeIf(name -> name.startsWith("A"));

        System.out.println("After removing names" + names);
    }
}
