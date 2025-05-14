import java.util.LinkedList;
import java.util.Queue;

public class MatchQueue {
    private Queue<Player> queue;

    public MatchQueue() {
        queue = new LinkedList<>();
    }

    //   Add player (queue)
    public void addToQueue(Player player) {
        queue.add(player);
    }

    //   Remove and return the next player in line
    public Player startNextMatch() {
        return queue.poll();
    }

    //   Show players (queue)
    public void showQueue() {
        if (queue.isEmpty()) {
            System.out.println("⏱️ Match queue is empty.");
        } else {
            System.out.println("🎮 Players in match queue: ");
            for (Player p : queue) {
                System.out.println(p);
            }
        }
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
