public class FirstClass {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScore(1500);
        displayHighScorePosition("Sanket", highScorePosition);
        highScorePosition = calculateHighScore(150);
        displayHighScorePosition("Vishnu", highScorePosition);
    }
    public  static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " Managed to get into position " + highScorePosition + " On the high score list");

    }
    public static  int calculateHighScore(int playerScore){
        int position = 4;
        if( playerScore >= 1000){
           position = 1;
        } else if(playerScore >= 500 && playerScore < 1000) {
            position = 2 ;
        }else if (playerScore >= 100 && playerScore < 500){
            position = 3 ;
        }
            return position;
        }
}
