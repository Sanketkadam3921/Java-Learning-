import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPractice {

    public static void main(String[] args) {
        traverseLinkedList();
        linkedListOperations();
        queueOperations();
        dequeOperations();
        stackOperations();
    }

    // 1. Traverse LinkedList
    public static void traverseLinkedList() {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Chennai");
        cities.add("Bangalore");
        cities.add("Pune");

        // Exercise 1.1 - Print with index using for loop
        for ( int i = 0 ; i < cities.size() ; i++){
            System.out.println("City at index" + i + ":" + cities.get(i));
        }
        // Exercise 1.2 - Print in reverse using for loop
         for ( int i = cities.size() -1 ; i >= 0 ; i--){
             System.out.println("Reverse index" + i + " : " + cities.get(i));
         }
        // Exercise 1.3 - Print using enhanced for loop
        for (String city : cities){
            System.out.println("Visited citites" + city);
        }
        // Exercise 1.4 - Print using ListIterator (forward)
        ListIterator<String> iterator = cities.listIterator();
        while(iterator.hasNext()){
            System.out.println("Iterator forward " + iterator.next());
        }
        // Exercise 1.5 - Print using ListIterator (backward)
        while(iterator.hasPrevious()){
            System.out.println("Iterator backward" + iterator.previous());
        }
    }

    // 2. LinkedList Operations
    public static void linkedListOperations() {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Chennai");
        cities.add("Bangalore");
        cities.add("Pune");
        // Exercise 2.1 - Add at start, middle, end
           cities.addFirst("Beed");
           cities.add(3,"Goa");
           cities.addLast("Ladhakh");
        System.out.println("After additions" + cities);
        // Exercise 2.2 - Remove a specific city
           cities.remove("Chennai");
        System.out.println("After removing chennai" + cities);
        // Exercise 2.3 - Check if a city exists
        System.out.println("Contains delhi ? " + cities.contains("Delhi"));
        // Exercise 2.4 - Replace "Pune" with "Kolkata"
          int index = cities.indexOf("Delhi");
          if( index != -1){
              cities.set(index, "Uttrakhand");
          }
        System.out.println("After replacing Delhi" + cities);
        // Exercise 2.5 - Clear the list and check if empty
        cities.clear();;
        System.out.println("Is the list empty ? " + cities.isEmpty());
    }

    // 3. Queue Operations
    public static void queueOperations() {
        LinkedList<String> queue = new LinkedList<>();

        // Exercise 3.1 - Enqueue 5 customers
        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");
        queue.offer("Daisy");
        queue.offer("Eve");
        // Exercise 3.2 - Peek next customer
        System.out.println("Next in queue " + queue.peek());
        // Exercise 3.3 - Dequeue 2 customers
        System.out.println("Dequeued" + queue.poll());
        System.out.println("Dequeued " + queue.poll());
        // Exercise 3.4 - Print current size
        System.out.println("Queue size now " + queue.size());
        // Exercise 3.5 - Empty the queue using while loop
        while ( !queue.isEmpty()){
            System.out.println("Processing " + queue.poll());
        }
        System.out.println("Queue is cleared" + queue);
    }


    // 4. Deque Operations
    public static void dequeOperations() {
        LinkedList<String> deque = new LinkedList<>();

        // 4.1 - Add at both ends
        deque.addFirst("Front1");
        deque.addLast("Back1");
        System.out.println("Deque: " + deque);

        // 4.2 - Peek first and last
        System.out.println("First: " + deque.peekFirst());
        System.out.println("Last: " + deque.peekLast());

        // 4.3 - Remove from both ends
        deque.removeFirst();
        deque.removeLast();
        System.out.println("After removing both ends: " + deque);

        // 4.4 - Insert using offerFirst and offerLast
        deque.offerFirst("Front2");
        deque.offerLast("Back2");
        System.out.println("Using offerFirst & offerLast: " + deque);

        // 4.5 - Circular route simulation
        deque.addLast("Mid");
        deque.addLast("Checkpoint");
        deque.addLast("Final");
        while (!deque.isEmpty()) {
            System.out.println("Passing: " + deque.pollFirst());
        }
    }

    // 5. Stack Operations
    public static void stackOperations() {
        LinkedList<String> stack = new LinkedList<>();

        // Exercise 5.1 - Push 5 pages
        stack.push("HomePage");
        stack.push("LoginPage");
        stack.push("Dashboard");
        stack.push("Settings");
        stack.push("Profile");
        // Exercise 5.2 - Pop last visited page
        System.out.println("Popped page: " + stack.pop());

        // Exercise 5.3 - Peek top page
        System.out.println("Current top page: " + stack.peek());
        // Exercise 5.4 - Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
        // Exercise 5.5 - Print full stack using loop
        System.out.println("Full stack (top to bottom):");
        for (String page : stack) {
            System.out.println(page);
        }
    }
}
