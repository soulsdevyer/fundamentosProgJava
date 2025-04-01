package Misc;

import java.util.Scanner;

/**
 * Clase que encuentra y muestra los primeros N números primos.
 * Implementa dos métodos de verificación de primalidad.
 */
public class FindNPrimes {

    /**
     * Método principal que solicita la cantidad de números primos a encontrar.
     * 
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of prime numbers to find:");
        int limit = scanner.nextInt();
        int count = 0;

        for (int number = 2; count < limit; number++) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
        }

        scanner.close();
    }

    /**
     * Verifica si un número es primo.
     * Un número primo es aquel que solo es divisible por 1 y por sí mismo.
     * 
     * @param number Número a verificar
     * @return true si el número es primo, false en caso contrario
     */
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        // Versión optimizada usando la raíz cuadrada
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}