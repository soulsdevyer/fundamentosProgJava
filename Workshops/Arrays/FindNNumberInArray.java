package Arrays;

import java.util.Scanner;

/**
 * Clase que implementa dos métodos de búsqueda en un array: búsqueda lineal y
 * búsqueda binaria.
 * Permite al usuario buscar números en un array ordenado y compara los
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
        // Array ordenado de números para realizar las búsquedas
        int[] numbers = { 1, 2, 2, 3, 4, 5, 11, 12, 13, 17, 31, 40, 42, 99, 139, 1830 };

        while (continueExecution) {
            System.out.println("Enter the number to search for in the array: ");
            int target = scanner.nextInt();

            int result = binarySearch(numbers, target);

            if (result != -1) {
                System.out.println("Number " + target + " found at position: " + result);
            } else {
                System.out.println("Number " + target + " not found in the array.");
            }

            System.out.println("Enter 1 to continue searching, or any other number to stop");
            int option = scanner.nextInt();
            if (option != 1) {
                continueExecution = false;
            }
        }
        scanner.close();
    }

    /**
     * Implementa el algoritmo de búsqueda lineal.
     * Complejidad temporal: O(n) - donde n es el tamaño del array
     * 
     * @param numbers Array donde se realizará la búsqueda
     * @param target  Número a buscar
     * @return Índice donde se encuentra el número, -1 si no se encuentra
     */
    public static int linearSearch(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Implementa el algoritmo de búsqueda binaria.
     * Requiere que el array esté ordenado.
     * Complejidad temporal: O(log n) - donde n es el tamaño del array
     * 
     * @param numbers Array ordenado donde se realizará la búsqueda
     * @param target  Número a buscar
     * @return Índice donde se encuentra el número, -1 si no se encuentra
     */
    public static int binarySearch(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (numbers[mid] == target) {
                return mid;
            } else if (target < numbers[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}