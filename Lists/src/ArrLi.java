import java.util.ArrayList;

public class ArrLi {
    //declaration
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //add elements
        list.add("Milk");
        list.add("Eggs");
        String item = list.get(0);
        //access elements ---
        System.out.println(item);

        //now lets replace first element with cheese
        list.set(1,"Cheese");
        list.remove(0);
        System.out.println(list);

         list.add("Newitem");
         //now lets loop through the list
        for ( String ittem : list ){
            System.out.println(ittem);
        }
    }



}
