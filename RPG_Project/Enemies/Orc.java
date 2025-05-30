package Enemies;

import Characters.Character;

public class Orc extends Enemy {

    // Constructor
    public Orc() {
        super("Orco", 100, 20);
    }

    @Override
    public void attack(Character character) {
        character.receiveDamage(getAttackPower());
        System.out.println("El Orco lanza un poderoso golpe y causa " + getAttackPower() + " puntos de daño a "
                + character.getName() + ".");
    }
}
