import java.util.Arrays;

public class PreventMethodfromChangingOriginalArray {
    public static void modify(int[] arr){
        arr[0] =999;
    }

    public static void main(String[] args) {
        int[] myArr = {1,2,3,4};
        modify(Arrays.copyOf(myArr,myArr.length));
        System.out.println("Original array" + Arrays.toString(myArr));
    }
}
