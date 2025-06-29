public class ExerciseNo2 {
    public  static void  main(String[] args){
        checkNumber(8);
        checkNumber(-4);
        checkNumber(0);
    }
    public  static void checkNumber(int number){
        if ( number > 0 ){
           System.out.println("positive");
        }else if ( number < 0){
            System.out.println("Negative");

        }else {
            System.out.println("Zero");
        }
    }

}
