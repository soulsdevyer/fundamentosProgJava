package RPG_Project.Characters;

import RPG_Project.Enemies.Enemy;

public class Warrior extends Character {

    // Constructor
    public Warrior(String name) {
        super(name, 120, 30);
    }

    @Override
    protected int getBaseAttackDamage() {
        return 20;
    }

    @Override
    public void specialAbility(Enemy enemy) {
        int manaCost = 10;
        if (getMana() >= manaCost) {
            int specialDamage = 35;
            enemy.receiveDamage(specialDamage);
            setMana(getMana() - manaCost);
            System.out
                    .println(getName() + " realiza un ataque poderoso e inflige " + specialDamage + " puntos de daño.");
        } else {
            System.out.println(getName() + " no tiene suficiente maná. Realiza un ataque normal.");
            attack(enemy);
        }
    }
}
