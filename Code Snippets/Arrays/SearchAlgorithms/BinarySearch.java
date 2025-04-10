import java.util.Arrays;

/**
 * Implementación del algoritmo de búsqueda binaria.
 * Requiere que el array esté ordenado para que funcione correctamente.
 */
public class BinarySearch {

    /**
     * Método principal para demostrar la búsqueda binaria.
     * Incluye un ejemplo con arreglos tanto ordenados como desordenados.
     * 
     * @param args Argumentos de línea de comando (no utilizados)
     */
    public static void main(String[] args) {
        // Creamos un arreglo desordenado de enteros
        int[] unsortedNumbers = { 4, 2, 7, 1, 9, 5, 3 };
        
        // Imprimimos el arreglo desordenado
        System.out.println("Arreglo desordenado:");
        displayArray(unsortedNumbers);

        // Ordenamos el arreglo antes de realizar la búsqueda binaria
        int[] numbers = unsortedNumbers.clone();
        Arrays.sort(numbers);
        
        // Imprimimos el arreglo ordenado
        System.out.println("\nArreglo ordenado:");
        displayArray(numbers);

        // Definimos el elemento a buscar en el arreglo
        int searchElement = 7;
        System.out.printf("\nBuscando el elemento %d usando búsqueda binaria...\n", searchElement);

        // Realizamos la búsqueda binaria
        int index = findElementBinary(numbers, searchElement);

        // Mostramos el resultado de la búsqueda
        if (index != -1) {
            System.out.printf("Elemento %d encontrado en el índice: %d\n", searchElement, index);
        } else {
            System.out.printf("Elemento %d no encontrado\n", searchElement);
        }
    }

    /**
     * Realiza la búsqueda binaria utilizando un enfoque recursivo.
     * 
     * @param array   Arreglo ordenado donde se va a buscar
     * @param element Elemento que se busca
     * @return Índice del elemento si se encuentra, -1 si no se encuentra
     */
    public static int findElementBinary(int[] array, int element) {
        // Llamamos a la función auxiliar recursiva para realizar la búsqueda binaria
        return binarySearchRecursive(array, element, 0, array.length - 1);
    }

    /**
     * Método auxiliar recursivo para la búsqueda binaria.
     * Este método divide el arreglo en subarreglos y verifica el elemento central.
     * 
     * @param array   Arreglo ordenado donde se va a buscar
     * @param element Elemento que se busca
     * @param left    Índice izquierdo del subarreglo actual
     * @param right   Índice derecho del subarreglo actual
     * @return Índice del elemento si se encuentra, -1 si no se encuentra
     */
    private static int binarySearchRecursive(int[] array, int element, int left, int right) {
        // Caso base: si el índice izquierdo supera el derecho, el elemento no se encuentra
        if (left > right) {
            return -1;
        }

        // Calculamos el índice central
        int mid = left + (right - left) / 2;

        // Comprobamos si el elemento está en la posición central
        if (array[mid] == element) {
            return mid;
        }

        // Si el elemento es menor que el central, buscamos en el subarreglo izquierdo
        if (array[mid] > element) {
            return binarySearchRecursive(array, element, left, mid - 1);
        }

        // Si el elemento es mayor que el central, buscamos en el subarreglo derecho
        return binarySearchRecursive(array, element, mid + 1, right);
    }

    /**
     * Realiza la búsqueda binaria utilizando un enfoque iterativo.
     * 
     * @param array   Arreglo ordenado donde se va a buscar
     * @param element Elemento que se busca
     * @return Índice del elemento si se encuentra, -1 si no se encuentra
     */
    public static int findElementBinaryIterative(int[] array, int element) {
        int left = 0;
        int right = array.length - 1;

        // Bucle hasta que el subarreglo sea vacío
        while (left <= right) {
            // Calculamos el índice central
            int mid = left + (right - left) / 2;

            // Si el elemento se encuentra en la posición central
            if (array[mid] == element) {
                return mid;
            }

            // Si el elemento es menor que el central, buscamos en el subarreglo izquierdo
            if (array[mid] > element) {
                right = mid - 1;
            } else {
                // Si el elemento es mayor que el central, buscamos en el subarreglo derecho
                left = mid + 1;
            }
        }
        return -1;
    }

    /**
     * Muestra los elementos de un arreglo en un formato legible.
     * 
     * @param array Arreglo que se va a mostrar
     */
    public static void displayArray(int[] array) {
        // Recorremos el arreglo e imprimimos cada elemento, separándolos con comas
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(); // Nueva línea después de imprimir el arreglo
    }
}
