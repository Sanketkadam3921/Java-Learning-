import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedNinthJuly {

      private static  void printItinerary(LinkedList<String> list){
          System.out.println("Trip starts at " + list.getFirst());
          for ( int i = 1 ; i < list.size() ; i++){
              System.out.println("From" + list.get(i-1) + "to " + list.get(i));

          }
          System.out.println("Trip ends at " + list.getLast());
      }


      //enhanced for each itinerary
    private  static  void printItinerary2(LinkedList<String> list){
          String previousTeam = list.getFirst();
          for ( String town : list){
              if ( town.equals(previousTeam)) continue;
              System.out.println("From " + previousTeam + " to  " + town);
              previousTeam = town ;
          }
    }

    private  static void print3( LinkedList<String> list){
        ListIterator<String> iterator = list.listIterator(1);
        String previousTown = list.getFirst();
        while (iterator.hasNext()){
            String currentTown = iterator.next();

        }
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

        printItinerary(placesToVisit);
        printItinerary2(placesToVisit);
    }
}
