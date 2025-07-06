import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

record GroceryItem(String name , String type , int count){

}
public class GroceryStore {
public static void addItem(ArrayList<GroceryItem> list , String name ,String type ,int count){
    list.add(new GroceryItem(name , type,count));

}
public static void printList(ArrayList<GroceryItem> list){
    if(list.isEmpty()){
        System.out.println("Grocery List is Empty");
        return ;
    }
    System.out.println("Grocery List ");
    for ( GroceryItem item : list ){
        System.out.println("- " + item.name() + "| type" + item.type() + "| Count " + item.count()) ;

    }
}
public static  void removeItem (ArrayList<GroceryItem> list ,String name){
    boolean removed = list.removeIf(groceryItem -> groceryItem.name().equalsIgnoreCase(name));
    if ( removed){
        System.out.println("Removed item : " + name);
    }else  {
        System.out.println("Item not found " + name);
    }
}
public static int getTotalCount(ArrayList<GroceryItem> list){
    int total = 0 ;
    for ( GroceryItem item : list){
        total+= item.count();
    }
    return  total;
}
public static Set<String> getItemType(ArrayList<GroceryItem> list){
    Set<String> types = new HashSet<>();
        for (GroceryItem item : list){
            types.add(item.type());
        }
        return types;

}


    public static void main(String[] args) {
             ArrayList<GroceryItem> groceryList = new ArrayList<>();


        addItem(groceryList, "Milk", "Dairy", 2);
        addItem(groceryList, "Eggs", "Poultry", 12);
        addItem(groceryList, "Bread", "Bakery", 1);
        addItem(groceryList, "Apple", "Fruit", 6);
        addItem(groceryList, "Butter", "Dairy", 1);

        printList(groceryList);

        removeItem(groceryList,"Eggs");
        printList(groceryList);
        System.out.println("Total item count" + getTotalCount(groceryList));
        System.out.println("Item categories" + getItemType(groceryList));
}
}
