package RPG_Project.Items;

import RPG_Project.Characters.Character;

public class HealthPotion extends Item {

    public HealthPotion() {
        super("Poción de Salud", "Restaura el 30% de la salud máxima del personaje.");
    }

    @Override
    public void use(Character character) {
        int maxHealth = character.getMaxHealth();
        int healingAmount = (int) Math.round(maxHealth * 0.3);
        int newHealth = Math.min(character.getHealth() + healingAmount, maxHealth);
        int actualHealed = newHealth - character.getHealth();
        character.setHealth(newHealth);
        System.out.println(character.getName() + " ha usado una " + getName() +
                " y ha recuperado " + actualHealed + " puntos de salud.");
    }
}