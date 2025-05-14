import java.util.HashMap;
import java.util.LinkedList;

public class GamePlayerList {
    private HashMap<String, LinkedList<Player>> gameMap;

    public GamePlayerList() {
        gameMap = new HashMap<>();
    }

    // Add player to their game list
    public void addPlayer(Player player) {
        gameMap.putIfAbsent(player.game, new LinkedList<>());
        gameMap.get(player.game).add(player);
    }

    // Show players
    public void showPlayersByGame(String game) {
        LinkedList<Player> list = gameMap.get(game);
        if (list == null || list.isEmpty()) {
            System.out.println("❌ No players found for game: " + game);
        } else {
            System.out.println("🎮 Players for game ' " + game + " ' :");
            for (Player p : list) {
                System.out.println(p);
            }
        }
    }

    // Optional: show players & games
    public void showAll() {
        for (String game : gameMap.keySet()) {
            System.out.println("📌 Game: " + game);
            for (Player p : gameMap.get(game)) {
                System.out.println("  " + p);
            }
        }
    }
}
