public class hasTeen {
    public static void main(String[] args) {
        boolean ttt = teen(33,23,11);
        System.out.println( ttt );
    }
    public  static boolean teen(int int1 , int int2 ,int int3){
        if (int1 >= 13 && int1 <= 19){
            return true;
        } else if (int2 >= 13 && int2 <= 19){
            return true;
        }else  if (int3>= 13 && int3<= 19){
            return true;
        }else {
            return false;
        }
    }
}
