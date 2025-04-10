import java.util.Scanner;

/**
 * Clase que implementa dos métodos de búsqueda en un arreglo: búsqueda lineal y
 * búsqueda binaria.
 * Permite al usuario buscar números en un arreglo ordenado y compara los
 * resultados.
 */
public class FindNNumberInArray {

    /**
     * Método principal que ejecuta el programa.
     * Maneja la interacción con el usuario y las llamadas a los métodos de
     * búsqueda.
     * 
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueExecution = true;
        // Arreglo ordenado de números para realizar las búsquedas
        int[] numbers = { 1, 2, 2, 3, 4, 5, 11, 12, 13, 17, 31, 40, 42, 99, 139, 1830 };

        // Bucle para permitir múltiples búsquedas
        while (continueExecution) {
            System.out.println("Ingresa el número a buscar en el arreglo: ");
            int target = scanner.nextInt();

            // Realiza la búsqueda binaria
            int result = binarySearch(numbers, target);

            // Muestra el resultado de la búsqueda
            if (result != -1) {
                System.out.println("Número " + target + " encontrado en la posición: " + result);
            } else {
                System.out.println("Número " + target + " no encontrado en el arreglo.");
            }

            // Pregunta al usuario si desea continuar
            System.out.println("Ingresa 1 para continuar buscando, o cualquier otro número para detenerse");
            int option = scanner.nextInt();
            if (option != 1) {
                continueExecution = false;
            }
        }
        scanner.close();
    }

    /**
     * Implementa el algoritmo de búsqueda lineal.
     * Complejidad temporal: O(n) - donde n es el tamaño del arreglo.
     * 
     * @param numbers Arreglo donde se realizará la búsqueda
     * @param target  Número a buscar
     * @return Índice donde se encuentra el número, -1 si no se encuentra
     */
    public static int linearSearch(int[] numbers, int target) {
        // Recorremos el arreglo de principio a fin
        for (int i = 0; i < numbers.length; i++) {
            // Si encontramos el número, devolvemos el índice
            if (numbers[i] == target) {
                return i;
            }
        }
        // Si no encontramos el número, devolvemos -1
        return -1;
    }

    /**
     * Implementa el algoritmo de búsqueda binaria.
     * Requiere que el arreglo esté ordenado.
     * Complejidad temporal: O(log n) - donde n es el tamaño del arreglo.
     * 
     * @param numbers Arreglo ordenado donde se realizará la búsqueda
     * @param target  Número a buscar
     * @return Índice donde se encuentra el número, -1 si no se encuentra
     */
    public static int binarySearch(int[] numbers, int target) {
        // Definimos los índices izquierdo y derecho para la búsqueda
        int left = 0;
        int right = numbers.length - 1;

        // Mientras el rango de búsqueda sea válido
        while (left <= right) {
            // Calculamos el punto medio del arreglo
            int mid = (left + right) / 2;

            // Si encontramos el número en el medio, devolvemos el índice
            if (numbers[mid] == target) {
                return mid;
            } else if (target < numbers[mid]) {
                // Si el número es menor, buscamos en la mitad izquierda
                right = mid - 1;
            } else {
                // Si el número es mayor, buscamos en la mitad derecha
                left = mid + 1;
            }
        }
        // Si no encontramos el número, devolvemos -1
        return -1;
    }
}
