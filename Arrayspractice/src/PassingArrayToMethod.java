import java.util.Arrays;

public class PassingArrayToMethod {


    public static void main(String[] args) {
        int[] myArr = {10,20,30};
        modify(myArr);

        System.out.println("After modify()" + Arrays.toString(myArr));
    }
    public static void modify(int[] arr){
        arr[1] = 200;
    }
}
