import java.util.ArrayList ;


public class Mylist {


    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();


        items.add("Milk");
        items.add("Eggs");

        printList(items);
    }
    public  static void printList(ArrayList<String> list){
        for ( String item : list){
            System.out.println(item);
        }
    }

}
