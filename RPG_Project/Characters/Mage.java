package Characters;

import Enemies.Enemy;

public class Mage extends Character {

    public Mage(String name) {
        super(name, 70, 120);
    }

    @Override
    protected int getBaseAttackDamage() {
        return 15;
    }

    @Override
    public void specialAbility(Enemy enemy) {
        int manaCost = 15;
        if (getMana() >= manaCost) {
            int specialDamage = 40;
            enemy.receiveDamage(specialDamage);
            setMana(getMana() - manaCost);
            System.out
                    .println(getName() + " lanza una bola de fuego poderosa e inflige " + specialDamage
                            + " puntos de daño.");
        } else {
            System.out.println(getName() + " no tiene suficiente maná. Realiza un ataque mágico normal.");
            attack(enemy);
        }
    }
}