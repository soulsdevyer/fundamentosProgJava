package Items;

import Characters.Character;

public class ManaPotion extends Item {

    public ManaPotion() {
        super("Poción de Maná", "Restaura el 40% del maná máximo.");
    }

    @Override
    public void use(Character character) {
        int maxMana = character.getMaxMana();
        int restoreAmount = (int) Math.round(maxMana * 0.4);
        int newMana = Math.min(character.getMana() + restoreAmount, maxMana);// Toma el valor mínimo de los dos
                                                                             // parámetros de la función para
                                                                             // evitar que supera la vida máxima
        int actualRestored = newMana - character.getMana();
        character.setMana(newMana);
        System.out.println(character.getName() + " ha usado una " + getName() +
                " y ha recuperado " + actualRestored + " puntos de maná.");
    }
}