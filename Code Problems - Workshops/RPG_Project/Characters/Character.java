package RPG_Project.Characters;

import RPG_Project.Enemies.Enemy;
import RPG_Project.Items.Item;

public abstract class Character {
    // Atributos privados
    private String name;
    private int health;
    private int maxHealth;
    private int mana;
    private int maxMana;

    // Constructor
    public Character(String name, int maxHealth, int maxMana) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.maxMana = maxMana;
        this.mana = maxMana;
    }

    // Ataca a un enemigo infligiendo daño base
    public void attack(Enemy enemy) {
        enemy.receiveDamage(getBaseAttackDamage());
    }

    // Método abstracto: habilidad especial implementada por cada subclase
    public abstract void specialAbility(Enemy enemy);

    // Método abstracto: define el daño base por tipo de personaje
    protected abstract int getBaseAttackDamage();

    // Recibir daño y reducir salud
    public void receiveDamage(int damage) {
        health = Math.max(0, health - damage);
        System.out.println(name + " ha recibido " + damage + " puntos de daño.");
    }

    // Uso de ítem para curarse o recuperar maná
    public void useItem(Item item) {
        item.use(this);
    }

    // Verifica si el personaje sigue vivo
    public boolean isAlive() {
        return health > 0;
    }

    // Restaurar salud y maná (útil para ítems)
    public void restoreHealth(int amount) {
        health = Math.min(maxHealth, health + amount);
        System.out.println(name + " recupera " + amount + " puntos de salud.");
    }

    public void restoreMana(int amount) {
        mana = Math.min(maxMana, mana + amount);
        System.out.println(name + " recupera " + amount + " puntos de maná.");
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getMana() {
        return mana;
    }

    public int getMaxMana() {
        return maxMana;
    }

    // Setters si se necesitan
    public void setHealth(int health) {
        this.health = health;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}
