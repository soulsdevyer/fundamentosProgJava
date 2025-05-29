package RPG_Project.Enemies;

import RPG_Project.Characters.Character;

public abstract class Enemy {

    private String name;
    private int health;
    private int attackPower;

    public Enemy(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void attack(Character player) {
        player.receiveDamage(attackPower);
        System.out.println(name + " ataca a " + player.getName() + " e inflige " + attackPower + " puntos de daño.");
    }

    public void receiveDamage(int damage) {
        health = Math.max(0, health - damage);
        System.out.println(name + " recibe " + damage + " puntos de daño.");
    }

    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
