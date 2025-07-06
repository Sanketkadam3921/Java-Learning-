public class ArrayA {
    private static void printArray(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " "); // use print instead of println
        }
        System.out.println(); // move to next line after printing all elements
    }

    private static int sum(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private  static  void reverse(int[] arr){
        int start = 0 ;
        int end = arr.length-1;
        while ( start < end){
            swap(arr , start, end );
            start++;
            end--;
        }
    }
    private  static int findMax(int[] arr){
        int max = 0 ;
        for ( int n : arr){
            if ( n > max){
                max = n ;

            }
        }
        return max ;
    }

    private  static int[] copyArray(int[] arr){
        int[] copy = new int[arr.length];
        for ( int i = 0 ; i < arr.length ; i++){
            copy[i] = arr[i];

        }
        return  copy;
    }
  private  static  int countEven( int[] arr){
        int count = 0 ;
        for (int n : arr){
            if ( n % 2 == 0 ){
                count++ ;
            }
        }
        return count;
  }

  private static boolean isSorted(int[] arr){
        for ( int i = 1 ; i < arr.length ; i++){
            if ( arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
  }

  private static void shiftLeft(int[] arr){
        int first = arr[0] ;
        for ( int i = 1 ; i < arr.length ; i++){
            arr[i-1] = arr[i];

        }
        arr[arr.length-1] = first ;
  }
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 3, 5, 4};

        System.out.println("Original array:");
        printArray(nums);

        int total = sum(nums);
        System.out.println("Sum: " + total);

        swap(nums, 2, 1); // swapping 4 and 2
       boolean sorted =   isSorted(nums);
       System.out.println("Is array sorted" + sorted);
        System.out.println("Array after swap:");
        printArray(nums); // properly print the swapped array
    }
}
