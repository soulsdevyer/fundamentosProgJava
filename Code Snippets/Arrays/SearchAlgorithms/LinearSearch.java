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
        // Creamos un arreglo con números desordenados
        int[] numbers = { 4, 2, 7, 1, 9, 5, 3 };

        // Mostramos el arreglo original
        System.out.println("Arreglo original:");
        displayArray(numbers);

        // Definimos el elemento a buscar en el arreglo
        int searchElement = 7;
        System.out.printf("\nBuscando el elemento %d en el arreglo...\n", searchElement);

        // Realizamos la búsqueda del índice del elemento en el arreglo
        int index = findElementIndex(numbers, searchElement);

        // Mostramos el resultado de la búsqueda
        if (index != -1) {
            System.out.printf("Elemento %d encontrado en el índice: %d\n", searchElement, index);
        } else {
            System.out.printf("Elemento %d no encontrado\n", searchElement);
        }
    }

    /**
     * Busca un elemento en el arreglo y devuelve su índice.
     * Este es un algoritmo de búsqueda lineal que recorre todo el arreglo.
     * 
     * @param array   Arreglo donde se realizará la búsqueda
     * @param element Elemento que se busca
     * @return Índice del elemento si se encuentra, -1 si no está presente
     */
    public static int findElementIndex(int[] array, int element) {
        // Recorremos el arreglo buscando el elemento
        for (int i = 0; i < array.length; i++) {
            // Si encontramos el elemento, devolvemos su índice
            if (array[i] == element) {
                return i;
            }
        }
        // Si no se encuentra el elemento, devolvemos -1
        return -1;
    }

    /**
     * Verifica si un elemento existe en el arreglo.
     * 
     * @param array   Arreglo donde se realizará la búsqueda
     * @param element Elemento a buscar
     * @return true si el elemento existe, false si no se encuentra en el arreglo
     */
    public static boolean containsElement(int[] array, int element) {
        // Recorremos el arreglo verificando si el elemento existe
        for (int value : array) {
            if (value == element) {
                return true; // El elemento existe
            }
        }
        return false; // El elemento no existe
    }

    /**
     * Muestra el contenido del arreglo en la consola.
     * 
     * @param array Arreglo que se mostrará en la consola
     */
    public static void displayArray(int[] array) {
        // Recorremos el arreglo e imprimimos cada elemento, separados por comas
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(); // Salto de línea después de imprimir el arreglo
    }
}
