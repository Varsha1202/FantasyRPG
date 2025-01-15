import java.util.Scanner;

public class Battle {
    public static void startBattle(Player player, Enemy enemy) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A wild " + enemy.type + " appears!");

        while (player.isAlive() && enemy.isAlive()) {
            System.out.println("\nWhat will you do?");
            System.out.println("1. Attack");
            System.out.println("2. Run");

            int choice = sc.nextInt();

            if (choice == 1) {
                // Player attacks enemy
                System.out.println("\nYou attack the " + enemy.type + "!");
                enemy.takeDamage(10); // Fixed damage for simplicity

                // Check if the enemy is defeated
                if (!enemy.isAlive()) {
                    System.out.println("You defeated the " + enemy.type + "!");
                    break;
                }

                // Enemy attacks player
                System.out.println("\nThe " + enemy.type + " attacks you!");
                enemy.attack(player);

                // Check if the player is defeated
                if (!player.isAlive()) {
                    System.out.println("\nYou were defeated by the " + enemy.type + "!");
                }
            } else if (choice == 2) {
                System.out.println("\nYou ran away from the battle!");
                break;
            } else {
                System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }
}
