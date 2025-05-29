package RPG_Project.Characters;

import RPG_Project.Enemies.Enemy;

public class Mage extends Character {

    // Constructor
    public Mage(String name) {
        super(name, 80, 50); // Ejemplo: menos salud pero más maná que el guerrero
    }

    // Daño base del ataque normal del mago
    @Override
    protected int getBaseAttackDamage() {
        return 15;
    }

    // Habilidad especial: lanza un hechizo de alto daño
    @Override
    public void specialAbility(Enemy enemy) {
        int manaCost = 15;
        if (getMana() >= manaCost) {
            int specialDamage = 40;
            enemy.receiveDamage(specialDamage);
            setMana(getMana() - manaCost);
            System.out
                    .println(getName() + " lanza un hechizo poderoso e inflige " + specialDamage + " puntos de daño.");
        } else {
            System.out.println(getName() + " no tiene suficiente maná. Realiza un ataque mágico normal.");
            attack(enemy);
        }
    }
}