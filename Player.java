import java.util.ArrayList;

public class Player {
    private String name;
    private int health;
    private int level;
    private ArrayList<String> inventory;

    // Constructor
    public Player(String name) {
        this.name = name;
        this.health = 100;  // Default health
        this.level = 1;     // Starting level
        this.inventory = new ArrayList<>();  // Empty inventory
    }

    // Method to display player stats
    public void displayStats() {
        System.out.println("=== Player Stats ===");
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Level: " + level);
        System.out.println("Inventory: " + inventory);
        System.out.println("====================");
    }

    // Method to add items to inventory
    public void addItem(String item) {
        inventory.add(item);
        System.out.println(item + " added to inventory.");
    }

    // Method to reduce player health
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;  // Prevent negative health
        System.out.println(name + " took " + damage + " damage. Remaining health: " + health);
    }

    // Getter for health
    public int getHealth() {
        return health;
    }

    // Method to check if player is alive
    public boolean isAlive() {
        return health > 0;
    }
}
