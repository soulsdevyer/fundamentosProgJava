package RPG_Project.Characters;

import RPG_Project.Enemies.Enemy;
import RPG_Project.Items.Item;

public abstract class Character {

    private String name;
    private int health;
    private int maxHealth;
    private int mana;
    private int maxMana;

    public Character(String name, int maxHealth, int maxMana) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.maxMana = maxMana;
        this.mana = maxMana;
    }

    public void attack(Enemy enemy) {
        enemy.receiveDamage(getBaseAttackDamage());
    }

    public abstract void specialAbility(Enemy enemy);

    protected abstract int getBaseAttackDamage();

    public void receiveDamage(int damage) {
        health = Math.max(0, health - damage);
        System.out.println(name + " ha recibido " + damage + " puntos de daño.");
    }

    public void useItem(Item item) {
        item.use(this);
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void restoreHealth(int amount) {
        health = Math.min(maxHealth, health + amount);
        System.out.println(name + " recupera " + amount + " puntos de salud.");
    }

    public void restoreMana(int amount) {
        mana = Math.min(maxMana, mana + amount);
        System.out.println(name + " recupera " + amount + " puntos de maná.");
    }

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

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}
