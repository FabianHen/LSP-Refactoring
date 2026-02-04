package tennis;

public interface GameState {
    GameState getNextState(Player player1, Player player2);
    String getScore(Player player1, Player player2);
}
