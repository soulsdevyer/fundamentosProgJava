
import java.util.Arrays;

/**
 * Implementación del algoritmo de búsqueda binaria.
 * Requiere que el array esté ordenado para funcionar correctamente.
 */
public class BinarySearch {

    /**
     * Método principal para demostrar la búsqueda binaria.
     * Incluye ejemplo con array ordenado y desordenado.
     * 
     * @param args Argumentos de línea de comando (no utilizados)
     */
    public static void main(String[] args) {
        int[] unsortedNumbers = { 4, 2, 7, 1, 9, 5, 3 };
        System.out.println("Unsorted array:");
        displayArray(unsortedNumbers);

        // Ordenamos el array para la búsqueda binaria
        int[] numbers = unsortedNumbers.clone();
        Arrays.sort(numbers);
        System.out.println("\nSorted array:");
        displayArray(numbers);

        int searchElement = 7;
        int index = findElementBinary(numbers, searchElement);
        System.out.printf("\nSearching for %d using binary search...\n", searchElement);

        if (index != -1) {
            System.out.printf("Element %d found at index: %d\n", searchElement, index);
        } else {
            System.out.printf("Element %d not found\n", searchElement);
        }
    }

    /**
     * Implementa la búsqueda binaria recursiva.
     * 
     * @param array   Array ordenado donde buscar
     * @param element Elemento a buscar
     * @return índice del elemento si se encuentra, -1 si no está presente
     */
    public static int findElementBinary(int[] array, int element) {
        return binarySearchRecursive(array, element, 0, array.length - 1);
    }

    /**
     * Método recursivo auxiliar para la búsqueda binaria.
     * 
     * @param array   Array ordenado donde buscar
     * @param element Elemento a buscar
     * @param left    Índice izquierdo del subarreglo actual
     * @param right   Índice derecho del subarreglo actual
     * @return índice del elemento si se encuentra, -1 si no está presente
     */
    private static int binarySearchRecursive(int[] array, int element, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (array[mid] == element) {
            return mid;
        }

        if (array[mid] > element) {
            return binarySearchRecursive(array, element, left, mid - 1);
        }

        return binarySearchRecursive(array, element, mid + 1, right);
    }

    /**
     * Implementa la búsqueda binaria iterativa.
     * 
     * @param array   Array ordenado donde buscar
     * @param element Elemento a buscar
     * @return índice del elemento si se encuentra, -1 si no está presente
     */
    public static int findElementBinaryIterative(int[] array, int element) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == element) {
                return mid;
            }

            if (array[mid] > element) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    /**
     * Muestra el contenido del array en la consola.
     * 
     * @param array Array a mostrar
     */
    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}