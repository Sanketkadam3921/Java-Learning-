import java.util.ArrayList;
import java.util.Collections;

public class IntergerList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);

        System.out.println(nums);

        // Print all the items using for-each loop
        for (int n : nums) {
            System.out.println(n);
        }

        // Add 99 as the third element
        nums.add(99);

        // Now access the element at index 2
        System.out.println(nums.get(2)); // prints 99

        // Check if 40 exists in the list
        System.out.println(nums.contains(40)); // false

        System.out.println("Size = " + nums.size()); // 3

        Collections.sort(nums); // ascending sort
        System.out.println(nums);

        Collections.reverse(nums); // descending sort
        System.out.println(nums);
    }
}
