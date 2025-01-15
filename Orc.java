public class Orc extends Enemy {
    public Orc() {
        super("Orc", 50, 10);  // Orc with 50 health and 10 attack power
    }

    @Override
    public void attack(Player player) {
        System.out.println("The Orc swings its club!");
        player.takeDamage(attackPower);
    }
}
//sub class of enemy