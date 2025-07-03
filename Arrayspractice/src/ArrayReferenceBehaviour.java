import java.util.Arrays;

public class ArrayReferenceBehaviour {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = array1 ;

        array2[0] = 100 ;
        System.out.println("Array 1 " + Arrays.toString(array1));
        System.out.println("Array2" + Arrays.toString(array2));
    }
}
