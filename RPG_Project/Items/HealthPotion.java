package Items;

import Characters.Character;

public class HealthPotion extends Item {

    public HealthPotion() {
        super("Poción de Salud", "Restaura el 30% de la salud máxima del personaje.");
    }

    @Override
    public void use(Character character) {
        int maxHealth = character.getMaxHealth();
        int healingAmount = (int) Math.round(maxHealth * 0.3);
        int newHealth = Math.min(character.getHealth() + healingAmount, maxHealth); // Toma el valor mínimo de los dos
                                                                                    // parámetros de la función para
                                                                                    // evitar que supera la vida máxima
        int actualHealed = newHealth - character.getHealth();
        character.setHealth(newHealth);
        System.out.println(character.getName() + " ha usado una " + getName() +
                " y ha recuperado " + actualHealed + " puntos de salud.");
    }
}