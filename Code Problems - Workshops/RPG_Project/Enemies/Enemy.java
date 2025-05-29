package RPG_Project.Enemies;

import RPG_Project.Characters.Character;

public abstract class Enemy {
    // Atributos privados
    private String name;
    private int health;
    private int attackPower;

    // Constructor
    public Enemy(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    // Método de ataque a un personaje
    public void attack(Character player) {
        player.receiveDamage(attackPower);
        System.out.println(name + " ataca a " + player.getName() + " e inflige " + attackPower + " puntos de daño.");
    }

    // Recibir daño del jugador
    public void receiveDamage(int damage) {
        health = Math.max(0, health - damage);
        System.out.println(name + " recibe " + damage + " puntos de daño.");
    }

    // Verifica si el enemigo está vivo
    public boolean isAlive() {
        return health > 0;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    // Setter opcional (por si deseas modificar salud directamente)
    public void setHealth(int health) {
        this.health = health;
    }
}
