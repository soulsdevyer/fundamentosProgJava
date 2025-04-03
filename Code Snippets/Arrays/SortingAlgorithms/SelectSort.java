// Clase que implementa el algoritmo de Selection Sort en Java.
public class SelectionSort {

    // Método principal para ordenar un arreglo utilizando el algoritmo SelectionSort
    public static void selectionSort(int[] arr) {
        // Iteramos sobre cada posición del arreglo
        int n = arr.length;

        // Bucle exterior para cada posición del arreglo
        for (int i = 0; i < n - 1; i++) {
            // Suponemos que el elemento más pequeño está en la posición i
            int minIndex = i;

            // Bucle interior para buscar el elemento más pequeño a partir de la posición i+1
            for (int j = i + 1; j < n; j++) {
                // Si encontramos un elemento más pequeño, actualizamos el índice del mínimo
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Si el índice mínimo no es el mismo que i, intercambiamos los elementos
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    // Método auxiliar para imprimir el arreglo de manera más legible
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Método main para probar la implementación de SelectionSort
    public static void main(String[] args) {
        // Creamos un arreglo de enteros desordenados
        int[] arr = {64, 25, 12, 22, 11};

        // Imprimimos el arreglo original
        System.out.println("Original array:");
        printArray(arr);

        // Llamamos al método selectionSort para ordenar el arreglo
        selectionSort(arr);

        // Imprimimos el arreglo ya ordenado
        System.out.println("Sorted array:");
        printArray(arr);
    }
}
