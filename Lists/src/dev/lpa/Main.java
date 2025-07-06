//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
package dev.lpa ;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name , String type , int count ){
    public GroceryItem(String name ){
        this(name , "Dairy", 1);
    }
}

public class Main {
    public static void main(String[] args) {
     Object[] groceryarray = new Object[3] ;
     groceryarray[0] = new GroceryItem("Milk");
        groceryarray[1] = new GroceryItem("apples" , "Produce",6);
        groceryarray[2] = new GroceryItem("oranges" , "Produce",6);
    System.out.println(Arrays.toString(groceryarray));

        ArrayList objectList = new ArrayList();


        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
     }
}