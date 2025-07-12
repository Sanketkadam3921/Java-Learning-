import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionExample4 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 2, 3, 4, 4, 5));

        Set<Integer> uniqueset = new HashSet<>(numbers);
        System.out.println("Unique values using set " + uniqueset);
    }
}
