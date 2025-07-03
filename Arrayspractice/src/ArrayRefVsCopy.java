import java.util.Arrays;

public class ArrayRefVsCopy {
    public static void main(String[] args) {
        int[] original = {1,2,3,4,5};
        int[] copy = Arrays.copyOf(original , original.length);
        copy[0] = 99;

        System.out.println("Original" + Arrays.toString(original));
        System.out.println("Copy" + Arrays.toString(copy));

    }
}
