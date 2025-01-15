public abstract class Enemy {
    protected String type;
    protected int health;
    protected int attackPower;

    // Constructor
    public Enemy(String type, int health, int attackPower) {
        this.type = type;
        this.health = health;
        this.attackPower = attackPower;
    }

    // Abstract method for attacking the player
    public abstract void attack(Player player);

    // Method to reduce enemy health
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
        System.out.println(type + " took " + damage + " damage. Remaining health: " + health);
    }

    // Getter for health
    public int getHealth() {
        return health;
    }

    // Method to check if enemy is alive
    public boolean isAlive() {
        return health > 0;
    }
}
