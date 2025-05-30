package Enemies;

import Characters.Character;

import java.util.Random;

public class Dragon extends Enemy {

    private Random random = new Random();

    // Constructor
    public Dragon() {
        super("Dragón", 200, 40);
    }

    @Override
    public void attack(Character character) {
        boolean useFireBreath = random.nextBoolean(); // Tiene una probabilidad del 50% de usar aliento de fuego

        if (useFireBreath) {
            int fireDamage = getAttackPower() + 15;
            character.receiveDamage(fireDamage);
            System.out.println("¡El Dragón lanza su aliento de fuego y causa " + fireDamage + " puntos de daño a "
                    + character.getName() + "!");
        } else {
            character.receiveDamage(getAttackPower());
            System.out.println("El Dragón ataca con sus garras y causa " + getAttackPower() + " puntos de daño a "
                    + character.getName() + ".");
        }
    }
}
