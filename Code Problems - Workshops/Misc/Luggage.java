import java.util.Scanner;

/**
 * Clase que valida las dimensiones del equipaje para determinar si puede ir en
 * cabina.
 */
public class Luggage {
    // Constantes para las restricciones de equipaje
    private static final double MAX_WEIGHT = 10.0; // kg
    private static final double MAX_HEIGHT = 35.0; // cm
    private static final double MAX_WIDTH = 25.0; // cm
    private static final double MAX_LENGTH = 55.0; // cm

    /**
     * Método principal que solicita las dimensiones del equipaje y determina si
     * puede ir en cabina.
     * 
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        // Crea un objeto Scanner para leer entradas del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario que ingrese las dimensiones y peso del equipaje
        System.out.println("Enter luggage weight (kg):");
        double weight = scanner.nextDouble(); // Lee el peso del equipaje

        System.out.println("Enter luggage height (cm):");
        double height = scanner.nextDouble(); // Lee la altura del equipaje

        System.out.println("Enter luggage width (cm):");
        double width = scanner.nextDouble(); // Lee el ancho del equipaje

        System.out.println("Enter luggage length (cm):");
        double length = scanner.nextDouble(); // Lee la longitud del equipaje

        // Llama al método canBeCarried para validar las dimensiones
        String result = canBeCarried(weight, height, width, length);
        
        // Muestra el resultado (si puede ir en cabina o debe ir en el compartimiento)
        System.out.println(result);

        // Cierra el scanner para liberar recursos
        scanner.close();
    }

    /**
     * Valida si las dimensiones y el peso del equipaje cumplen con los requisitos
     * para cabina.
     * 
     * @param weight Peso en kilogramos
     * @param height Altura en centímetros
     * @param width  Ancho en centímetros
     * @param length Longitud en centímetros
     * @return Mensaje indicando si el equipaje puede ir en cabina o debe ir en
     *         el compartimiento
     */
    public static String canBeCarried(double weight, double height, double width, double length) {
        // Compara las dimensiones del equipaje con los valores máximos permitidos
        if (weight <= MAX_WEIGHT &&
                height <= MAX_HEIGHT &&
                width <= MAX_WIDTH &&
                length <= MAX_LENGTH) {
            // Si el equipaje cumple con todos los límites, se puede llevar en cabina
            return "Your luggage can go in the cabin";
        }
        // Si no cumple con los límites, debe ir en el compartimiento
        return "Your luggage must go in the hold";
    }
}
