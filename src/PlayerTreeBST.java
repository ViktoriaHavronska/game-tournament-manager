import com.sun.source.tree.Tree;

public class PlayerTreeBST {
    private TreeNode root;

    //   Add new player
    public void insert(Player player) {
        root = insertRecursive(root, player);
    }

    private TreeNode insertRecursive(TreeNode node, Player player) {
        if (node == null) {
            return new TreeNode(player);
        }

        if (player.nickname.compareTo(node.player.nickname) < 0) {
            node.left = insertRecursive(node.left, player);
        } else if (player.nickname.compareTo(node.player.nickname) > 0) {
            node.right = insertRecursive(node.right, player);
        } else {
            System.out.println("Player with nickname already exists.");
        }

        return node;
    }

    //    Search player by nickname
    public Player search(String nickname) {
        return searchRecursive(root, nickname);
    }

    private Player searchRecursive(TreeNode node, String nickname) {
        if (node == null) {
            return null;
        }

        if (nickname.equals(node.player.nickname)) {
            return node.player;
        }

        if (nickname.compareTo(node.player.nickname) < 0) {
            return searchRecursive(node.left, nickname);
        } else {
            return searchRecursive(node.right, nickname);
        }
    }

    //   Players alphabetically
    public void printPlayers() {
        printInOrder(root);
    }

    private void printInOrder(TreeNode node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.println(node.player);
            printInOrder(node.right);
        }
    }
}
