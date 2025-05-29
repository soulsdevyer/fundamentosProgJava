package RPG_Project.Items;

import RPG_Project.Characters.Character;

public abstract class Item {
    // Atributos privados
    private String name;
    private String description;

    // Constructor
    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Método abstracto: se implementa en cada tipo de ítem
    public abstract void use(Character character);

    // Getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // Setter opcionales si deseas modificar los valores
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
