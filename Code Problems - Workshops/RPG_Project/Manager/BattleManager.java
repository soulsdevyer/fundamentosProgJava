package RPG_Project.Manager;

import java.util.List;
import java.util.Scanner;
import RPG_Project.Characters.Character;
import RPG_Project.Enemies.Enemy;
import RPG_Project.Items.Item;

public class BattleManager {

    private Character player;
    private List<Enemy> enemies;
    private List<Item> inventory;

    private Scanner scanner = new Scanner(System.in);

    public BattleManager(Character player, List<Enemy> enemies, List<Item> inventory) {

        this.player = player;
        this.enemies = enemies;
        this.inventory = inventory;
    }

    public void startBattle() {
        System.out.println("¡La batalla comienza!");

        while (!isBattleOver()) {
            playerTurn();

            if (isBattleOver())
                break;

            enemiesTurn();
        }

        if (player.isAlive()) {
            System.out.println("¡Has derrotado a todos los enemigos!");
        } else {
            System.out.println("Has sido derrotado. Fin del juego.");
        }
    }

    public void playerTurn() {
        System.out.println("\nTu turno:");
        System.out.println("1. Atacar");
        System.out.println("2. Ver estado");
        System.out.println("3. Usar habilidad especial");
        if (!inventory.isEmpty()) {
            System.out.println("4. Usar item");
            System.out.println("5. Pausar el juego");
        } else {
            System.out.println("4. Pausar el juego");
        }

        System.out.print("Elige una opción: ");
        int option = scanner.nextInt();
        scanner.nextLine();

        if (!inventory.isEmpty()) {
            switch (option) {
                case 1 -> attackEnemy();
                case 2 -> {
                    viewStatus();
                    playerTurn();
                }
                case 3 -> useSpecialAbility();
                case 4 -> useItem();
                case 5 -> pauseGame();
                default -> {
                    System.out.println("Opción inválida.");
                    playerTurn();
                }
            }
        } else {
            switch (option) {
                case 1 -> attackEnemy();
                case 2 -> {
                    viewStatus();
                    playerTurn();
                }
                case 3 -> useSpecialAbility();
                case 4 -> pauseGame();
                default -> {
                    System.out.println("Opción inválida.");
                    playerTurn();
                }
            }
        }
    }

    public void enemiesTurn() {
        for (Enemy enemy : enemies) {
            if (enemy.isAlive()) {
                System.out.println("\nTurno de " + enemy.getClass().getSimpleName() + ":");
                enemy.attack(player);
                if (!player.isAlive()) {
                    break;
                }
            }
        }
    }

    private void useItem() {
        if (inventory.isEmpty()) {
            System.out.println("No tienes items disponibles.");
            return;
        }

        System.out.println("Items disponibles:");
        for (int i = 0; i < inventory.size(); i++) {
            Item item = inventory.get(i);
            System.out.println((i + 1) + ". " + item.getName() + " - " + item.getDescription());
        }

        System.out.print("Elige un item: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice < 1 || choice > inventory.size()) {
            System.out.println("Selección inválida.");
            useItem();
            return;
        }

        Item selectedItem = inventory.remove(choice - 1);
        selectedItem.use(player);

        enemiesTurn();
    }

    // Uso de GitHub Copilot: Desde VS Code se utilizó la IA para detectar cuándo
    // todos los enemigos han sido derrotados con el método
    // .stream().noneMatch(Enemy::isAlive)
    public boolean isBattleOver() {
        if (!player.isAlive())
            return true;

        boolean allEnemiesDefeated = enemies.stream().noneMatch(Enemy::isAlive);
        return allEnemiesDefeated;
    }

    private void attackEnemy() {
        Enemy target = chooseTarget();
        if (target != null) {
            player.attack(target);
        }
    }

    private void useSpecialAbility() {
        Enemy target = chooseTarget();
        if (target != null) {
            player.specialAbility(target);
        }
    }

    private void viewStatus() {
        System.out.println("\n=== ESTADO DEL PERSONAJE ===");
        System.out.println("Nombre: " + player.getName());
        System.out.println("Clase: " + player.getClass().getSimpleName());
        System.out.println("Salud: " + player.getHealth() + " / " + player.getMaxHealth());
        System.out.println("Maná: " + player.getMana() + " / " + player.getMaxMana());
        System.out.println("Estado: " + (player.isAlive() ? "Vivo" : "Muerto"));

        System.out.println("=== ENEMIGOS ACTIVOS ===");
        for (Enemy enemy : enemies) {
            System.out.println(enemy.getClass().getSimpleName() + " - Salud: " + enemy.getHealth() + " - "
                    + (enemy.isAlive() ? "Vivo" : "Muerto"));
        }
    }

    // Con GitHub Copilot desde VS Code se implementó el método stream().filter para
    // llenar una nueva lista de enemigos únicamente con los enemigos que están
    // vivos, para que el jugador no pueda seleccionar enemigos muertos
    private Enemy chooseTarget() {
        List<Enemy> aliveEnemies = enemies.stream().filter(Enemy::isAlive).toList();
        if (aliveEnemies.isEmpty())
            return null;

        System.out.println("Elige un enemigo:");
        for (int i = 0; i < aliveEnemies.size(); i++) {
            Enemy e = aliveEnemies.get(i);
            System.out.println((i + 1) + ". " + e.getClass().getSimpleName() + " (Salud: " + e.getHealth() + ")");
        }

        int choice = scanner.nextInt();
        scanner.nextLine();
        if (choice < 1 || choice > aliveEnemies.size()) {
            System.out.println("Selección inválida.");
            return chooseTarget();
        }

        return aliveEnemies.get(choice); // Se resta 1 ya que los indices de enemies comienzan en 0
    }

    private void pauseGame() {
        GameState state = new GameState(player, enemies, inventory);
        SaveSystem.saveGame(state);
        System.out.println("Juego pausado. Puedes reanudar más tarde.");
        System.exit(0);
    }

}
