package dev.twobeardednomads;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 900;
        int lvlCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, lvlCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 5500;
        lvlCompleted = 21;
        bonus = 65;

        highScore = calculateScore(gameOver, score, lvlCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        displayHighScorePosition("Tim", calculateHighScorePosition(1500));
        displayHighScorePosition("Chris", calculateHighScorePosition(900));
        displayHighScorePosition("Ginger", calculateHighScorePosition(400));
        displayHighScorePosition("Bear", calculateHighScorePosition(50));

    }

    public static int calculateScore (boolean gameOver, int score, int lvlCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (lvlCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }

    public static void displayHighScorePosition (String playerName, int playerPosition) {
        System.out.println(playerName + " managed to achieve position " + playerPosition + ".");
    }

    public static int calculateHighScorePosition (int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }

        return 4;
    }
}
