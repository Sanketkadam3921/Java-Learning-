public class Arrays {
    public static void main(String[] args) {
        int[] integerArray = new int[10];

        integerArray[0] = 99 ;
        double[] myarray = new double[10];
        myarray[2] = 3.5;
        int[] firstten = {1,2,3,4,5,6,7,8,9};
        System.out.println("First = " + firstten[0]);
        int arrayLength = firstten.length;
        System.out.println("Length of an array = " + firstten[arrayLength-2]);
          int[] newArray ;
          newArray = new int[] {5,4,3,2,1};
         for ( int i = 0 ; i < newArray.length ; i++){
             System.out.println(newArray[i] + " ");
         }
         for ( int elem : newArray){
             System.out.println(elem + " ");
         }
    }
}
