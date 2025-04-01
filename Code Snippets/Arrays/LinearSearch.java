
/**
 * Implementación de algoritmos de búsqueda lineal.
 * Demuestra diferentes variantes del algoritmo de búsqueda secuencial.
 */
public class LinearSearch {

    /**
     * Método principal que demuestra el uso de los algoritmos de búsqueda.
     * 
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        int[] numbers = { 4, 2, 7, 1, 9, 5, 3 };

        System.out.println("Original array:");
        displayArray(numbers);

        int searchElement = 7;
        int index = findElementIndex(numbers, searchElement);
        System.out.printf("\nSearching for %d in array...\n", searchElement);

        if (index != -1) {
            System.out.printf("Element %d found at index: %d\n", searchElement, index);
        } else {
            System.out.printf("Element %d not found\n", searchElement);
        }
    }

    /**
     * Busca un elemento en el array y devuelve su índice.
     * 
     * @param array   Array donde se realizará la búsqueda
     * @param element Elemento a buscar
     * @return índice del elemento si se encuentra, -1 si no está presente
     */
    public static int findElementIndex(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Verifica si un elemento existe en el array.
     * 
     * @param array   Array donde se realizará la búsqueda
     * @param element Elemento a buscar
     * @return true si el elemento existe, false en caso contrario
     */
    public static boolean containsElement(int[] array, int element) {
        for (int value : array) {
            if (value == element) {
                return true;
            }
        }
        return false;
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