import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PlayerTreeBST bst = new PlayerTreeBST();
        MatchQueue matchQueue = new MatchQueue();
        GamePlayerList gameList = new GamePlayerList();
        PlayerStack playerStack = new PlayerStack();

        boolean running = true;

        while (running) {
            System.out.println("\n🎮 Game Tournament Manager 🎮");
            System.out.println("1. Add a new player");
            System.out.println("2. Search player");
            System.out.println("3. Show all players (alphabetically)");
            System.out.println("4. Add player to match queue");
            System.out.println("5. Start next match");
            System.out.println("6. Show match queue");
            System.out.println("7. Show players by game");
            System.out.println("8. Undo last added player");
            System.out.println("9. Exit");
            System.out.println("Choose option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Enter nickname: ");
                    String nickname = scanner.nextLine();

                    System.out.println("Enter game: ");
                    String game = scanner.nextLine();

                    System.out.println("Enter team: ");
                    String team = scanner.nextLine();

                    Player player = new Player(nickname, game, team);
                    bst.insert(player);
                    gameList.addPlayer(player);
                    playerStack.push(player);
                    System.out.println("✅ Player added.");
                    break;

                case "2":
                    System.out.println("Enter nickname to search: ");
                    String searchName = scanner.nextLine();
                    Player found = bst.search(searchName);
                    if (found != null) {
                        System.out.println("🎯 Player found: " + found);
                    } else {
                        System.out.println("❌ Player not found.");
                    }
                    break;

                case "3":
                    System.out.println("\n 📄 All players:");
                    bst.printPlayers();
                    break;

                case "4":
                    System.out.println("Enter nicknames to add to match queue: ");
                    String queueName = scanner.nextLine();
                    Player playerToQueue = bst.search(queueName);
                    if (playerToQueue != null) {
                        matchQueue.addToQueue(playerToQueue);
                        System.out.println("✅ Player added to match queue.");
                    } else {
                        System.out.println("❌ Player not found in tree.");
                    }
                    break;

                case "5":
                    Player next = matchQueue.startNextMatch();
                    if (next != null) {
                        System.out.println("🎮 Starting match for: " + next);
                    } else {
                        System.out.println("❌ No players in queue.");
                    }
                    break;

                case "6":
                    matchQueue.showQueue();
                    break;

                case "7":
                    System.out.println("Enter game name: ");
                    String gameName = scanner.nextLine();
                    gameList.showPlayersByGame(gameName);
                    break;

                case "8":
                    Player undone = playerStack.pop();
                    if (undone != null) {
                        System.out.println("❌ Removed: " + undone.nickname + " (Undo)");
                        System.out.println("(To fully remove from Tree/Lists, deletion logic needed)");
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;

                case "9":
                    running = false;
                    System.out.println("👋🏻 Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
        scanner.close();
    }
}
