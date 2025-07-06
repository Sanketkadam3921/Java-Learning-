import java.util.Arrays;

public class MoreArray {

    //calling a method that returns int []
    public  static  int[] buildArray(){
        int[] nums = {10,20,30};
        return nums ;
    }
    public static void printArray(int[] arr){
        for ( int n : arr){
            System.out.println(n + " ");
        }
    }
    public static int getsum(int[] arr){
        int sum = 0 ;
        for ( int n : arr){
            sum+= n ;

        }
        return sum ;
    }

    public static int[] reverseArray(int[] arr){
        int[] reversed = new int[arr.length];
        int j = 0 ;
        for ( int i = arr.length-1 ; i >=0 ; i--){
            reversed[j++] = arr[i];

        }
        return reversed;

    }
    public static int[] buildsquares(int n){
        int[] squares = new int[n];
        for ( int i=0 ; i< n ; i++){
            squares[i] = (i+1) * (i+1) ;
        }
        return squares;
    }
    public static void main(String[] args) {
        int[] result = buildArray();
        System.out.println(Arrays.toString(result));
        printArray(new int[]{1,2,3});
        int resullt = getsum(new int[]{2,3,4,1,4,1});
        System.out.println("Total sum " + resullt);
        int[] arr1 = {1,2,3,4,5,6};
        int[] rev = reverseArray(arr1);
        System.out.println(Arrays.toString(rev));
        int[] squares =  buildsquares(7);
        System.out.println(Arrays.toString(squares));
    }
}
