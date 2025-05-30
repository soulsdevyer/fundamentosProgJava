
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import Characters.Archer;
import Characters.Character;
import Characters.Mage;
import Characters.Warrior;
import Enemies.*;
import Items.*;
import Manager.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("=== Bienvenido al Simulador de Batallas RPG ===");

        System.out.print("¿Deseas cargar la última partida guardada? (s/n): ");
        String loadOption = scanner.nextLine();

        if (loadOption.equalsIgnoreCase("s")) {
            GameState state = SaveSystem.loadGame();
            if (state != null) {
                BattleManager manager = new BattleManager(
                        state.getPlayer(),
                        state.getEnemies(),
                        state.getInventory());
                manager.startBattle();
                return;
            }
        }

        System.out.println("Elige tu personaje:");
        System.out.println("1. Guerrero");
        System.out.println("2. Mago");
        System.out.println("3. Arquero");
        System.out.print("Opción: ");
        int option = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Escribe el nombre de tu personaje: ");
        String playerName = scanner.nextLine();

        // Crear personaje
        Character player;
        switch (option) {
            case 1:
                player = new Warrior(playerName);
                break;
            case 2:
                player = new Mage(playerName);
                break;
            case 3:
                player = new Archer(playerName);
                break;
            default:
                System.out.println("Opción inválida. Se seleccionará Guerrero por defecto.");
                player = new Warrior(playerName);
                break;
        }

        System.out.println("Has elegido: " + translateClass(player.getClass().getSimpleName()));

        int healthPotions = random.nextInt(4);
        int manaPotions = random.nextInt(4);
        List<Item> inventory = new ArrayList<>();
        for (int i = 0; i < healthPotions; i++) {
            inventory.add(new HealthPotion());
        }
        for (int i = 0; i < manaPotions; i++) {
            inventory.add(new ManaPotion());
        }

        List<Enemy> enemies = new ArrayList<>();
        int totalEnemies = Math.max(1, random.nextInt(3));
        for (int i = 0; i < totalEnemies; i++) {
            int enemyClass = random.nextInt(3);
            switch (enemyClass) {
                case 0 -> enemies.add(new Goblin());
                case 1 -> enemies.add(new Orc());
                case 2 -> enemies.add(new Dragon());
            }

        }

        System.out.println("Te enfrentarás a " + enemies.size() + " enemigo(s). ¡Prepárate para la batalla!");
        for (Enemy enemy : enemies) {
            System.out.println("Enemigo: " + translateClass(enemy.getClass().getSimpleName()));
        }

        BattleManager manager = new BattleManager(player, enemies, inventory);
        manager.startBattle();

        scanner.close();
    }

    // Al escribir el nombre de la clase usando getClass().getSimpleName() se
    // imprime el nombre de la clase como está definida en el código, pero dado que
    // el código está escrito totalmente en inglés, implementé este método que se
    // llama cada vez que se imprime el nombre de una clase, sea personaje o
    // enemigo, en su versión al español
    private static String translateClass(String className) {
        return switch (className) {
            case "Warrior" -> "Guerrero";
            case "Mage" -> "Mago";
            case "Archer" -> "Arquero";
            case "Orc" -> "Orco";
            case "Dragon" -> "Dragón";
            default -> className;
        };
    }
}
