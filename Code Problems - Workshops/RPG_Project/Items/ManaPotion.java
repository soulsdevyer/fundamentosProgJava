package RPG_Project.Items;

import RPG_Project.Characters.Character;

public class ManaPotion extends Item {

    private int manaAmount;

    // Constructor
    public ManaPotion() {
        super("Poción de Maná", "Restaura una cantidad de maná al personaje.");
        this.manaAmount = 20; // Cantidad de maná a restaurar
    }

    // Uso del ítem: restaura maná al personaje
    @Override
    public void use(Character character) {
        character.restoreMana(manaAmount);
        System.out.println(character.getName() + " ha usado una " + getName() +
                " y ha recuperado " + manaAmount + " puntos de maná.");
    }
}
