public class MethodChallenge {
    static public void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1000);
        displayHighscorePosition("Tim", highScorePosition);
    }

    public static void displayHighscorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list.");
    }

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore >= 1000) {
            return 1;
        }
        else if (playerScore >= 500) {
            return 2;
        }
        else if (playerScore >= 100) {
            return 3;
        }
        else
            return 4;
    }
}