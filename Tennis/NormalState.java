package tennis;

public class NormalState implements GameState {
    private final int WIN_THRESHOLD = 4;
    private final int DEUCE_THRESHOLD = 3;
    private final String[] scoreNames = {"Love", "Fifteen", "Thirty", "Forty"};

    @Override
    public GameState getNextState(Player player1, Player player2) {
        int score1 = player1.getScore();
        int score2 = player2.getScore();
        if(score1 >= DEUCE_THRESHOLD && score1 == score2){
            return new DeuceState();
        }
        if(score1 >= WIN_THRESHOLD || score2 >= WIN_THRESHOLD){
            return new WinState();
        }
        return this;
    }

    @Override
    public String getScore(Player player1, Player player2) {
        int score1 = player1.getScore();
        int score2 = player2.getScore();
        if(score1 == score2){
            return scoreNames[score1] + "-All";
        }
        return scoreNames[score1] + "-" + scoreNames[score2];
    }
}
