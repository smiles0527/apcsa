public class Scoreboard {
    private String team1;
    private String team2;
    private int score1;
    private int score2;
    private boolean team1Active;

    public Scoreboard(String team1, String team2) {
        this.team1 = team1;
        this.team2 = team2;
        this.score1 = 0;
        this.score2 = 0;
        this.team1Active = true;
    }

    public void recordPlay(int points) {
        if (points > 0) {
            if (team1Active) {
                score1 += points;
            } else {
                score2 += points;
            }
        } else {
            team1Active = !team1Active;
        }
    }

    public String getScore() {
        return score1 + "-" + score2 + "-" + (team1Active ? team1 : team2);
    }
}
