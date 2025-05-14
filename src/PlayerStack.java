import java.util.Stack;

public class PlayerStack {
    private Stack<Player> stack;

    public PlayerStack() {
        stack = new Stack<>();
    }

    public void push(Player player) {
        stack.push(player);
    }

    public Player pop() {
        if (!stack.isEmpty()) {
            return stack.pop();
        } else {
            return null;
        }
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void showLast(){
        if (!stack.isEmpty()){
            System.out.println("🔙 Last added: "+ stack.peek());
        }else {
            System.out.println("Stack is empty.");
        }
    }

}
