public class SpeedConvertor {
    public static void main(String[] args) {
    double calc =    toMilesPerHour(1.5);
    System.out.println(calc + "is the answer");

    }
    public static long toMilesPerHour(double kmperhr){
        if (kmperhr < 0 ){
            return -1;
        }

        return Math.round(kmperhr * 0.621371) ;
    }
}
