import java.util.LinkedList;

public class Practicee {
    private static  void gettingElements(LinkedList<String> list){
        System.out.println("Element at index 4 " + list.get(4));
        System.out.println("First " + list.getFirst());
        System.out.println("Last: " + list.getLast());
        System.out.println("Index of Darwin " + list.indexOf("Darwin"));
        System.out.println("Last index of Melbourne" + list.lastIndexOf("Melbourne"));
        System.out.println("Element (Queue method): " + list.element());

        // Peek methods
        System.out.println("Peek: " + list.peek());
        System.out.println("PeekFirst: " + list.peekFirst());
        System.out.println("PeekLast: " + list.peekLast());
    }

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Alice Springs");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Darwin");
        placesToVisit.add("Perth");
        placesToVisit.add("Sydney");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Toowoomba");
        gettingElements(placesToVisit);
    }
}
