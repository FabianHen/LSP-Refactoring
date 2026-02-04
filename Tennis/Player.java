package tennis;

public class Player {

    private int score;

    private final String name;

    public Player(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void scorePoint(){
        score++;
    }

    public String getName() {
        return name;
    }
}
