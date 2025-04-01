package Misc;

import java.util.Scanner;

/**
 * Clase que calcula el promedio de números pares ingresados por el usuario.
 * El programa termina cuando se ingresa un número negativo.
 */
public class AverageEvenNumbers {

    /**
     * Método principal que ejecuta el programa.
     * Lee números desde la entrada estándar y calcula el promedio de los números
     * pares.
     * 
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float average;
        float sum = 0;
        float evenCount = 0;

        System.out.println("Enter numbers (negative number to finish):");
        float number = scanner.nextFloat();

        while (number >= 0) {
            if (number % 2 != 0) {
                number = scanner.nextFloat();
                continue;
            }

            evenCount++;
            sum += number;
            number = scanner.nextFloat();
        }

        if (evenCount > 0) {
            average = sum / evenCount;
            System.out.println("The average of even numbers is: " + average);
        } else {
            System.out.println("No positive even numbers were entered.");
        }

        scanner.close();
    }
}