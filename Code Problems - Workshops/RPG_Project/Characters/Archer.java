package RPG_Project.Characters;

import RPG_Project.Enemies.Enemy;

public class Archer extends Character {

    // Constructor
    public Archer(String name) {
        super(name, 90, 40); // Salud y maná intermedios entre Warrior y Mage
    }

    // Daño base del ataque normal del arquero
    @Override
    protected int getBaseAttackDamage() {
        return 18;
    }

    // Habilidad especial: golpe crítico a distancia
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
