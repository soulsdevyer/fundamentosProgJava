package RPG_Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import RPG_Project.Characters.Character;
import RPG_Project.Characters.Archer;
import RPG_Project.Characters.Mage;
import RPG_Project.Characters.Warrior;
import RPG_Project.Enemies.Dragon;
import RPG_Project.Enemies.Enemy;
import RPG_Project.Enemies.Goblin;
import RPG_Project.Enemies.Orc;
import RPG_Project.Items.Item;
import RPG_Project.Items.HealthPotion;
import RPG_Project.Items.ManaPotion;
import RPG_Project.Manager.BattleManager;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("=== Bienvenido al Simulador de Batallas RPG ===");
        System.out.println("Elige tu personaje:");
        System.out.println("1. Guerrero");
        System.out.println("2. Mago");
        System.out.println("3. Arquero");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        System.out.print("Escribe el nombre de tu personaje: ");
        String nombre = scanner.nextLine();

        // Crear personaje
        Character jugador;
        switch (opcion) {
            case 1:
                jugador = new Warrior(nombre);
                break;
            case 2:
                jugador = new Mage(nombre);
                break;
            case 3:
                jugador = new Archer(nombre);
                break;
            default:
                System.out.println("Opción inválida. Se seleccionará Guerrero por defecto.");
                jugador = new Warrior(nombre);
                break;
        }

        System.out.println("Has elegido: " + jugador.getClass().getSimpleName());

        // Asignar ítems aleatorios
        int pocionesSalud = random.nextInt(4); // 0 a 3
        int pocionesMana = random.nextInt(4); // 0 a 3
        List<Item> inventario = new ArrayList<>();
        for (int i = 0; i < pocionesSalud; i++) {
            inventario.add(new HealthPotion());
        }
        for (int i = 0; i < pocionesMana; i++) {
            inventario.add(new ManaPotion());
        }

        // Generar enemigos
        List<Enemy> enemigos = new ArrayList<>();
        int cantidadEnemigos = 3; // Número fijo para demo
        for (int i = 0; i < cantidadEnemigos; i++) {
            int tipo = random.nextInt(3); // 0 = Goblin, 1 = Orc, 2 = Dragon
            switch (tipo) {
                case 0 -> enemigos.add(new Goblin());
                case 1 -> enemigos.add(new Orc());
                case 2 -> enemigos.add(new Dragon());
            }
        }

        System.out.println("Te enfrentarás a " + enemigos.size() + " enemigo(s). ¡Prepárate para la batalla!");

        // Instanciar y ejecutar BattleManager
        BattleManager manager = new BattleManager(jugador, enemigos, inventario);
        manager.startBattle();

        scanner.close();
    }
}
