import com.sun.source.tree.Tree;

public class TreeNode {
    Player player;
    TreeNode left;
    TreeNode right;

    public TreeNode(Player player) {
        this.player = player;
        this.left = null;
        this.right = null;
    }
}
