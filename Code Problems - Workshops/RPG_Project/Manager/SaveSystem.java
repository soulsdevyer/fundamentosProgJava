package RPG_Project.Manager;

import java.io.*;

public class SaveSystem {

    private static final String SAVE_FOLDER = "SaveFiles";
    private static final String SAVE_PATH = SAVE_FOLDER + "/save.dat";

    public static void saveGame(GameState state) {
        try {
            // Crear la carpeta SaveFile si no existe
            File folder = new File(SAVE_FOLDER);
            if (!folder.exists()) {
                folder.mkdirs();
            }

            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SAVE_PATH))) {
                oos.writeObject(state);
                System.out.println("Partida guardada exitosamente en: " + SAVE_PATH);
            }

        } catch (IOException e) {
            System.out.println("Error al guardar la partida: " + e.getMessage());
        }
    }

    public static GameState loadGame() {
        File file = new File(SAVE_PATH);
        if (!file.exists()) {
            System.out.println(" No se encontró el archivo de guardado en: " + SAVE_PATH);
            return null;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SAVE_PATH))) {
            GameState state = (GameState) ois.readObject();
            System.out.println("Partida cargada desde: " + SAVE_PATH);
            return state;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar partida: " + e.getMessage());
            return null;
        }
    }
}
