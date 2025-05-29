// Clase que implementa el algoritmo de Bubble Sort en Java.
public class BubbleSort {

    // Método principal para ordenar un arreglo utilizando el algoritmo BubbleSort
    public static void bubbleSort(int[] arr) {
        // Iteramos sobre el arreglo
        int n = arr.length;
        
        // Bucle para recorrer todo el arreglo. Cada vez que se pasa por el arreglo,
        // se reduce el número de elementos que deben ser comparados (pues el mayor
        // elemento "burbujeará" al final).
        for (int i = 0; i < n - 1; i++) {
            // Bandera para verificar si ya hubo intercambios. Si no hubo intercambios
            // en una iteración, el arreglo ya está ordenado.
            boolean swapped = false;
            
            // Bucle interno para comparar elementos adyacentes
            for (int j = 0; j < n - 1 - i; j++) {
                // Si el elemento actual es mayor que el siguiente, los intercambiamos
                if (arr[j] > arr[j + 1]) {
                    // Intercambiamos los elementos usando una variable temporal
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                    // Establecemos la bandera a true ya que ocurrió un intercambio
                    swapped = true;
                }
            }

            // Si no hubo intercambios, el arreglo ya está ordenado
            if (!swapped) {
                break;
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

    // Método main para probar la implementación de BubbleSort
    public static void main(String[] args) {
        // Creamos un arreglo de enteros desordenados
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        // Imprimimos el arreglo original
        System.out.println("Original array:");
        printArray(arr);

        // Llamamos al método bubbleSort para ordenar el arreglo
        bubbleSort(arr);

        // Imprimimos el arreglo ya ordenado
        System.out.println("Sorted array:");
        printArray(arr);
    }
}
