package Characters;

import Enemies.Enemy;

public class Archer extends Character {

    public Archer(String name) {
        super(name, 90, 60);
    }

    @Override
    protected int getBaseAttackDamage() {
        return 18;
    }

    @Override
    public void specialAbility(Enemy enemy) {
        int manaCost = 12;
        if (getMana() >= manaCost) {
            int specialDamage = 32;
            enemy.receiveDamage(specialDamage);
            setMana(getMana() - manaCost);
            System.out.println(getName() + " dispara un golpe crítico y causa " + specialDamage + " puntos de daño.");
        } else {
            System.out.println(getName() + " no tiene suficiente maná. Realiza un disparo normal.");
            attack(enemy);
        }
    }
}
