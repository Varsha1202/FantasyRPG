import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Create a player
        Player player = new Player("Hero");
        
        while (true) {
            // Display simple game menu
            System.out.println("\n=== Fantasy RPG ===");
            System.out.println("1. Start Battle");
            System.out.println("2. Check Stats");
            System.out.println("3. Exit Game");
            System.out.print("Choose an option: ");
            
            int choice = sc.nextInt();
            
            if (choice == 1) {
                // Create an enemy for the battle
                Orc orc = new Orc();
                
                // Start the battle
                Battle.startBattle(player, orc);
                
                if (!player.isAlive()) {
                    System.out.println("\nGame Over! You were defeated.");
                    break;
                }
            } else if (choice == 2) {
                // Display player stats
                player.displayStats();
            } else if (choice == 3) {
                // Exit the game
                System.out.println("Exiting the game...");
                break;
            } else {
                System.out.println("\nInvalid choice. Please try again.");
            }
        }
        
        sc.close();
    }
}
