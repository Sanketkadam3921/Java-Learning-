public class MutationMethod {
    public static void reverse(int[] array){
        int maxIndex = array.length -1;
        int halflength = array.length /2 ;
        for ( int i = 0 ; i < halflength ; i++){
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp ;
        }
    }
    public  static  int[] reversecopy(int[] array ){
        int [] reversed = new int[array.length];
        int maxIndex = array.length-1;
        for ( int el : array){
            reversed[maxIndex--] = el;
        }
        return reversed;
    }
    public static void main(String[] args) {
        int[] reversearray = new int[] {1,2,3,4,5};
        System.out.println("Before reverse");
        for ( int num : reversearray){
            System.out.println(num + " ");
        }
        int[] copy = reversecopy(reversearray);
        reverse(reversearray);

       for ( int c : copy){
           System.out.println(c + " ");
       }
        System.out.println("\n After reverse");
        for ( int num : reversearray){
            System.out.println(num + " ");
        }
    }
}
