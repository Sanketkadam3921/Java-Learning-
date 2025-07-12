import java.util.LinkedList;

public class NinthJulyPractice {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();

        // Basic Add
        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");

        // Deque Additions
        addMoreElements(placesToVisit);

        // Deque Removals
        removeElements(placesToVisit);
    }

    public static void addMoreElements(LinkedList<String> list) {
        System.out.println("=== Adding More Elements ===");
        list.addFirst("Darwin");
        list.addLast("Hobart");

        list.offer("Melbourne");        // adds to end
        list.offerFirst("Brisbane");    // adds to start
        list.offerLast("Toowoomba");    // adds to end

        list.push("Alice Springs");     // stack push (adds to start)

        System.out.println("After all adds: " + list);
    }

    public static void removeElements(LinkedList<String> list) {
        System.out.println("=== Removing Elements ===");
        list.remove(4);                         // remove by index
        list.remove("Brisbane");               // remove by value

        System.out.println("After remove(4) & remove(\"Brisbane\"): " + list);

        // remove (no args) = remove first
        String s1 = list.remove();
        System.out.println("Removed with remove(): " + s1);

        String s2 = list.removeFirst();
        System.out.println("Removed with removeFirst(): " + s2);

        String s3 = list.removeLast();
        System.out.println("Removed with removeLast(): " + s3);

        // Queue style poll
        String p1 = list.poll();               // remove first
        System.out.println("Removed with poll(): " + p1);

        String p2 = list.pollFirst();          // same as poll
        System.out.println("Removed with pollFirst(): " + p2);

        String p3 = list.pollLast();           // remove last
        System.out.println("Removed with pollLast(): " + p3);

        System.out.println("List after all removals: " + list);

        // Stack Style
        System.out.println("=== Stack Push & Pop ===");
        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");

        System.out.println("Stacked list: " + list);

        String p4 = list.pop();
        System.out.println("Popped (stack): " + p4);

        System.out.println("Final list: " + list);
    }
}
