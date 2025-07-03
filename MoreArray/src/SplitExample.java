public class SplitExample {
    public static void main(String[] args) {
        printSplit("Java is awesome");
    }

    public  static  void  printSplit(String input){
        String[] parts = input.split(" ");
        for ( String part : parts ){
            System.out.println(part);
        }
    }
}
