package tennis;

public class WinState implements GameState{
    @Override
    public GameState getNextState(Player player1, Player player2) {
        return this;
    }

    @Override
    public String getScore(Player player1, Player player2) {
        int score1 = player1.getScore();
        int score2 = player2.getScore();
        return score1 > score2 ? "Win for player1" : "Win for player2";
    }
}
