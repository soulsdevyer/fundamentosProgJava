package RPG_Project.Enemies;

import RPG_Project.Characters.Character;

public class Goblin extends Enemy {

    public Goblin() {
        super("Goblin", 50, 10);
    }

    @Override
    public void attack(Character character) {
        character.receiveDamage(getAttackPower());
        System.out.println("El Goblin ataca con su daga e inflige " + getAttackPower() + " puntos de daño a "
                + character.getName() + ".");
    }
}
