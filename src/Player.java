public class Player {
    String nickname;
    String game;
    String team;

    public Player(String nickname, String game, String team) {
        this.nickname = nickname;
        this.game = game;
        this.team = team;
    }

    @Override
    public String toString() {
        return "Player{" +
                "nickname='" + nickname + '\'' +
                ", game='" + game + '\'' +
                ", team='" + team + '\'' +
                '}';
    }
}
