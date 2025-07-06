public class Combinesplitandvargs {


    public static void printWords(String... words){
        for ( String word : words){

            System.out.println(word);
        }
    }
     public  static  void printSplitwords(String sentence){
         String[] parts = sentence.split(" ");
         printWords(parts);
     }
    public static void main(String[] args) {
         printSplitwords("Learning java is fun ");
    }
}
