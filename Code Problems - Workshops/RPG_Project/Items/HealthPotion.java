package RPG_Project.Items;

import RPG_Project.Characters.Character;

public class HealthPotion extends Item {

    private int healingAmount;

    // Constructor
    public HealthPotion() {
        super("Poción de Salud", "Restaura una cantidad de salud al personaje.");
        this.healingAmount = 30; // Cantidad de salud a restaurar
    }

    // Uso del ítem: restaura salud al personaje
    @Override
    public void use(Character character) {
        character.restoreHealth(healingAmount);
        System.out.println(character.getName() + " ha usado una " + getName() +
                " y ha recuperado " + healingAmount + " puntos de salud.");
    }
}
