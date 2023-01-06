public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Sourav", 500);
        System.out.println("Newscore is: " + newScore);
        calculateScore(75);
    }
    public static int calculateScore(String playerName, int score) {
        System.out.println("player " + playerName + " scored "+ score + " points.");
        return score*1000;
    }
    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored "+ score + " points.");
        return score*1000;
    }
}
