import java.util.ArrayList;
import java.util.Collections;

public class MorePractice {

   public  static int sumList(ArrayList<Integer> nums){
       int sum = 0 ;
       for ( int n : nums) sum+= n;
       return sum ;
   }
   public  static void removeEven (ArrayList<Integer> nums){
       nums.removeIf(n -> n % 2 ==0);
   }

   public  static  void  reverseList ( ArrayList<Integer> list){
       Collections.reverse(list);
   }
   public static  int countFreq(ArrayList<Integer> list , int target){
       int count = 0 ;
       for ( int n : list){
           if( n == target){
               count++;
           }
       }
       return  count ;

   }


    public static void main(String[] args) {

       ArrayList<Integer> myList = new ArrayList<>();
       myList.add(39);
       myList.add(34);
       myList.add(24);
        myList.add(33);
        myList.add(21);
        myList.add(25);
        myList.add(21);
        removeEven(myList);
       int sumofList = sumList(myList);
       System.out.println("Sum" + sumofList);
        System.out.println(myList);

        reverseList(myList);
        System.out.println(myList);
        int cc = countFreq(myList , 21);
        System.out.println(cc);
    }
}
