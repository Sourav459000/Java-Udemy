public class challengeIfThenElse {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800, levelCompleted = 5, bonus = 100;
        
        calculateScore(gameOver, levelCompleted, bonus, score );
        
        score = 10000; levelCompleted = 8; bonus = 200;
        
        calculateScore(gameOver, levelCompleted, bonus, score );

    }
    public static void calculateScore(boolean gameOver, int levelCompleted, int bonus, int score) {
        if (gameOver) {
            int finalScore = score;
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was: " + finalScore );
        }
    }
}
