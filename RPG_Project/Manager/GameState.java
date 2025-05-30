package Manager;

import java.io.Serializable;
import java.util.List;
import Characters.Character;
import Enemies.Enemy;

import Items.Item;

public class GameState implements Serializable {
    private Character player;
    private List<Enemy> enemies;
    private List<Item> inventory;

    public GameState(Character player, List<Enemy> enemies, List<Item> inventory) {
        this.player = player;
        this.enemies = enemies;
        this.inventory = inventory;
    }

    public Character getPlayer() {
        return player;
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }

    public List<Item> getInventory() {
        return inventory;
    }
}
