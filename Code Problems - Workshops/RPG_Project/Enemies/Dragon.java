package RPG_Project.Enemies;

import RPG_Project.Characters.Character;

import java.util.Random;

public class Dragon extends Enemy {

    private Random random = new Random();

    // Constructor
    public Dragon() {
        super("Dragón", 120, 25); // Salud muy alta, daño base alto
    }

    // Ataque del dragón: posibilidad de usar aliento de fuego
    @Override
    public void attack(Character character) {
        boolean useFireBreath = random.nextBoolean(); // 50% de probabilidad

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
