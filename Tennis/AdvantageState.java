package tennis;

public class AdvantageState implements GameState{

    @Override
    public GameState getNextState(Player player1, Player player2) {
        int score1 = player1.getScore();
        int score2 = player2.getScore();
        int diff = Math.abs(score1 - score2);
        if(diff == 2){
            return new WinState();
        }
        if (diff == 0){
            return new DeuceState();
        }
        return this;
    }

    @Override
    public String getScore(Player player1, Player player2) {
        int score1 = player1.getScore();
        int score2 = player2.getScore();
        return score1 > score2 ? "Advantage player1" : "Advantage player2";
    }
}
