public class challengeMethhod {
    public static void main(String[] args) {
        int scores[] = {1500, 1000, 500, 100, 25};
        for (int i = 0; i < scores.length; i++) {
            int  k = scores[i];
            displayHighScorePosition("Sourav", calculateHighScorePosition(k));
        }
    }
    public static  void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score list." );
    }
    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        }
        else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        }
        else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        }
        else{
            return 4;
        }
    }
}
