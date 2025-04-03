import java.util.Scanner;
import java.util.Arrays;

public class PatternDetectorHM {

    /**
     * Método principal que ejecuta el programa.
     * Permite al usuario ingresar 10 números y luego detecta el patrón en el arreglo.
     * 
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario que ingrese 10 números
        System.out.println("Por favor, ingresa 10 números:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        // Llama al método para detectar el patrón en el arreglo
        int[] result = detectPattern(numbers);

        // Muestra el arreglo original
        System.out.println("Arreglo original: " + Arrays.toString(numbers));

        // Muestra el nuevo arreglo con el patrón detectado
        System.out.println("\nArreglo nuevo: " + Arrays.toString(result));
    }

    /**
     * Método que detecta un patrón en el arreglo de entrada.
     * El patrón consiste en duplicar los elementos del arreglo original
     * y luego llenar el resto del arreglo con ceros.
     * 
     * @param array Arreglo original de números
     * @return Un nuevo arreglo con el patrón detectado
     */
    public static int[] detectPattern(int[] array) {
        // Crea un nuevo arreglo de tamaño (longitud original - 1) * 2
        int[] newArray = new int[(array.length - 1) * 2];
        int newIndex = 0;

        // Copia los elementos del arreglo original al nuevo arreglo
        for (int i = 0; i < array.length - 1; i++) {
            newArray[newIndex++] = array[i];
        }

        // Vuelve a copiar los mismos elementos para duplicarlos
        for (int i = 0; i < array.length - 1; i++) {
            newArray[newIndex++] = array[i];
        }

        // Llena el resto del nuevo arreglo con ceros
        while (newIndex < newArray.length) {
            newArray[newIndex++] = 0;
        }

        // Devuelve el arreglo con el patrón detectado
        return newArray;
    }
}
