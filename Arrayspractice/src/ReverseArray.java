public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {23,53,66,77};
        for ( int i = numbers.length-1 ; i >= 0 ; i--){
            System.out.println("Elements in reverse order" + numbers[i]);
        }
    }
}
