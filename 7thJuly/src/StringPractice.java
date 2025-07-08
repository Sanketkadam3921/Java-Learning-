import java.util.ArrayList;
import java.util.List;

public class StringPractice {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Orange");

        System.out.println("Fruits: " + fruits);
        fruits.add(2,"Strawberry");//insert
        System.out.println(fruits);
        fruits.set(3,"Kiwi");
        System.out.println(fruits);
        fruits.remove(1);
        //check if the item exists
        System.out.println(fruits.contains("Banana"));
        for ( String fruit : fruits){
            System.out.println(fruit.toUpperCase());
        }
        //convert array to arraylist
        String[] items =  {"Milk", "Bread", "Butter"};
        ArrayList<String> groceries = new ArrayList<>(List.of(items));
        System.out.println(groceries);
        ArrayList<String> extras = new ArrayList<>(List.of(items));
        fruits.addAll(extras);
        System.out.println(fruits);
        groceries.clear();
        System.out.println("Is empty ? "+ groceries.isEmpty() );
    }
}
