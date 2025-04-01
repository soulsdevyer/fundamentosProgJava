package Misc;

import java.util.Scanner;

/**
 * Clase que encuentra y muestra todos los números primos hasta un límite
 * especificado por el usuario.
 */
public class FindPrimesToN {

    /**
     * Método principal que solicita un límite y encuentra los números primos hasta
     * ese valor.
     * 
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the upper limit to find prime numbers:");
        int limit = scanner.nextInt();

        // Itera desde 2 hasta el límite para encontrar números primos
        for (int number = 2; number <= limit; number++) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }

        scanner.close(); // Cierra el scanner después de su uso
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
            return false; // Los números menores o iguales a 1 no son primos
        }

        // Optimización: Solo verifica hasta la raíz cuadrada del número
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Si es divisible por otro número, no es primo
            }
        }

        return true; // Si no se encontró divisor, es primo
    }
}