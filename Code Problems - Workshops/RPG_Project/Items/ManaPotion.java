package RPG_Project.Items;

import RPG_Project.Characters.Character;

public class ManaPotion extends Item {

    // Constructor
    public ManaPotion() {
        super("Poción de Maná", "Restaura el 40% del maná máximo del personaje.");
    }

    // Uso del ítem: restaura maná al personaje
    @Override
    public void use(Character character) {
        int maxMana = character.getMaxMana();
        int restoreAmount = (int) Math.round(maxMana * 0.4);
        int newMana = Math.min(character.getMana() + restoreAmount, maxMana);
        int actualRestored = newMana - character.getMana();
        character.setMana(newMana);
        System.out.println(character.getName() + " ha usado una " + getName() +
                " y ha recuperado " + actualRestored + " puntos de maná.");
    }
}